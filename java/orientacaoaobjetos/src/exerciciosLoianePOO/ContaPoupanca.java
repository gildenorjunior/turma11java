package exerciciosLoianePOO;

import java.util.Calendar;
import java.util.Date;

public class ContaPoupanca extends ContaBancaria{

	private int diaRendimento;
	
	public ContaPoupanca(String nomeCliente, String numConta, int diaRendimento) {
		super(nomeCliente, numConta);
		this.diaRendimento = diaRendimento;
	}

	public int getDiaRendimento() {
		return diaRendimento;
	}


	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	public boolean calcularNovoSaldo(double taxaRendimento) {
		
		Calendar hoje = Calendar.getInstance();
		
		if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			//saldo += saldo * taxaRendimento;
			this.setSaldo(this.getSaldo() + this.getSaldo() * taxaRendimento);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return  super.toString() + ", diaRendimento: " + diaRendimento + "]";
	}
	
	
	
}
