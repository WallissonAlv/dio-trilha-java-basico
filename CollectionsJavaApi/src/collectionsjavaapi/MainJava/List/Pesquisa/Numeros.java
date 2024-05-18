package collectionsjavaapi.MainJava.List.Pesquisa;

public class Numeros {
	
	// ATRIBUTOS
	private int numeros;
	
	// METODOS
	public Numeros(int numeros) {
		super();
		this.numeros = numeros;
	}

	// GETTERS AND SETTERS
	public int getNumeros() {
		return numeros;
	}
	public void setNumeros(int numeros) {
		this.numeros = numeros;
	}

	@Override
	public String toString() {
		return "- Numeros= " +numeros+ "\n";
	}
	
}
