package collectionsjavaapi.MainJava.List.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
	// ATRIBUTOS -------------------------------
	private List<Item> carrinhoCompras;
	
	// MÉTODOS ---------------------------------
	public CarrinhoCompras() {
		this.carrinhoCompras = new ArrayList<>();
	}
	public void adicionarItem(String nome, double preco, int quantidade) {
		carrinhoCompras.add(new Item(nome, preco, quantidade));
	}
	public void removerItem(String nome) {
		List<Item> comprasParaRemover = new ArrayList<>();
		for (Item c : carrinhoCompras) {
			if (c.getNome().equalsIgnoreCase(nome)) {
				comprasParaRemover.add(c);
			}
		}
		carrinhoCompras.removeAll(comprasParaRemover);
	}
	public void calcularValorTotal() {
		double total = 0;
		for (Item i : carrinhoCompras) {
			total += i.getPreco()*i.getQuantidade();
		}
		System.out.println("O total do carrinho é: R$"+total);
	}
	public void exibirItens() {
		System.out.println(carrinhoCompras);
	}
	
	// GETTERS AND SETTERS ---------------------
	
	// ÁREA PARA TESTES ------------------------
	public static void main(String [] args) {
		CarrinhoCompras carrinho = new CarrinhoCompras();
		
		carrinho.adicionarItem("Violao", 100.00 , 1);
		carrinho.adicionarItem("Teclado", 100.00 , 1);
		carrinho.adicionarItem("Guitarra", 500.00 , 5);
		carrinho.exibirItens();
		
		carrinho.removerItem("Violao");
		carrinho.exibirItens();
		
		carrinho.calcularValorTotal();
	}
}
