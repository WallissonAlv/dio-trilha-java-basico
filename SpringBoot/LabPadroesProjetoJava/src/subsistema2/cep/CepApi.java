package subsistema2.cep;

public class CepApi {

	private static CepApi instancia = new CepApi();
	
	private CepApi() {
		super();
	}
	
	public static CepApi getInstancia() {
		return instancia;
	}
	public String recuperarEstado(String cep) {
		return "SP";
	}
	public String recuperarCidade(String cep) {
		return "Mogi das Cruzes";
	}
}
