
public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("--- Extrato Conta Poupança ---");
		super.imprimirInfosComuns();
	}

	@Override
	public String toString() {
		return "ContaPoupanca [agencia=" + agencia + ", numero=" + numero + ", cliente=" + cliente + "]";
	}
	
}