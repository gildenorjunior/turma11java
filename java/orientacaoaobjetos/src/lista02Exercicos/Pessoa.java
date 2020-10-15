/*
 * 1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores
 *  (getters) e modificadores (setters), e ainda o construtor padrão e pelo menos mais duas opções
 *   de construtores conforme sua percepção. Atributos: String nome; String endereço; String telefone; 
 */

package lista02Exercicos;

public class Pessoa {

	//atributos da classe pessoa
	private String nome;
	private String endereco;
	private String telefone;
	
	//construtor padrão
	public Pessoa () {
		
	}
	
	//sobrecarga do construtor
	public Pessoa (String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}
	
	//sobrecarga do construtor
	public Pessoa (String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	//getters e setters dos atributos da classe pessoa
	public String getNome() { 
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
}
