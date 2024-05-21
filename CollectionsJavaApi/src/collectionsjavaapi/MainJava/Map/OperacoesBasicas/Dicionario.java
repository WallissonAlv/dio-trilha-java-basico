package collectionsjavaapi.MainJava.Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
	
	// ATRIBUTOS
	private Map<String, String> dicionarioMap;

	// MÉTODOS
	public Dicionario() {
		this.dicionarioMap = new HashMap<>();
	}
	public void adicionarPalavra(String palavra, String definicao) {
		dicionarioMap.put(palavra, definicao);
	}
	public void removerPalavra(String palavra) {
		if(!dicionarioMap.isEmpty()) {
			dicionarioMap.remove(palavra);
		}
	}
	public void exibirPalavras() {
		System.out.println(dicionarioMap);
	}
	public String pesquisarPalavra(String palavra) {
		String palavraPesquisada = null;
		if(!dicionarioMap.isEmpty()) {
			palavraPesquisada = dicionarioMap.get(palavra);
		}
		return palavraPesquisada;
	}
	
	// AREA DE TESTES
	
	public static void main(String[] args) {
		Dicionario d = new Dicionario();
		
		d.adicionarPalavra("List", "Lista de Compras");
		d.adicionarPalavra("Set", "Caixa de brinquedos onde só se guarda um brinquedo de cada tipo");
		d.adicionarPalavra("Map", "Agenda de contatos, busco o nome e retorna o número");
		d.exibirPalavras();
		
		d.removerPalavra("List");
		d.exibirPalavras();
		
		System.out.println("A definição é: "+d.pesquisarPalavra("Map"));
	}
}
