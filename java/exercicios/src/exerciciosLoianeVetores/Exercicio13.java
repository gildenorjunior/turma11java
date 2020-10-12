/*Criar um vetor A com 10 elementos inteiros. Implementar um programa que determine a soma
 * dos elementos armazenados neste vetor que são multiplos de 5.
 */

package exerciciosLoianeVetores;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetorA[] = new int[10];
		int valorDigitado, soma = 0;
		
		for (int i = 0 ; i < vetorA.length ; i++) {
			System.out.print("Digite um valor para o vetor: ");
			valorDigitado = leia.nextInt();
			vetorA[i] = valorDigitado;
			
			if ((valorDigitado % 5) == 0) {
				soma = soma + valorDigitado;
			}
		}
		
		System.out.println();
		System.out.println("VETOR");
		for (int i = 0 ; i < vetorA.length ; i++) {
			System.out.printf("[" + vetorA[i] + "]");
		}
		
		System.out.println();
		System.out.println("A soma dos valores multiplos de cinco da matriz: " + soma);
		
		leia.close();

	}

}
