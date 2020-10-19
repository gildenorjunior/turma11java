package projetinhoContaBancariaPOO;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {

	
	//atributos
	private double juros;
	private double correcaoMonetaria;
	private int mesAniversario;
	
	
	//construtor padrão
	public ContaPoupanca() {
	}
	
	//sobrecarga do contrutor
	public ContaPoupanca(int mesAniversario) {
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
		
		if (this.mesAniversario == mes.get(Calendar.MONTH)) {
			  
		}
	}
	
	
	
	
	
}
