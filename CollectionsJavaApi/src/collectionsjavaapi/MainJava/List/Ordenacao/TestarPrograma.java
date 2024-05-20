package collectionsjavaapi.MainJava.List.Ordenacao;

public class TestarPrograma {

	public static void main(String[] args) {
		
		OrdenacaoPessoa op = new OrdenacaoPessoa();
		
		op.adicionarPessoa("Wallisson", 22, 1.60);
		op.adicionarPessoa("Nauyra", 30, 1.59);
		op.adicionarPessoa("Wallace", 42, 1.62);
		op.adicionarPessoa("Nielsen", 32, 1.88);
		op.adicionarPessoa("Paula", 36, 1.59);
		
		//System.out.println(op.ordenarPorIdade());
		System.out.println(op.ordenarPorAltura());
	}

}
