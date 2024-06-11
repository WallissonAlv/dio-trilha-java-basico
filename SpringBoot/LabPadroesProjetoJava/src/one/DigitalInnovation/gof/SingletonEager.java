package one.DigitalInnovation.gof;

/*
 * Singleton "apressado",
 * 
 * @author WallissonAlvesDev
 * */

public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
