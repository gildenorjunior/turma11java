/*Criar um vetor A com 10 elementos inteiros. Implementar um programa
 * que defina e escreva a quantidade de elementos armazenados neste vetor que são pares.
 */

package exerciciosLoianeVetores;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetorA[] = new int[10];
		int valorDigitado, contPares = 0;
		
		for (int i = 0 ; i < vetorA.length ; i++) {
			System.out.print("Digite um valor para o vetor: ");
			valorDigitado = leia.nextInt();
			vetorA[i] = valorDigitado;
			
			if ((valorDigitado % 2) == 0) {
				contPares++;
			}
		}
		
		System.out.println();
		System.out.println("VETOR");
		for (int i = 0 ; i < vetorA.length ; i++) {
			System.out.printf("[" + vetorA[i] + "] ");
		}
		
		System.out.println();
		System.out.printf("A quantidade de elementos pares armazenados no vetor %d.", contPares);

	}

}
