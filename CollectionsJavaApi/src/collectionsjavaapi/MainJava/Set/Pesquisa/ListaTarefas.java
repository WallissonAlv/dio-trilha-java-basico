package collectionsjavaapi.MainJava.Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

	// ATRIBUTOS
	private Set<Tarefa> tarefaSet;
	private Set<Tarefa> tarefaSetConcluidas;
	private Set<Tarefa> tarefaSetPendentes;

	// METODOS
	public ListaTarefas() {
		this.tarefaSet = new HashSet<>();
		this.tarefaSetConcluidas = new HashSet<>();
		this.tarefaSetPendentes = new HashSet<>();
	}
	
	// AQUI SÃO AS OPERACOES BÁSICAS DO SET
	public void adicionarTarefa(String descricao) {
		tarefaSet.add(new Tarefa(descricao, false));
	}
	public void removerTarefa(String descricao) {
		Tarefa tarefaParaRemover = null; // NULL PORQUE É UNICO 
		for(Tarefa t : tarefaSet) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefaParaRemover = t;
				break;
			}else {
				System.out.println("Esta tarefa não existe!");
			}
		}
		tarefaSet.remove(tarefaParaRemover);
	}
	public void exibirTarefas() {
		System.out.println(tarefaSet);
	}
	public void contarTarefas() {
		System.out.println(tarefaSet.size());
	}
	
	// AQUI SÃO AS OPERACOES DE PESQUISA DO SET
	public void marcarTarefaConcluida(String descricao) {
		Set<Tarefa> tarefaConcluida = new HashSet<>();
		for (Tarefa t : tarefaSet) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setTarefaConcluida(true);
				tarefaConcluida.add(t);
				break;
			}
		}
		tarefaSetConcluidas.addAll(tarefaConcluida);
	}
	public void obterTarefasConcluidas() {
		System.out.println(tarefaSetConcluidas);
	}
	public void marcarTarefaPendente(String descricao) {
		Set<Tarefa> tarefaPendente = new HashSet<>();
		for (Tarefa t : tarefaSet) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setTarefaConcluida(false);
				tarefaPendente.add(t);
				System.out.println(" OBS: "+t+" Está pendente!");
				break;
			}
		}
		tarefaSetPendentes.addAll(tarefaPendente);
	}
	public void obterTarefasPendentes() {
		System.out.println(tarefaSetPendentes);
	}
	public void limparListaTarefas() {
		tarefaSet.removeAll(tarefaSet);
	}

	public static void main(String[] args) {
		ListaTarefas lt = new ListaTarefas();
		
		lt.adicionarTarefa("Lavar Banheiro");
		lt.adicionarTarefa("Lavar os Pratos");
		lt.adicionarTarefa("Varrer Estoque");
		lt.adicionarTarefa("Tomar banho");
		lt.adicionarTarefa("Arrumar quarto");
		lt.adicionarTarefa("Bater a laje");
		
		lt.marcarTarefaConcluida("varrer estoque");
		
		lt.marcarTarefaPendente("Lavar banheiro");
		lt.marcarTarefaPendente("lavar os pratos");
		
		lt.exibirTarefas();
		lt.contarTarefas();
		lt.obterTarefasConcluidas();
		lt.obterTarefasPendentes();
		
		lt.limparListaTarefas();
		lt.exibirTarefas();
		lt.contarTarefas();
	}
}
