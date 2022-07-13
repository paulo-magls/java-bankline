
public class Main {

	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo");
		
		Conta contaCorrente = new ContaCorrente(paulo);
		contaCorrente.depositar(100);
		
		Conta contaPoupanca = new ContaPoupanca(paulo);
		
		contaCorrente.transferir(50, contaPoupanca);
		
		contaCorrente.imprimirExtrato();
		contaPoupanca.imprimirExtrato();
		
		
		Banco banco = new Banco();
		banco.adicionarConta(contaCorrente);
		banco.adicionarConta(contaPoupanca);
		banco.imprimirListaDeClientes();
	}

}