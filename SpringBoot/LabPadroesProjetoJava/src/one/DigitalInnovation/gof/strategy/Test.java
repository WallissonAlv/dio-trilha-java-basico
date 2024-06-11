package one.digitalinnovation.gof.strategy;

public class Test {

	public static void main(String[] args) {

		// Strategy
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		Comportamento defensivo = new ComportamentoDefensivo();
		
		Robo rob = new Robo();
		
		rob.setComportamento(normal);
		rob.mover();
		rob.mover();
		
		rob.setComportamento(agressivo);
		rob.mover();
		rob.mover();
		
		rob.setComportamento(defensivo);
		rob.mover();
		rob.mover();
		
	}

}
