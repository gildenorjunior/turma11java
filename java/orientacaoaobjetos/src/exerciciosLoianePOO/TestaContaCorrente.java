package exerciciosLoianePOO;

public class TestaContaCorrente {

	public static void main(String[] args) {
		
		ContaCorrente conta1 = new ContaCorrente();
		
		conta1.setNumeroConta(0001);
		conta1.setEspecial(false);
		conta1.setSaldo(1000);
		conta1.setLimite(2000);
		
		System.out.println("Número da conta: " + conta1.getNumeroConta());
		conta1.consultaEspecial(true);
		System.out.println("Saldo atual da conta: " + conta1.getSaldo());
		System.out.println("Limite atual da conta: " + conta1.getLimite());
		
		System.out.println();
		
		
		conta1.depositar(300);
		conta1.consultarSaldo();
		conta1.saque(50);
		conta1.consultarSaldo();
		conta1.depositar(50);
		conta1.consultarSaldo();
	}

}
