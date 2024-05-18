package collectionsjavaapi.MainJava.List.operacoesbasicas;

public class MeuPlano {

	public static void main(String[] args) {
		ListaTarefa listaTarefa = new ListaTarefa();
		System.out.println("O número total de elementos na lista é "+listaTarefa.obterNumeroTotalTarefas());
	
		listaTarefa.adicionarTarefa("Tarefa 01");
		listaTarefa.adicionarTarefa("Tarefa 01");
		listaTarefa.adicionarTarefa("Tarefa 03");
		System.out.println("O número total de elementos na lista é "+listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.removerTarefa("Tarefa 01");
		System.out.println("O número total de elementos na lista é "+listaTarefa.obterNumeroTotalTarefas());

		listaTarefa.obterDescricoesTarefas();
	}
}
