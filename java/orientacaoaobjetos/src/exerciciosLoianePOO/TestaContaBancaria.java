package exerciciosLoianePOO;

public class TestaContaBancaria {

	public static void main(String[] args) {
		
		ContaEspecial novaConta = new ContaEspecial("Cliente conta Especial", "123", 50);
		
		
		System.out.println(novaConta);
		novaConta.depositar(100);
		

		realizarSaque(novaConta, 70);
		realizarSaque(novaConta, 50);
		realizarSaque(novaConta, 80);
		
		System.out.println(novaConta);
		 
		/*
		if (novaConta.calcularNovoSaldo(0.5)) {
			System.out.println("Novo rendimento aplicado, novo saldo: " + novaConta.getSaldo());
		} else {
			System.out.println("Hoje não é dia de rendimento, novo saldo não calculado!");
		}
		*/ 
		

	}
	
	private static void realizarSaque(ContaBancaria conta, double valor) {
		if (conta.sacar(valor)) {
			System.out.println("Saque efetuado com sucesso, novo saldo: " + conta.getSaldo()) ;
		} else {
			System.out.println("Saldo insuficiente para saque!");
		}
	}

}
