package lista03ExerciciosPOO;

public class TestaAnimal {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		cachorro.setNome("Cachorrinho");
		cachorro.setIdade(2);
		cavalo.setNome("Cavalinho");
		cavalo.setIdade(5);
		preguica.setNome("Preguicinha");
		preguica.setIdade(7);
		
		
		System.out.println("Nome do cachorro: " + cachorro.getNome());
		System.out.println("Idade do cachorro: " + cachorro.getIdade());
		cachorro.emitirSom();
		cachorro.correr();
		
		
		System.out.println("\nNome do cavalo: " + cavalo.getNome());
		System.out.println("Idade do cavalo: " + cavalo.getIdade());
		cavalo.emitirSom();
		cavalo.correr();
		
		System.out.println("\nNome da preguiça: " + preguica.getNome());
		System.out.println("Idade da preguica: " + preguica.getIdade());
		preguica.emitirSom();
		preguica.subirArvores();
		
		

	}

}
