package aparelhobase;

public class Telefone implements AparelhoTelefonico {
	
	// ATRIBUTOS -----------------------------------------------
	
	// MÉTODOS -------------------------------------------------
	
	public void ligar() {
		System.out.println("Telefone iniciando chamada...");
	}
	public void atender() {
		System.out.println("Telefone atendendo chamada...");
	}
	public void iniciarCorreioVoz() {
		System.out.println("Telefone iniciando Correio de Voz...");
	}
	public void adicionarNovoNumero() {
		System.out.println("Telefone está adicionando novo Numero...");
	}
	public void mostrarFavoritos() {
		System.out.println("Telefone está mostrando na tela os contatos favoritos...");
	}
	public void mostrarRecentes() {
		System.out.println("Telefone está mostrando os contatos recentes...");
	}
	
	// GETTERS AND SETTERS -------------------------------------
}
