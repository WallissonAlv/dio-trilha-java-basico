
public class Main {

	public static void main(String[] args) {
		
		Cliente wallisson = new Cliente("Wallisson", "12345678911", "04/02/2002"); 
		Cliente estefane = new Cliente("Estefane", "98765432112", "30/12/2006"); 
		
		Conta cc = new ContaCorrente(wallisson);
		Conta cp = new ContaPoupanca(estefane);
		
		/*cc.depositar(3000);
		cc.transferir(500, cp);*/
		
		cc.imprimirInfosComuns();
		cp.imprimirInfosComuns();
	}

}
