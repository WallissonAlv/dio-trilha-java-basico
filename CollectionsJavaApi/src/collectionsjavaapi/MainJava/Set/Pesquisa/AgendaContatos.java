package collectionsjavaapi.MainJava.Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

	private Set<Contato> contatoSet;

	public AgendaContatos() {
		this.contatoSet = new HashSet<>();
	}
	
	public void adicionarContato(String nome, float numero) {
		contatoSet.add(new Contato(nome,numero));
	}
	public void exibirContato() {
		System.out.println(contatoSet);
	}
	public Set<Contato> pesquisarPorNome(String nome){
		Set<Contato> contatosPorNome = new HashSet<>();
		for(Contato c : contatoSet) {
			if(c.getNome().startsWith(nome)) {
				contatosPorNome.add(c);
			}
		}
		return contatosPorNome;
	}
	public Contato atualizarNumeroContato(String nome, float novoNumero) {
		Contato contatoAtualizado = null;
		for(Contato c : contatoSet) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(novoNumero);
				contatoAtualizado = c;
				break;
			}
		}
		return contatoAtualizado;
	}
	public static void main(String[] args) {
		
		AgendaContatos ac = new AgendaContatos();
		
		ac.adicionarContato("Wallisson", 52546);
		ac.adicionarContato("Wallace", 48456);
		ac.adicionarContato("Ingred", 88846);
		ac.adicionarContato("Paula", 51234);
		ac.adicionarContato("Harry", 87954);
		
	
		
		System.out.println(ac.pesquisarPorNome("Ingred"));
		
		System.out.println("Contato atualizado: "+ac.atualizarNumeroContato("Ingred", 55555));
		ac.exibirContato();
	}
}
