import java.util.List;

public class Banco {

	private String nome;
	protected List<Conta> contas;

	public void listaDeClientes() {
		System.out.println(contas);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Conta> getContas() {
		return contas;
	}
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
}
