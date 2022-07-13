import java.util.List;
import java.util.ArrayList;

public class Banco {
	private String nome;
	private static List<Conta> contas = new ArrayList<Conta>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void imprimirListaDeClientes() {
		System.out.println("--- Lista de clientes ---");
		for(Conta conta : contas) {
			System.out.println(conta);
		}
	}
	
	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}
}
