/*Criar um vetor A com quinze elementos inteiros. Construir um vetor B de mesmo tipo e tamanho,
 * sendo que cada elemento do vetor B deverá ser o quadrado do respectivo elemento A, ou seja,
 * B[i] = A[i] * A[i].
 */

package exerciciosLoianeVetores;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetorA[] = new int[15];
		int vetorB[] = new int[vetorA.length];
		int valorDigitado;
		
		//PEGANDO O VALOR DIGITADO E ATRIBUINDO AO VETOR (A), FAZENDO A ELEVAÇÃO POR 2 E DEPOIS ATRIBUINDO O VETOR (A) AO (B)
		for (int i = 0 ; i < vetorA.length ; i++) {
			System.out.print("Digite um valor para o vetor: ");
			valorDigitado = leia.nextInt();
			vetorA[i] = valorDigitado;
			
			vetorB[i] = vetorA[i] * vetorA[i];
		}
		
		System.out.println();
		System.out.println("VETOR A");
		
		for(int i = 0 ; i < vetorA.length ; i++) {
			System.out.printf("[" + vetorA[i] + "]");
		}
		
		System.out.println("\n\n");
		System.out.println("VETOR B");
		
		for(int i = 0 ; i < vetorA.length ; i++) {
			System.out.printf("[" + vetorB[i] + "]");
		}

	}

}
