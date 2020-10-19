//Escreva uma classe para representar uma lâmpada que está à venda em um supermercado

package exerciciosLoianePOO;

public class Lampada {

	private int preco;
	private int voltagem;
	private String cor;
	private String marca;
	private int garantiaMeses;
	private String tipos[]; //Qual o tipo de luz
	private boolean tipoAbajur; //Abajur sim ou não
	private boolean estado;
	
	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getGarantiaMeses() {
		return garantiaMeses;
	}

	public void setGarantiaMeses(int garantiaMeses) {
		this.garantiaMeses = garantiaMeses;
	}

	public String[] getTipos() {
		return tipos;
	}

	public void setTipos(String[] tipos) {
		this.tipos = tipos;
	}

	public boolean isTipoAbajur() {
		return tipoAbajur;
	}

	public void setTipoAbajur(boolean tipoAbajur) {
		this.tipoAbajur = tipoAbajur;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public void liga() {
		System.out.println("Ligando a lâmpada...");
		estado = true;
	}
	
	public void desliga() {
		System.out.println("Desligando a lâmpada...");
		estado = false;
	}
	
	
}
