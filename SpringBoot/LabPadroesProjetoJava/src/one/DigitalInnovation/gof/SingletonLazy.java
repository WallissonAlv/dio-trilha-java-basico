package one.DigitalInnovation.gof;

/*
 * Singleton "Preguiçoso",
 * 
 * @author WallissonAlvesDev
 * */

public class SingletonLazy {

	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if(instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}
