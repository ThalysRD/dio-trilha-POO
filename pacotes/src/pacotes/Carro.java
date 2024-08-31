package pacotes;

public class Carro {
	public void ligar() {
		System.out.println("CARRO LIGADO");
		confereCambio();
		confereCombustivel();
	}
	
	private void confereCombustivel() {
		System.out.println("Conferindo combustível ");
	}
	
	private void confereCambio() {
		System.out.println("Conferindo câmbio");
	}
}
