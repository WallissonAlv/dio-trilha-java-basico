package apps;

public class MSNMessenger extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando Mensagem, Padrão MSN");
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo Mensagem, Padrão MSN");
	}
	
}