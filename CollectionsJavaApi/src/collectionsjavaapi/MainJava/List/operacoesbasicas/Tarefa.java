package collectionsjavaapi.MainJava.List.operacoesbasicas;

public class Tarefa {
	
	// ATRIBUTOS ------------------------
	private String descricao;

	// MÉTODOS --------------------------
	public Tarefa(String descricao) {
		this.descricao = descricao;
	}	
	
	// GETTERS AND SETTERS --------------
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Descricao: " + descricao;
	}
	
}
