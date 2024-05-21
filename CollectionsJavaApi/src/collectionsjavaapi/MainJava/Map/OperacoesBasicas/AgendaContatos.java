package collectionsjavaapi.MainJava.Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

	// ATRIBUTOS
	private Map<String, Integer>agendaContatoMap;

	// MÉTODOS
	public AgendaContatos() {
		this.agendaContatoMap = new HashMap<>();
	}
	public void adicionarContato(String nome, Integer telefone) {
		agendaContatoMap.put(nome, telefone);
	}
	public void removerContato(String nome) {
		if(!agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome);
		}
	}
	public void exibirContato() {
		System.out.println(agendaContatoMap);
	}
	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null;
		if(!agendaContatoMap.isEmpty()) {
			numeroPorNome = agendaContatoMap.get(nome);
		}
		return numeroPorNome;
	}
	public static void main(String[] args) {
		AgendaContatos ac = new AgendaContatos();
		
		ac.adicionarContato("Camila", 123456);
		ac.adicionarContato("Camila", 5665);
		ac.adicionarContato("Camila Cavalcante", 1111111);
		ac.adicionarContato("Camila DIO", 654987);
		ac.adicionarContato("Maria Silva", 1111111);
		ac.adicionarContato("Camila", 44444);
		ac.exibirContato();
		
		ac.removerContato("Maria Silva");
		ac.exibirContato();
		
		System.out.println("O número é: "+ac.pesquisarPorNome("Camila DIO"));
	}
		
}
