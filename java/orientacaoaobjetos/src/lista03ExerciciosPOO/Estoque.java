package lista03ExerciciosPOO;

import java.util.ArrayList;
import java.util.List;


public class Estoque {

	public static void main(String[] args) {
		
		List<Produtos> estoque = new ArrayList();
		
		Produtos produto1 = new Produtos("Lápis", 50, 1.50);
		Produtos produto2 = new Produtos("Apontador", 50, 0.50);
		Produtos produto3 = new Produtos("Caderno", 10, 7.00);
		Produtos produto4 = new Produtos("Borracha", 50, 0.50);
		Produtos produto5 = new Produtos("Caneta", 30, 1.75);
		Produtos produto6 = new Produtos("Folha de Sulfite", 2, 8.00);
		
		//adicionado os itens ao arrayList
		estoque.add(produto1);
		estoque.add(produto2);
		estoque.add(produto3);
		estoque.add(produto4);
		estoque.add(produto5);
		estoque.add(produto6);
		
		
		//exibindo os itens
		for (Produtos produtos : estoque) {
			System.out.printf("Produto: %s \t\t\t Quantidade: %d \t\t Preço: %.2f \n", produtos.getNomeProduto(), produtos.getQuantidadeProduto(), produtos.getPrecoProduto());
		}
		
		estoque.remove(produto6); //aqui estou removendo passando como parametro o objeto
		estoque.get(1).setQuantidadeProduto(1); //aqui estou atualizando passando como parametro o index do array
		
		System.out.println();
		System.out.println();
		
		for (Produtos produtos : estoque) {
			System.out.printf("Produto: %s \t\t\t Quantidade: %d \t\t Preço: %.2f \n", produtos.getNomeProduto(), produtos.getQuantidadeProduto(), produtos.getPrecoProduto());
		}
		
		
		
	}

}
