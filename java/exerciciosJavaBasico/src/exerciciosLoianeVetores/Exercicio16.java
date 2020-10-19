 /*
 * Criar um vetor A com 10 elementos inteiros. Escrever um programa que calcule e escreva: 
 * a) A soma de elementos armazenados neste vetor que são inferiores a 15 ;
 * b) A quantidade de elementos armazenados no vetor que são iguais a 15;
 * c) a média dos elementos armazenados no vetor que são superiores a 15;
 */

package exerciciosLoianeVetores;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetor[] = new int[10];
		int valorDigitado, somaMenorQuinze = 0, igualQuinze = 0, soma = 0, maiorQuinze = 0, media;
		
		for (int i = 0 ; i < vetor.length ; i++) {
			System.out.print("Digite um valor para o vetor: ");
			valorDigitado = leia.nextInt();
			vetor[i] = valorDigitado;
			
			if (valorDigitado < 15) {
				somaMenorQuinze = somaMenorQuinze + valorDigitado; 
			} else if (valorDigitado == 15) {
				igualQuinze++;
			} else if (valorDigitado > 15) {
				soma = soma + valorDigitado;
				maiorQuinze++;
			}
		}
		
		media = (soma / maiorQuinze);
		System.out.println();
		System.out.println("VETOR");		
		for (int i = 0 ; i < vetor.length; i++) { 
			System.out.printf("[" + vetor[i] + "] ");
		}
		
		System.out.println("\n");
		System.out.println("A soma de elementos armazenados neste vetor que são inferiores a 15: " + somaMenorQuinze);
		System.out.println("A quantidade de elementos no vetor que são iguais a 15: " + igualQuinze);
		System.out.println("A média dos elementos do vetor que são maiores que 15: " + media);
		
		leia.close();

	}

}
