package pacotes;

public class MSNMenssenger {
	public void enviarMensagem() {
		validarConexaoInternet();
		System.out.println("Enviar mensagem");
		salvarHistoricoMensagem();
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
	}
	
	private void validarConexaoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico de mensagem");
	}
}
