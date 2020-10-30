package projetinhoContaBancariaPOO;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {

	
	//atributos
	private double juros;
	private double correcaoMonetaria = 0.2;
	private int mesAniversario;
	
	
	//construtor padrão
	public ContaPoupanca() {
	}
	
	//construtor
	public ContaPoupanca(String nomeCliente, int numConta, double juros, double correcaoMonetaria, int mesAniversario) {
		super(nomeCliente, numConta);
		this.juros = juros;
		this.correcaoMonetaria = correcaoMonetaria;
		this.mesAniversario = mesAniversario;
	}
	

	//métodods getters and setters
	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

	public double getCorrecaoMonetaria() {
		return correcaoMonetaria;
	}

	public void setCorrecaoMonetaria(double correcaoMonetaria) {
		this.correcaoMonetaria = correcaoMonetaria;
	}

	public int getMesAniversario() {
		return mesAniversario;
	}

	public void setMesAniversario(int mesAniversario) {
		this.mesAniversario = mesAniversario;
	}
	
	
	//método criado
	public void aniversarioMes() {
				
		Calendar mes = Calendar.getInstance();
		//mes.get(Calendar.MONTH)
		
		if (this.mesAniversario == 10) {
			super.credite(super.getSaldo() + (super.getSaldo() * 0.2));
		}
		
		
		
		
	}
	
	
	
	
	
}
