package lista04ExerciciosJavaBasico;

import java.util.Scanner;

public class Turma {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String alunos[] = {"Bruna dos Santos", "Bruno Correia da Costa", "Bruno de Freitas Sousa", "Carla Cristina Conceição de Paula", "Christian Garcia Amantino", "Cleiton Ortega dos Santos", "Debora Miranda Carmona", "Everton Luiz Rosário de Oliveira", "Gabriel Reis Ritter", "Gildenor Junior da Silva Costa", "Guilherme Marcionilo Pedroso do Rosario Silva", "Herick Willians Canhete Rocha", "Jacqueline Alves Barbosa", "João Victor dos Santos Rigoleto", "Jonas De Oliveira Santos", "Jonathan Cavalcanti De Paula", "Juliana Cavalaro de Oliveira", "Karina Soares Lima", "Larissa Meira Dominguez", "Leonardo Iamur Terra", "Lysandro Andrade Martin", "Matheus Araujo de moraes", "Matheus Fernandes Rodrigues", "Matheus Trindade Torok", "Mônica dos santos ribeiro", "Natália Lopes moreno", "Phelipe Almeida de Souza", "Rafaela de Albuquerque", "Ricardo Martins Corrêa", "Sarah Lidia De Oliveira Braia", "Stefanie Dias Costa", "Tiago Diniz Gomes", "Victor Augusto de Souza Tavares", "Vivian Rodrigues Nakano", "Washington pereira dos santos", "Wellington Vieira", "Wesley Bueno da Silva", "Yago Tonoli Domingues", "Zaine de Queiros Jesus"};
		int notas[] = new int[alunos.length];
		char opc = 'S';
		int cod;
		int nota = 0;
		
		for(int i = 0 ; i < alunos.length ; i++)
		{
			System.out.println("Nota = " + notas[i] + i + " " + alunos[i]);
		}
		
		while(opc != 'N')
		{
			System.out.println("Quem você deseja mudar a nota, insira o código: ");
			cod = leia.nextInt();
			
			System.out.println("O aluno que você escolheu é " + alunos[cod]);
			
			System.out.println("Qual nota você deseja alterar? ");
			nota = leia.nextInt();
			
			notas[cod] = nota; 
			
			System.out.println("Você deseja continuar? [S-sim ou N-não]: ");
			opc = leia.next().toUpperCase().charAt(0);
		}
		
		
		
	}

}
