  /*Escreva uma classe para representar um Aluno. Adicione atributos relacionados às caracteristicas de um Aluno,
    como nome, matricula, curso que está matriculado, nome de 3 disciplinas que está cursando e as notas dessas 
    3 disciplinas.
    
    Desenvolva um método para verificar se o aluno está aprovado (nota maior ou igual a 7) em uma 
    determinada disciplina.
	Escreva um programa para testar essa classe, que pede as informações do aluno ao usuário e ao final informa
 	o nome das disciplinas, mostra as notas e mostra se o aluno foi aprovado ou não. 
 */

package exerciciosLoianePOO;

public class Aluno {

	//atributos da classe aluno
	private String nome;
	private String matricula;
	private String nomeCurso;
	private String[] nomeDisciplinas = new String[3]; //um vetor para armazenar as 3 disciplinas do aluno
	private int[][] notasDisciplinas = new int[3][4]; //um array para armazenar as notas dos 4 bimestres das 3 disciplinas do aluno
	
	//getters and setters	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getNomeCurso() {
		return nomeCurso;
	}


	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}


	public String[] getNomeDisciplinas() {
		return nomeDisciplinas;
	}


	public void setNomeDisciplinas(String[] nomeDisciplinas) {
		this.nomeDisciplinas = nomeDisciplinas;
	}


	public int[][] getNotasDisciplinas() {
		return notasDisciplinas;
	}


	public void setNotasDisciplinas(int[][] notasDisciplinas) {
		this.notasDisciplinas = notasDisciplinas;
	}

	//métodos criados
	void mostrarInfo() {
		System.out.println("Nome do aluno: " + this.nome);
		System.out.println("Matricula: " + this.matricula);
		System.out.println("Nome do curso: " + this.nomeCurso);
		
		for (int i = 0 ; i < notasDisciplinas.length; i ++) {
			System.out.println("Notas da disciplina " + nomeDisciplinas[i]);
			for (int j = 0; j < notasDisciplinas[i].length; j++) {
				System.out.print("[" + notasDisciplinas[i][j] + "] ");
			}
			System.out.println();
		}
	}
	
	
	boolean verificarAprovado(int indice){ //o indice significa a qual é a disciplina 0,1,2
		if (obterMedia(indice) >= 7) {
			return true;
		}
		
		return false;
	}
	
	double obterMedia(int indice) { //o indice significa a qual é a disciplina 0,1,2
		double soma = 0;
		
		for (int i = 0 ; i < notasDisciplinas[indice].length ; i++ ) { //vai percorrer as notas no indice (na matéria) que o usuario quer
			soma = soma + notasDisciplinas[indice][i]; //aqui que calcula a média das 4 notas da disciplina que o usuário escolheu 
		}
		
		double media = soma / 4;
		
		return media;
	}
	
	
	public void setNomeDisciplina(int pos, String nomeDisciplina) {
		this.nomeDisciplinas[pos] = nomeDisciplina;
		
	}
	
	public void setNomePosIJ(int posI, int posJ, int nota) {
		this.notasDisciplinas[posI][posJ] = nota;
	}
	
	
}
