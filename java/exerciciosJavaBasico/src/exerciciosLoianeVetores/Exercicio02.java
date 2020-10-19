/*Criar um vetor A com 8 elementos inteiros. Construir um vetor B de 
 * mesmo tipo e tamanho e com os elementos do vetor A multiplicados por 2,
 * ou seja: B[i] = A[i] * 2.
 */

package exerciciosLoianeVetores;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetorA[] = new int[8];
		int vetorB[] = new int[vetorA.length];
		int valorDigitado;
		
		//PREENCHENDO O VETOR COM O VALOR DIGITADO E ATRIBUINDO O VALOR DO VETOR (A) MULTIPLICADO POR 2 NO VETOR (B).
		for (int i = 0 ; i < vetorA.length ; i++) {
			System.out.print("Digite um valor para o vetor: ");
			valorDigitado = leia.nextInt();
			vetorA[i] = valorDigitado;
			
			vetorB[i] = (vetorA[i] * 2);
		}
		
		System.out.println();
		System.out.println();
		System.out.println("VETOR A");
		
		for (int i = 0 ; i < vetorA.length ; i++) {
			System.out.printf("[" + vetorA[i] + "]");
		}
		
		System.out.println();
		System.out.println("VETOR B");

		for (int i = 0 ; i < vetorA.length ; i++) {
			System.out.printf("[" + vetorB[i] + "]");
		}
	}

}
