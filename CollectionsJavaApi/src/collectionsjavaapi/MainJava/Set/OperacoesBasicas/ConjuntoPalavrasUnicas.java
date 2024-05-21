package collectionsjavaapi.MainJava.Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	
	private Set<PalavraUnica> palavraSet;

	public ConjuntoPalavrasUnicas() {
		this.palavraSet = new HashSet<>();
	}
	
	public void adicionarPalavra(String palavra) {
		palavraSet.add(new PalavraUnica(palavra));
	}
	public void removerPalavra(String palavra) {
		PalavraUnica palavraParaRemover = null;
		for(PalavraUnica pu : palavraSet) {
			if(pu.getPalavra().equalsIgnoreCase(palavra)) {
				palavraParaRemover = pu;
				break;
			}
		}
		palavraSet.remove(palavraParaRemover);
	}
	public void verificarPalavra(String palavra) {
		boolean palavraVerificada = false;
		for(PalavraUnica pu : palavraSet) {
			if(pu.getPalavra().equalsIgnoreCase(palavra)) {
				palavraVerificada = true;
				break;
			}
		}
		if(palavraVerificada) {
			System.out.println("Esta palavra está no conjunto");
		}else {
			System.out.println("Esta palavra não está no conjunto");
		}
	}
	public void exibirPalavrasUnica(){
		System.out.println(palavraSet);
	}
	
	public static void main(String [] args) {
		ConjuntoPalavrasUnicas cpu = new ConjuntoPalavrasUnicas();
		
		cpu.adicionarPalavra("Fish");
		cpu.adicionarPalavra("Ball");
		cpu.adicionarPalavra("Cat");
		cpu.adicionarPalavra("Car");
		cpu.adicionarPalavra("Street");
		cpu.adicionarPalavra("Building");
		cpu.adicionarPalavra("Opala");
		
		cpu.removerPalavra("Ball");
		cpu.exibirPalavrasUnica();
		
		cpu.verificarPalavra("Wallace");
	}
}
