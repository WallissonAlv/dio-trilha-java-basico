
public abstract class Conta extends Banco implements IConta{

	private static int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	private Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	@Override
	public void sacar(double valor) {
		this.saldo = saldo - valor;
		System.out.println("Saque de R$"+valor+" realizado com sucesso!");
	}
	@Override
	public void depositar(double valor) {
		this.saldo = saldo + valor;
		System.out.println("Deposito de R$"+valor+" realizado com sucesso!");
	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		System.out.println("Transferencia realizada com sucesso, valor de R$ "+valor+" evniado para conta destino.");
	}
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	protected void imprimirInfosComuns() {
		System.out.println("==============================");
		System.out.println("=== EXTRATO CONTA POUPANCA ===");
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("CPF: %s", this.cliente.getCpf()));
		System.out.println(String.format("Data de Nascimento: %s", this.cliente.getDataNascimento()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println("==============================");
	}
}
