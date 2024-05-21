package collectionsjavaapi.MainJava.Set.OperacoesBasicas;

import java.util.Objects;

public class PalavraUnica {

	// ATRIBUTOS 
	private String Palavra;

	
	public PalavraUnica(String palavra) {
		Palavra = palavra;
	}
	

	public String getPalavra() {
		return Palavra;
	}
	
	public void setPalavra(String palavra) {
		Palavra = palavra;
	}


	@Override
	public int hashCode() {
		return Objects.hash(Palavra);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PalavraUnica other = (PalavraUnica) obj;
		return Objects.equals(Palavra, other.Palavra);
	}


	@Override
	public String toString() {
		return "Palavra:" + Palavra + "\n";
	}
	
	
}
