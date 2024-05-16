package projetofinal;

import aparelhobase.Telefone;
import navegadorbase.Macintosh1984;
import prototico.Iphone;
import reprodutorbase.Ipod;

public class ProjetoFinal {

	public static void main(String[] args) {
		
		Iphone iphone1 = new Iphone();
		
		iphone1.tocar();
		iphone1.pausar();
		iphone1.selecionarMusica();
		iphone1.ligar();
		iphone1.atender();
		iphone1.iniciarCorreioVoz();
		iphone1.exibirPagina();
		iphone1.atualizarPagina();
		iphone1.adicionarNovaAba();
	}

}
