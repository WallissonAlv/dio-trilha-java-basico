package collectionsjavaapi.MainJava.Set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Aluno {
	
	// ATRIBUTO
	private String nome;
	private String matricula;
	private double nota;
	
	// MÉTODOS
	public Aluno(String nome, String matricula, double nota) {
		this.nome = nome;
		this.matricula = matricula;
		this.nota = nota;
	}
	
	// GETTERS | SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}

	// OVERRIDE
	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(matricula, other.matricula);
	}

	@Override
	public String toString() {
		return "Aluno=" + nome + " | matricula=" + matricula + " | nota=" + nota + "\n";
	}
}
class ComparatorPorNota implements Comparator<Aluno>{
	@Override
	public int compare(Aluno a1, Aluno a2) {
		return Double.compare(a1.getNota(), a2.getNota());
	}
}
class ComparatorPorNome implements Comparator<Aluno> {

	@Override
	public int compare(Aluno a1, Aluno a2) {
		return a1.getNome().compareTo(a2.getNome());
	}
	
}