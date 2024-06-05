package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

	private int cargaHoraria;
	
	public Curso() {

	}
	
	@Override
	public double calcularXp() {
		
		return XP_PADRAO * cargaHoraria;
	}
	@Override
	public String toString() {
		return "Curso=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "\n";
	}
	
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
}