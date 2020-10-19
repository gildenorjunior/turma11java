/* Implemente a classe Operario como subclasse da classe Pessoa.
 * Um determinado operário tem como atributos da classe Pessoa e também os atributos
 * próprios como valorProducao (que corresponde ao valor monetário dos artigos efetivamente produzidos pelo operário) 
 * e comissao (que corresponde à porcentagem do valorProducao que será adicionado ao vencimento base do operário). 
 */

package lista02ExercicosPOO;

public class Operario extends Pessoa{

	private int valorProducao; //(que corresponde ao valor monetário dos artigos efetivamente produzidos pelo operário)
	private int comissao; //(que corresponde à porcentagem do valorProducao que será adicionado ao vencimento base do operário)
	
	//construtor padrão vazio
	public Operario() {
	}
	
	//sobrecarga do construtor
	public Operario(String nome, String endereco, String telefone, int valorProducao, int comissao) {
		super(nome, endereco, telefone);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	//getters and setter
	public int getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(int valorProducao) {
		this.valorProducao = valorProducao;
	}

	public int getComissao() {
		return comissao;
	}

	public void setComissao(int comissao) {
		this.comissao = comissao;
	}
	
	
}
