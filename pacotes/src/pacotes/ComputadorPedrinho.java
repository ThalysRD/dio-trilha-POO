package pacotes;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		MSNMenssenger msn = new 	MSNMenssenger();
		
			msn.enviarMensagem();
		
			msn.receberMensagem();
			
			FacebookMessenger fb = new FacebookMessenger();
			fb.enviarMensagem();
			fb.receberMensagem();
			
			Telegram tlg = new Telegram();
			tlg.enviarMensagem();
			tlg.receberMensagem();
		}
}
