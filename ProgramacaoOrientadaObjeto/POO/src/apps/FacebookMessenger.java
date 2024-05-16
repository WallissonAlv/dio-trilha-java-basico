package apps;

public class FacebookMessenger extends ServicoMensagemInstantanea  {
	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem, Padrão Facebook");
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo Mensagem, Padrão Facebook");
	}
	
}