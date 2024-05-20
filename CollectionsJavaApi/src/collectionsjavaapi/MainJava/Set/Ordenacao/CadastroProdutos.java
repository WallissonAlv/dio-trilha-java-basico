package collectionsjavaapi.MainJava.Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

	private Set<Produto> produtoSet;

	public CadastroProdutos() {
		this.produtoSet = new HashSet<>();
	}
	public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
		produtoSet.add(new Produto(codigo,nome,preco,quantidade));
	}
	public Set<Produto> exibirProdutosPorNome() {
		Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
		return produtosPorNome;
	}
	
	public Set<Produto> exibirProdutosPorPreco(){
		Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtosPorPreco.addAll(produtoSet);
		return produtosPorPreco;
	}
	
	public static void main(String[] args) {
		CadastroProdutos cp = new CadastroProdutos();
		
		cp.adicionarProduto(1l, "Produto 5", 10 , 5);
		cp.adicionarProduto(2l, "Produto 6", 20, 10);
		cp.adicionarProduto(5l, "Produto 7", 30, 2);
		cp.adicionarProduto(9l, "Produto 9", 40, 3);
		
		//System.out.println(cp.produtoSet);
		
		//System.out.println(cp.exibirProdutosPorNome());
		
		System.out.println(cp.exibirProdutosPorPreco());
	}
}

