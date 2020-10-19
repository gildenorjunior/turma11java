/*Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina 
 * e escreva a soma de todos os elementos armazenados neste vetor.
 */

package exerciciosLoianeVetores;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetorA[] = new int[10];
		int valorDigitado, soma = 0;
		
		for (int i = 0 ; i < vetorA.length ; i++) {
			System.out.print("Digite o valor para o vetor: ");
			valorDigitado = leia.nextInt();
			vetorA[i] = valorDigitado;
			}
		
		for (int i = 0 ; i < vetorA.length ; i++) {
			soma = vetorA[i] + soma;
		}
		
		System.out.println();
		System.out.println("VETOR");
		for (int i = 0 ; i < vetorA.length ; i++) {
			System.out.printf("[" + vetorA[i] + "] ");
		}
		
		System.out.println();
		System.out.println("A soma dos elementos do vetor: " + soma);
		leia.close();
	}

}
