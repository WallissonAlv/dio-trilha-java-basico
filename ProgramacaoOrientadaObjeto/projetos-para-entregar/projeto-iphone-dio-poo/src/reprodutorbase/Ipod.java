package reprodutorbase;

public class Ipod implements ReprodutorMusical{
	// ATRIBUTOS ------------------------------
	
	// MÉTODOS --------------------------------
	public void tocar() {
		System.out.println("Ipod está tocando música...");
	}
	public void pausar() {
		System.out.println("Ipod pausou a música...");
	}
	public void selecionarMusica() {
		System.out.println("Ipod mostrando lista de músicas disponíveis...");
	}
	public void tirarFoto() {
		System.out.println("Ipod está pronto para tirar fotos...");
	}
	public void gravarVideo() {
		System.out.println("Ipod está pronto para gravar vídeo...");
	}
	public void gravarAudio() {
		System.out.println("Ipod está com gravador de voz ativado...");
	}
	
	// GETTERS AND SETTERS --------------------
}
