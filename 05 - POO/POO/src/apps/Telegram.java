package apps;

public class Telegram extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando Mensagem, Padrão Telegram");
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo Mensagem, Padrão Telegram");
	}
	
}