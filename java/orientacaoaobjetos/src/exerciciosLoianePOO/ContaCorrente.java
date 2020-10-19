//Crie uma classe para representar uma conta corrente que possui um número, um saldo, um status que informa
//se ela é especial ou não, um limite.

package exerciciosLoianePOO;

public class ContaCorrente {

	private int numeroConta;
	private double saldo;
	private boolean especial;
	private double limite;
	
	//métodos getters and setters
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	
	//métodos criados
	public void consultaEspecial(boolean especial) {
		if (especial == true) {
			System.out.println("Sua conta é especial...");
		} else {
			System.out.println("Sua conta não é especial...");
		}
	}
	
	public void saque(double valorSaque) {
		if (this.saldo > 0 && valorSaque <= this.saldo) {
			saldo = saldo - valorSaque;
			System.out.println("Você sacou: " + valorSaque);
		}
	}
	
	public void depositar(int valorDeposito) {
		this.saldo = this.saldo + valorDeposito;
		System.out.println("Valor depositado: " + valorDeposito);
	}
	
	public double consultarSaldo() {
		System.out.println("Seu saldo atual é: " + this.saldo);
		return this.saldo;
	}
	
	
	
	
	
	
}
