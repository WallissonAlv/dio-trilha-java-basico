package collectionsjavaapi.MainJava.List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	//ATRIBUTOS
	private List<Numeros> listaNumeros ;

	// MÉTODOS
	public SomaNumeros() {
		this.listaNumeros = new ArrayList<>();
	}
	public void adicionarNumero(int numero) {
		listaNumeros.add(new Numeros(numero));
	}
	public void calcularSoma() {
		double total = 0;
		for(Numeros n : listaNumeros) {
			total += n.getNumeros();
		}
		System.out.println("A soma dos números é: R$"+ total);
	}
	public void encontrarMaiorNumero() {
		List<Numeros> maiorNumero = new ArrayList<>();
		int maiorAtual = 0;
		if(!listaNumeros.isEmpty()) {
			for(Numeros n : listaNumeros) {
				if(n.getNumeros() > maiorAtual) {
					maiorNumero.add(n);
					maiorAtual = n.getNumeros();
				}
			}
		}
		System.out.println("Maior número da lista é: "+ maiorAtual);
	}
	
	public void exibirNumeros() {
		System.out.println(listaNumeros);
	}
	// GETTERS AND SETTERS
	
	// AREA DE TESTES
	public static void main(String[] args) {
		SomaNumeros test = new SomaNumeros();
		
		test.adicionarNumero(10);
		test.adicionarNumero(50);
		test.adicionarNumero(100);
		test.adicionarNumero(500);
		test.adicionarNumero(1000);
		
		test.calcularSoma();
		
		test.encontrarMaiorNumero();
		
		test.exibirNumeros();
	}
}
