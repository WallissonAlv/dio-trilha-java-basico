
public class Autodromo {
	public static void main(String[] args) {
		Carro jeep = new Carro();
		
		/* AQUI TEMOS O POLIMORFISMO, AMBOS POSSUEM A FUNÇÃO 
		DARPARTIDA MAS ELES FAZEM ESSE MÉTODO DE FORMA DIFERENTE*/
		
		jeep.setChassi("879878464");
		jeep.darPartida();
		
		Moto z400 = new Moto();
		z400.setChassi("645652541");
		z400.darPartida();
		
		Veiculo coringa = jeep;
		
		coringa.darPartida();
		
		
	}
}
