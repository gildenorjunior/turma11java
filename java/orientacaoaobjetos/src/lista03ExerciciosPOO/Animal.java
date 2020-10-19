package lista03ExerciciosPOO;

public abstract class Animal { //abstract porque não posso instanciar um objeto "animal" apenas, ele tem que ser um tipo especifico ex: cachorro.. 

	//Atributos
	private String nome;
	private int idade;
	
	//construtor padrão
	public Animal () {
		
	}
	
	//sobrecarga do construtor
	public Animal (String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	//métodos getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//métodos criados
	public abstract void emitirSom(); //método abstrato, pois nas outras classes eles podem chamar esse método e modificar ele da forma que for necessário
	
	
	
	
}
