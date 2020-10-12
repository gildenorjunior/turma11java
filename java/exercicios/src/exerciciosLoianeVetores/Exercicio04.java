/*Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho,
 * sendo que cada elemento do vetor B deverá ser o quadrado do respectivo elemento A, ou seja:
 * B[i] = sqrt(A[i])
 */

package exerciciosLoianeVetores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetorA[] = new int[15];
		double vetorB[] = new double[vetorA.length];
		int valorDigitado;
		
		for (int i = 0; i < vetorA.length ; i++) {
			System.out.print("Digite o valor para o vetor: ");
			valorDigitado = leia.nextInt();
			vetorA[i] = valorDigitado;
			
			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		
		System.out.println();
		
		System.out.println("VETOR A");
		for (int i = 0 ; i < vetorA.length; i++) {
			System.out.printf("[" + vetorA[i] + "] ");
		}
		
		DecimalFormat df = new DecimalFormat("###,###.##");
		
		System.out.println("\n\n");
		System.out.println("VETOR B");
		for (int i = 0 ; i < vetorA.length; i++) {
			System.out.printf("[" + df.format(vetorB[i]) + "] ");
		}

	}

}
