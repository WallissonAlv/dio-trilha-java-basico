package collectionsjavaapi.MainJava.Map.Pesquisa;

public class Palavra {

	// ATRIBUTOS
	private String palavra;
	private int contagem;
	
	// MÉTODOS
	public Palavra(String palavra, int contagem) {
		this.palavra = palavra;
		this.contagem = contagem;
	}

	// GETTER | SETTER
	public String getPalavra() {
		return palavra;
	}
	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	public int getContagem() {
		return contagem;
	}
	public void setContagem(int contagem) {
		this.contagem = contagem;
	}

	// OVERRIDE
	@Override
	public String toString() {
		return "Palavra: " + palavra + ", contagem=" + contagem + "\n";
	}
	
	
}
