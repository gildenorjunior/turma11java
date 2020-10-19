package exerciciosLoianePOO;

public class ContaEspecial extends ContaBancaria{
	private int limite;

	
	
	public ContaEspecial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaEspecial(String nomeCliente, String numConta, int limite) {
		super(nomeCliente, numConta);
		this.limite = limite;
		// TODO Auto-generated constructor stub
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

	@Override
	public boolean sacar(double valor) {
		double saldoComLimite = this.getSaldo() + limite;
		
		if ((saldoComLimite - valor) >= 0) {
			this.setSaldo(this.getSaldo() - valor);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return  super.toString() + ", limite: " + limite + "]";
	}
	
	
	
}
