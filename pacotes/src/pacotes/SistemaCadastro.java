package pacotes;

public class SistemaCadastro {
	public static void main(String[] args) {
		Pessoa marcos = new Pessoa("Cpf", "Marcos");
		
		marcos.setEndereco("Rua das Marias");
		
		System.out.println(marcos.getNome() + "-" + marcos.getCpf());
	}
}
