package collectionsjavaapi.MainJava.Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

	// ATRIBUTOS
	private Map<Long, Produto> estoqueProdutosMap;

	
	// MÉTODOS
	public EstoqueProdutos() {
		this.estoqueProdutosMap = new HashMap<>();
	}
	
	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		estoqueProdutosMap.put(cod, new Produto(nome,preco,quantidade));
	}
	public void exibirProdutos() {
		System.out.println(estoqueProdutosMap);
	}
	public double calcularValorTotalEstoque() {
		double valorTotalEstoque = 0;
		if(!estoqueProdutosMap.isEmpty()) {
			for(Produto p : estoqueProdutosMap.values()) {
				valorTotalEstoque += p.getQuantidade()*p.getPreco();
			}
		}
		return valorTotalEstoque;
	}
	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		if(!estoqueProdutosMap.isEmpty()) {
			for(Produto p : estoqueProdutosMap.values()) {
				if(p.getPreco() > maiorPreco) {
					produtoMaisCaro = p;
				}
			}
		}
		return produtoMaisCaro;
	}
	public Produto obterProdutoMaisBarato() {
		Produto produtoMaisBarato = null;
		double menorPreco = Double.MAX_VALUE;
		if(!estoqueProdutosMap.isEmpty()) {
			for(Produto p : estoqueProdutosMap.values()) {
				if(p.getPreco() < menorPreco) {
					produtoMaisBarato = p;
					menorPreco = p.getPreco();
				}
			}
		}
		return produtoMaisBarato;
	}

	public static void main(String[] args) {
		EstoqueProdutos ep = new EstoqueProdutos();
		
		ep.adicionarProduto(1L, "Produto A", 5.0, 10);
		ep.adicionarProduto(2L, "Produto B", 10.0, 5);
		ep.adicionarProduto(3L, "produto C", 15.0, 2);
		ep.adicionarProduto(8L, "Produto D", 20, 2);
		ep.exibirProdutos();
		
		System.out.println("Valor Total do estoque: R$"+ep.calcularValorTotalEstoque());
		System.out.println("Produto mais Caro: "+ep.obterProdutoMaisCaro());
		System.out.println("Produto mais Barato: "+ep.obterProdutoMaisBarato());
		
	}
}
