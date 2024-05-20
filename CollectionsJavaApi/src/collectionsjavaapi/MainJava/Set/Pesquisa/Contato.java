package collectionsjavaapi.MainJava.Set.Pesquisa;

import java.util.Objects;

public class Contato {
	
	private String nome;
	private float numero;
	
	public Contato(String nome, float numero) {
		this.nome = nome;
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getNumero() {
		return numero;
	}
	public void setNumero(float numero) {
		this.numero = numero;
	}

	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(getNome());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		return Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Nome=" + nome + ", numero=" + numero + "\n";
	}

}
