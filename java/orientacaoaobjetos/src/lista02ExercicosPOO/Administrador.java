/*Implemente a classe Administrador como subclasse da classe pessoa.
 * Um determinado administrador tem como atributos da classe Pessoa e também os atributos
 * próprios como ajudaDeCusto (ajudas referentes a viagens, estadias).
 * 
 */

package lista02ExercicosPOO;

public class Administrador extends Pessoa{

	private int ajudaDeCusto;

	//construtor padrão vazio
	public Administrador() {	
	}
	
	//sobrecarga do construtor padrão
	public Administrador(String nome, String endereco, String telefone, int ajudaDeCusto) {
		super(nome, endereco, telefone);
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	//getters and setters
	public int getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(int ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	
	
}
