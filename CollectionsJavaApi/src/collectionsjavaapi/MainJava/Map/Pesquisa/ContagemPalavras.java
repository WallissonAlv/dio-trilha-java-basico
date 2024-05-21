package collectionsjavaapi.MainJava.Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

	// ATRIBUTOS
	private Map<String, Integer> palavraMap;

	// MÉTODOS
	public ContagemPalavras() {
		this.palavraMap = new HashMap<>();
	}
	public void adicionarPalavra(String palavra, Integer contagem) {
		palavraMap.put(palavra, contagem);
	}
	public void removerPalavra(String palavra) {
		if(!palavraMap.isEmpty()) {
			palavraMap.remove(palavra);
		}
	}
	public void exibirContagemPalavras() {
		if(!palavraMap.isEmpty()) {
			System.out.println(palavraMap);
		} 
	}
	/*public Palavra encontrarPalavraMaisFrequente() {
		Palavra palavraMaisFrequente = null;
		int palavraMaisRepetida = 0;
		if(!palavraMap.isEmpty()) {
			for(Palavra p : palavraMap.values()) {
				if(p.getContagem() > palavraMaisRepetida) {
					palavraMaisFrequente = p;
				}
			}
		}
		return palavraMaisFrequente;
	}*/
	
	// AREA PARA TESTE
	public static void main(String[] args) {
		ContagemPalavras cp = new ContagemPalavras();
		
		cp.adicionarPalavra("Aprender", 19);
		cp.adicionarPalavra("Boicote", 22);
		cp.adicionarPalavra("Deus", 50);
		cp.adicionarPalavra("Jesus", 80);
		cp.adicionarPalavra("Yahweh", 123);
		cp.removerPalavra("Boicote");
		cp.exibirContagemPalavras();
		
		//cp.encontrarPalavraMaisFrequente();
		
	}
}
