/*Leia um vetor com 10 elementos inteiros correspondentes as idades de um grupo de pessoas.
 *Escreva um programa que determine e escreva a menor e a maior idade e suas respectivas posições. 
 */

package exerciciosLoianeVetores;

import java.util.Random;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Random aleatorio = new Random();
		
		int vetor[] = new int[10];
		int posicaoMenorIdade = 0, posicaoMaiorIdade = 0;
		
		for (int i = 0 ; i < vetor.length ; i++) {
			vetor[i] = aleatorio.nextInt(90);
		}
			
		int maiorIdade = vetor[0], menorIdade = vetor[0];
			
		for (int i = 0 ; i < vetor.length ; i++) {	
			if (vetor[i] > maiorIdade) {
				maiorIdade = vetor[i];
				posicaoMaiorIdade = i;
			} else if (vetor[i] < menorIdade) {
				menorIdade = vetor[i];
				posicaoMenorIdade = i;
			}
		}
		
		System.out.println("VETOR");
		System.out.printf("A menor idade foi %d anos e sua posição foi %d \n", menorIdade, posicaoMenorIdade);
		System.out.printf("A maior idade foi %d anos e sua posição foi %d ", maiorIdade, posicaoMaiorIdade);
		

	}

}
