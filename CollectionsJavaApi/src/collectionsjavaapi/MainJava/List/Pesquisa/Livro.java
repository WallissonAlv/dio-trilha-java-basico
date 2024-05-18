package collectionsjavaapi.MainJava.List.Pesquisa;

public class Livro {
	// ATRIBUTOS --------------------------
	private String titulo;
	private String autor;
	private int anoFabricacao;
	
	// MÉTODOS ----------------------------
	public Livro(String titulo, String autor, int anoFabricacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoFabricacao = anoFabricacao;
	}
	// GETTERS AND SETTERS ----------------
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	@Override
	public String toString() {
		return "titulo=" + titulo + ", autor=" + autor + ", anoFabricacao=" + anoFabricacao + "\n";
	}
	
}
