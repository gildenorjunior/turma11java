/*Ler um vetor com 10 elementos inteiros correspondentes as idades de um grupo de pessoas.
Escreva um programa que determine e escreva a quantidade de pessoas que possuem idade superior a 35 anos.
*/

package exerciciosLoianeVetores;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetor[] = new int[10];
		int idade, maiorTrintaCinco = 0;
		
		for(int i = 0 ; i < vetor.length ; i++) {
			System.out.printf("Digite a idade da pessoa %d: ", i+1);
			idade = leia.nextInt();
			vetor[i] = idade;
			
			if (idade > 35) {
				maiorTrintaCinco++;
			}
		}
		
		System.out.println();
		for (int i = 0 ; i < vetor.length ; i ++) {
			System.out.println("Idade da pessoa " + i + 1 + " :" + vetor[i]);
		}
		
		System.out.println();
		System.out.println("A quantidade de pessoas do grupo que tem mais de 35 anos: " + maiorTrintaCinco);
		leia.close();
		
	}

}
