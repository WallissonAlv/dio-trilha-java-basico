
/* AQUI EM BAIXO É A HERANÇA (O CARRO HERDA TODAS AS CARACTERISTICAS 
   DA CLASSE VEICULO, PORQUE TODOO CARRO É UMA VEICULO)*/
public class Carro extends Veiculo {
	
	// ==============================================
	// ISSO AQUI É O ENCAPSULAMENTO =================
	public void darPartida() {
		confereCambio();
		confereCombustivel();
		System.out.println("Carro Ligado");
	}
	// ==============================================
	private void confereCambio() {
		System.out.println("Confere o Cambio");
	}
	private void confereCombustivel() {
		System.out.println("conferindo o combustivel");
	}
}
