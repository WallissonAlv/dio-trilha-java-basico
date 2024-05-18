package collectionsjavaapi.MainJava.List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	
	// ATRIBUTOS
	private List<Livro> livroList;

	// MÉTODOS
	public CatalogoLivros() {
		this.livroList = new ArrayList<>();
	}
	public void adicionarLivro(String titulo, String autor, int anoFabricacao) {
		livroList.add(new Livro(titulo, autor, anoFabricacao));
	}
	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livrosPorAutor = new ArrayList<>();
		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
		}
		return livrosPorAutor;
	}
	public List<Livro> pesquisarPorIntervaloAno(int anoInicial, int anoFinal){
		List<Livro> livrosPorIntervaloAno = new ArrayList<>();
		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getAnoFabricacao()>= anoInicial && l.getAnoFabricacao()<= anoFinal) {
					livrosPorIntervaloAno.add(l);
				}
			}
		}
		return livrosPorIntervaloAno;
	}
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
					break;
				}
			}
		}
		return livroPorTitulo;
	}
	// GETTERS AND SETTERS
	
	// ÁREA DE TESTE
	public static void main(String[] args) {
		CatalogoLivros c = new CatalogoLivros();
		
		c.adicionarLivro("Livro1", "Autor1", 2020);
		c.adicionarLivro("Livro1", "Autor2", 2021);
		c.adicionarLivro("Livro2", "Autor2", 2022);
		c.adicionarLivro("Livro3", "Autor3", 2023);
		c.adicionarLivro("Livro4", "Autor4", 1994);
	
		System.out.println(c.pesquisarPorTitulo("Livro1"));
	}
}
