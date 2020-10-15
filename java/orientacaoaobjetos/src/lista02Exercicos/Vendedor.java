/* Implemente a classe Vendedor como subclasse da classe Pessoa. 
 * Um determinado vendedor tem como atributos da classe Pessoa e também os atributos próprios
 * como valorVendas (correspondente ao valor monetário dos artigos vendidos) 
 * e o atributo comissao (porcentagem do valorVendas que será adicionado ao vencimento base do Vendedor). 
 */

package lista02Exercicos;

public class Vendedor extends Pessoa{

	private int valorVendas; //correspondente ao valor monetário dos artigos vendidos
	private int comissao; //porcentagem do valorVendas que serpa adicionado ao vencimento base do vendedor
	
	//construtor padrão vazio
	public Vendedor() {
	}
	
	public Vendedor(String nome, String endereco, String telefone, int valorVendar, int comissao) {
		super(nome, endereco, telefone);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}

	//getters and setters
	public int getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(int valorVendas) {
		this.valorVendas = valorVendas;
	}

	public int getComissao() {
		return comissao;
	}

	public void setComissao(int comissao) {
		this.comissao = comissao;
	}
	
	
	
}
