package collectionsjavaapi.MainJava.Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
	
	// ATRIBUTOS
	private Set<Aluno> alunoSet;

	// MÉTODOS
	public GerenciadorAlunos() {
		this.alunoSet = new HashSet<>();
	}
	public void adicionarAluno(String nome, String matricula, double nota) {
		alunoSet.add(new Aluno(nome,matricula,nota));
	}
	public void removerAluno(String matricula) {
		Aluno alunoParaRemover = null;
		for(Aluno a : alunoSet) {
			if(a.getMatricula().equalsIgnoreCase(matricula)) {
				 alunoParaRemover = a;
				 break;
			}
		}
		alunoSet.remove(alunoParaRemover);
	}
	public Set<Aluno> exibirAlunosPorNome() {
		Set<Aluno> alunosPorNome = new TreeSet<>(new ComparatorPorNome());
		alunosPorNome.addAll(alunoSet);
		return alunosPorNome;
	}
	public Set<Aluno> exibirAlunosPorNota() {
		Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
		alunosPorNota.addAll(alunoSet);
		return alunosPorNota;
	}
	public void exibirAlunos() {
		System.out.println(alunoSet);
	}
	
	// AREA DE TESTES
	
	public static void main(String[] args) {
		GerenciadorAlunos ga = new GerenciadorAlunos();
		
		ga.adicionarAluno("Wallisson", "1011B123", 9);
		ga.adicionarAluno("Nauyra", "1012C142", 10);
		ga.adicionarAluno("Abner", "1011B475", 8);
		ga.adicionarAluno("Wallace", "1011C545", 7);
		ga.adicionarAluno("Paula", "1012C566", 4);
		ga.adicionarAluno("Estefane", "1012E222",7);
		
		ga.removerAluno("1011B475");
		
		System.out.println(ga.exibirAlunosPorNome());
		System.out.println(ga.exibirAlunosPorNota());
	}
}
