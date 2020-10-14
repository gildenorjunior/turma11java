package listaExercicos;

public class TestaEletronico {

	public static void main(String[] args) {
		
		Eletronicos item1 = new Eletronicos();
		
		item1.cor = "Preto";
		item1.marca = "Samsung";
		item1.tipo = "Celular";
		item1.preco = 1000;
		
		
		System.out.println("Tipo do eletronico: " + item1.tipo);
		System.out.println("Marca do eletronico: " + item1.marca);
		System.out.println("Cor do eletronico: " + item1.cor);
		System.out.println("Preco do eletronico: " + item1.preco);
		item1.liga();
		
		

	}

}
