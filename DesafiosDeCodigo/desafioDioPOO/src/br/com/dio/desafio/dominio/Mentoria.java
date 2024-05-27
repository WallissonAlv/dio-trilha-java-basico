package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
	
	private LocalDate data;
	
	
	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString() {
		return "Mentoria [titulo=" + getTitulo() + 
			   ", descricao=" + getDescricao() + 
			   ", data=" + data + "]";
	}
	
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	
	
	
}
