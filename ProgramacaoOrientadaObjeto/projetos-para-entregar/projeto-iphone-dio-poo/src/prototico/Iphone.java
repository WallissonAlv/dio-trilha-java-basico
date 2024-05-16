package prototico;

import aparelhobase.AparelhoTelefonico;
import navegadorbase.NavegadorWeb;
import reprodutorbase.ReprodutorMusical;

public class Iphone implements NavegadorWeb, AparelhoTelefonico, ReprodutorMusical {
	
	// ATRIBUTOS -----------------------------
	
	// METODOS -------------------------------
	public void tocar() {
		System.out.println("Iphone está tocando uma música no App Ipod...");
	}
	public void pausar() {
		System.out.println("Iphone pausou a música do App Ipod...");
	}
	public void selecionarMusica() {
		System.out.println("Iphone abre lista de músicas em App Ipod...");
	}
	public void ligar() {
		System.out.println("Iphone está chamando número digitado...");
	}
	public void atender() {
		System.out.println("Iphone está atendendo chamada de voz...");
	}
	public void iniciarCorreioVoz() {
		System.out.println("Iphone está gravando voz para caixa postal...");
	}
	public void exibirPagina() {
		System.out.println("Iphone está exibindo página na Web pelo App Safari...");
	}
	public void adicionarNovaAba() {
		System.out.println("Iphone está adicionando nova Aba no App Safari...");
	}
	public void atualizarPagina() {
		System.out.println("Iphone está atualizando página pelo App Safari...");
	}
	
	// GETTERS AND SETTERS ----------------------
}
