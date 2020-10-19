package exerciciosLoianePOO;

import java.util.Scanner;

public class TestaAluno {

	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Aluno aluno = new Aluno(); //instanciando o objeto aluno
		
		//mostrando na tela e pedindo para o usuario digitar as informações necessarias
		System.out.print("Digite o nome do aluno: ");
		aluno.setNome(leia.next());
		
		System.out.print("Digite a matricula do aluno: ");
		aluno.setMatricula(leia.next());
		
		System.out.print("Digite o nome do curso: ");
		aluno.setNomeCurso(leia.next());
		
		System.out.println();
		
		
		
		//Pedindo o nome das 3 disciplinas, no modo de vetor, percorrendo e preenchendo.
		for (int i = 0; i < aluno.getNomeDisciplinas().length; i++) {
			System.out.printf("Digite o nome da disciplina " + (i+1) + ": ");
			aluno.setNomeDisciplina(i, leia.next());

		}
		
		
		
		//Pedindo as notas das disciplinas, no modo de uma matriz, percorrendo-a e preenchendo
		for (int i = 0; i < aluno.getNotasDisciplinas().length; i++) {
			System.out.println("\nObtendo notas da disciplina " + aluno.getNomeDisciplinas()[i]);
			for (int j = 0; j < aluno.getNotasDisciplinas()[i].length; j++) {
				System.out.println("Digite a nota " + (j+1) + ": ");
				aluno.setNomePosIJ(i, j, leia.nextInt());
			}
		}
		
		//chamando o método criado que mostra todas as informações do aluno
		aluno.mostrarInfo();
		
		
		for (int i = 0 ; i < aluno.getNomeDisciplinas().length ; i++) { //vai percorrer o vetor de nomes das disciplinas
			if (aluno.verificarAprovado(i)) { //se o retorno desse método for verdadeiro..
				System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + " - foi aprovado!");
			} else { //se o retorno do método for false
				System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + " - reprovado") ;
			}
		}
		
		leia.close();
		
		
	}
	
}
