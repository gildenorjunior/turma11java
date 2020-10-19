/*Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva
 * a média aritmética simples dos elementos impares armazenados neste vetor
 */

package exerciciosLoianeVetores;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetorA[] = new int[10];
		int valorDigitado, soma = 0, contImpar = 0;
		double media;
		
		for (int i = 0 ; i < vetorA.length ; i++) {
			System.out.print("Digite um valor para o vetor: ");
			valorDigitado = leia.nextInt();
			vetorA[i] = valorDigitado;
			
			if ((valorDigitado % 2) != 0) {
				soma = soma + valorDigitado;
				contImpar++;
			}
		}
		
		System.out.println();
		System.out.println("VETOR");
		
		for (int i = 0 ; i < vetorA.length ; i++) {
			System.out.printf("[" + vetorA[i] + "] ");
		}
		
		media = (soma / contImpar);
		System.out.println();
		System.out.println("A média dos elementos impares do vetor: " + media);
		
		leia.close();
	}

}
