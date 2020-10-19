/*Criar umvetor vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho,
 * sendo que cada elemento do vetor B deverá ser o respectivo elemento de A multiplicado por 
 * sua posição (ou indice), ou seja: B[i] = A[i] * i.
 */

package exerciciosLoianeVetores;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetorA[] = new int[10];
		int vetorB[] = new int[vetorA.length];
		int valorDigitado;
		
		for (int i = 0 ; i < vetorA.length ; i++) {
			System.out.print("Digite um valor para o vetor: ");
			valorDigitado = leia.nextInt();
			vetorA[i] = valorDigitado;
			
			vetorB[i] = (vetorA[i] * i);
		}
		
		System.out.println();
		
		System.out.println("VETOR A");
		for (int i = 0 ; i < vetorA.length ; i++) {
			System.out.printf("[" + vetorA[i] + "] ");
		}
		
		System.out.println("\n\n");
		System.out.println("VETOR B");
		for (int i = 0 ; i < vetorA.length ; i++) {
			System.out.printf("[" + vetorB[i] + "] ");
		}


	}

}
