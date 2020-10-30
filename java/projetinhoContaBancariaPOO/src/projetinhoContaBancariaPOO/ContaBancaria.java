package projetinhoContaBancariaPOO;

public abstract class ContaBancaria {

	// atributos da classe
		private String nomeCliente;
		private int numConta;
		private double saldo;

		// construtor padrão
		public ContaBancaria() {

		}

		// construtor sobrecarga
		public ContaBancaria(String nomeCliente, int numConta) {
			this.nomeCliente = nomeCliente;
			this.numConta = numConta;
		}

		// métodos getters and setters
		public String getNomeCliente() {
			return nomeCliente;
		}

		public void setNomeCliente(String nomeCliente) {
			this.nomeCliente = nomeCliente;
		}

		public int getNumConta() {
			return numConta;
		}

		public void setNumConta(int numConta) {
			this.numConta = numConta;
		}

		public double getSaldo() {
			return saldo;
		}

		// método de Saque
		public double debite(double valorDebito) {

			if (this.saldo > 0 && valorDebito <= this.saldo) {
				if(((saldo - valorDebito) >= 0)) {
					this.saldo= (this.getSaldo() - valorDebito);
				}
			}
			return getSaldo();
		}

		// método de Crédito
		void credite(double valorCredito) {
			this.saldo += valorCredito;
		}
		
		//método extrato
		void extrato() {
			
		}

		
		
		
		
		


	
}
