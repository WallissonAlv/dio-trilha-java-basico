package collectionsjavaapi.MainJava.List.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	// ATRIBUTOS ------------------------
	private List<Tarefa> tarefaList;

	// MÉTODOS --------------------------
	public ListaTarefa() {
		this.tarefaList = new ArrayList<>();
	}	
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		for (Tarefa t : tarefaList) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);
			}
		}
		tarefaList.removeAll(tarefasParaRemover);
		/* 18 - CRIEI UMA LISTA VAZIA PARA ARMAZENAR TODAS QUE SERÃO EXCLUIDAS
		 * 19 - VARRER TODA A LISTA "tarefaList"
		 * 20 - SE A DESCRIÇÃO DESTA TAREFA FOR IGUAL OUTRA QUE JÁ EXISTE
		 * 21 - ENTÃO ADICIONE ESTA TAREFA A NOVA LISTA PARA SER EXCLUIDAS TODAS JUNTAS
		 * 23 - ELIMINE TODOS OS ITENS DA "tarefaList" QUE ESTÃO NA "tarefaParaRemover" */
	}
	public int obterNumeroTotalTarefas() {
		return tarefaList.size();
	}
	public void obterDescricoesTarefas() {
		System.out.println(tarefaList);
	}
	// GETTERS AND SETTERS --------------
}
