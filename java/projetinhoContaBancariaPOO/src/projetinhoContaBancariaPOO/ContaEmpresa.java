package projetinhoContaBancariaPOO;

public class ContaEmpresa extends ContaBancaria{

	//atributos
	private double limiteEmpresa;
	
	//construtor padrão
	public ContaEmpresa() {
	}
	
	//construtor
	public ContaEmpresa(String nomeCliente, int numConta, double limiteEmpresa) {
		super(nomeCliente, numConta);
		this.limiteEmpresa = limiteEmpresa;
	}

	
	//métodos getters and setters
	public double getLimiteEmpresa() {
		return limiteEmpresa;
	}

	public void setLimiteEmpresa(double limiteEmpresa) {
		this.limiteEmpresa = limiteEmpresa;
	}
	
	
	//métodos criados
	public void emprestimoSalarial(double limiteEmpresa) {
	
		double porcentagemLimite = ((getSaldo() / 100) * 50); //calculando a porcentagem de 50% do saldo
		
		if (super.getSaldo() < porcentagemLimite) { //se o saldo/limite usado for menor que 50%
			super.credite(super.getSaldo() + (limiteEmpresa * 2)); 
			this.limiteEmpresa = 0;
		} else if (super.getSaldo() > porcentagemLimite) { //se o saldo/limite usado for maior que 50%
			System.out.println("Não foi possível conceder empréstimo, pois, está sendo usado mais que 50% do limite atual.");
		}
	}
	
	
	
	
}
