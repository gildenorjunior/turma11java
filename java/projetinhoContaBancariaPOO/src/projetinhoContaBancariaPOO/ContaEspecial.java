package projetinhoContaBancariaPOO;

public class ContaEspecial extends ContaCorrente{
	
	
	//atributos
	private double limite;

	//construtor padrão
	public ContaEspecial() {
	}
	
	
	//contrutor
	public ContaEspecial(String nomeCliente, int numConta, int talonario, double limite) {
		super(nomeCliente, numConta, talonario);
		this.limite = limite;
	}

	//métodos getters and setters
	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
	//métodos criados
	public void calculaJuros() {
		
		double porcentagem = ((2 / 100) * this.limite);
		
		super.debite(super.getSaldo() - porcentagem);
	}
	
	
	
	
	
}
