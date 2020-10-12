/*Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que defina
 * o percentual de elementos pares e impares, respectivamente, armazenados neste vetor.
 */


package exerciciosLoianeVetores;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetorA[] = new int[10];
		int valorDigitado, contPar = 0, contImpar = 0;
		double percentualPar, percentualImpar;
		
		for (int i = 0 ; i < vetorA.length ; i++) {
			System.out.print("Digite um valor para o vetor: ");
			valorDigitado = leia.nextInt();
			vetorA[i] = valorDigitado;
 			
			
			if ((valorDigitado % 2) == 0) {
				contPar++;
			} else if (valorDigitado % 2 != 0) {
				contImpar++;
			}
		}
		
		System.out.println();
		System.out.println("VETOR");
		for (int i = 0 ; i < vetorA.length ; i++) {
			System.out.printf("[" + vetorA[i] + "] ");
		}
		
		percentualImpar = ((contImpar * 100) / vetorA.length);
		percentualPar = ((contPar * 100) / vetorA.length);
		
		System.out.println();
		System.out.println("O valor percentual valores impares: " + percentualImpar);
		System.out.println("O valor percentual valores pares: " + percentualPar);
		leia.close();

	}

}
