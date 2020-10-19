/*Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C,
 * onde cada elemento de C é a subtração dos respectivos elementos em A e B, ou seja:
 * C[i] = A[i] + B[i]
 */

package exerciciosLoianeVetores;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetorA[] = new int[10];
		int vetorB[] = new int[vetorA.length];
		int vetorC[] = new int[vetorA.length];
		int valorDigitado;
		
		//PREENCHENDO VETOR A COM OS VALORES DIGITADOS 
		for (int i = 0 ; i < vetorA.length ; i++) {
			System.out.print("Digite um valor para o vetor A: ");
			valorDigitado = leia.nextInt();
			vetorA[i] = valorDigitado;
		}
		
		leia.nextLine();
		System.out.println();
		
		//PREENCHENDO VETOR B COM OS VALORES DIGITADOS 
		for (int i = 0 ; i < vetorA.length ; i++) {
			System.out.print("Digite um valor para o vetor B: ");
			valorDigitado = leia.nextInt();
			vetorB[i] = valorDigitado;
		}
		
		//FAZENDO A ADIÇÃO DE (A) E (B) E ATRIBUINDO A (C)
		for (int i = 0 ; i < vetorA.length ; i++) {
			vetorC[i] = (vetorA[i] + vetorB[i]);
		}
		
		System.out.println("\n");
		System.out.println("VETOR A");
		for (int i = 0 ; i < vetorA.length ; i++) {
			System.out.printf("[" + vetorA[i] + "] ");
		}
		
		System.out.println("\n");
		System.out.println("VETOR B");
		for (int i = 0 ; i < vetorA.length ; i++) {
			System.out.printf("[" + vetorB[i] + "] ");
		}
		
		System.out.println("\n");
		System.out.println("VETOR C");
		for (int i = 0 ; i < vetorA.length ; i++) {
			System.out.printf("[" + vetorC[i] + "] ");
		}

	}

}
