package lista02Exercicos;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("João", "Rua A", "(11) 91234-9876"); //Buscando da sobrecarga do meu construtor padrão onde pedi para passar todos os atributos da classe
		Pessoa pessoa2 = new Pessoa("Maria", "Rua B"); //Buscando da sobrecarga do meu construtor padrão onde pedi para passar apenas dois atributos
		Pessoa pessoa3 = new Pessoa(); // Buscando no meu construtor padrão que define sem passar nenhum atributo
		
		Pessoa fornecedor1 = new Fornecedor(); //buscando do construtor padrão de Fornecedor onde permite vazio
		Fornecedor fornecedor2 = new Fornecedor("RN Àgua Galões", "Rua Y", "(84) 94444-5555", 1000, 200); //herdando os atributos da classe Pessoa e buscando da sobrecarga do construtor  padrão da classe Fornecedor, onde eu obrigo a preencher todos os atributos
		
		//Apenas pegando os valores já contidos na instancia e apresentando na tela
		System.out.println("Apresentando a Pessoa 1 com os atributos já definidos:");
		System.out.println("Nome: " + pessoa1.getNome());
		System.out.println("Endereço: " + pessoa1.getEndereco());
		System.out.println("Telefone: " + pessoa1.getTelefone());
		
		//Modificando os valores dos atributos da instancia
		pessoa1.setNome("João Pé de Feijão");
		pessoa1.setEndereco("Rua ABC");
		pessoa1.setTelefone("(11) 99999-9999");
		System.out.println("\nApresentando a Pessoa 1 com os atributos modificados: ");
		System.out.println("Nome: " + pessoa1.getNome());
		System.out.println("Endereço: " + pessoa1.getEndereco());
		System.out.println("Telefone: " + pessoa1.getTelefone());
		
		//Mostrando os atributos da própria instancia e os herdados, sem modificá-los. 
		System.out.println("\nApresentando Fornecedor 1 com os atributos herdados pela classe mãe (Pessoa) e mostrando também os próprios da classe (Fornecedor):");
		System.out.println("Nome: " + fornecedor2.getNome());
		System.out.println("Endereço: " + fornecedor2.getEndereco());
		System.out.println("Telefone: " + fornecedor2.getTelefone());
		System.out.println("Valor de Crédito: R$" + fornecedor2.getValorCredito());
		System.out.println("Valor da divida: R$" + fornecedor2.getValorDivida());
		System.out.println("Valor do saldo disponivel: R$" + fornecedor2.obterSaldo(1000, 200));
		
	}

}
