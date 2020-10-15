/* Considere, como subclasse da classe Pessoa, a classe Empregado.
 * Considere que cada instância da classe Empregado tem, para além dos atributos que caracterizam a classe Pessoa,
 * os atributos codigoSetor (inteiro), salarioBase (vencimento base) e imposto (porcentagem retida dos impostos).
 * Implemente a classe Empregado com métodos seletores e modificadores e um método calcularSalario.
 *  Escreva um programa de teste adequado para a classe Empregado. 
 */

package lista02Exercicos;

public class Empregado extends Pessoa{ //ou seja, classe Empregado é filha de Pessoa

	private int codigoSetor;
	private int salarioBase;
	private int imposto;
	
	//construtor padrão vazio
	public Empregado() { 
		
	}
	
	//sobrecarga do construtor padrão
	public Empregado(String nome, String endereco, String telefone, int codigoSetor, int salarioBase, int imposto) {
		super(nome, endereco, telefone);		
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	
	
	//getters and setters
	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public int getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(int salarioBase) {
		this.salarioBase = salarioBase;
	}

	public int getImposto() {
		return imposto;
	}

	public void setImposto(int imposto) {
		this.imposto = imposto;
	}

	
	//metodo criado para calcular salario
	public int calcularSalario(int salarioBase, int imposto) {
		int resultadoSalario = salarioBase - imposto;
		return resultadoSalario;
	}
	
	
}
