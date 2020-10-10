/*2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.
*/

package lista04;

import java.util.Scanner;

public class Lista04Exercicio02 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int valores[] = new int[6];
		int somaPares = 0;
		int contImpares = 0;
		
		for(int i = 0 ; i < 6 ; i++)
		{
			System.out.print("Digite um valor: ");
			valores[i] = leia.nextInt();
		}
		
		System.out.println();
		
		for(int i = 0 ; i < 6 ; i++)
		{
			if((valores[i] % 2) == 0)
			{
				somaPares = valores[i] + somaPares;
				System.out.println("PAR: " + valores[i]);
			}
		}
		
		System.out.println();
		
		for(int i = 0 ; i < 6 ; i++)
		{
			if((valores[i] % 2) == 1)
			{
				System.out.println("IMPAR: " + valores[i]);
				contImpares++;
			}
		}
		
		System.out.println();
		System.out.println("Soma dos números pares digitados: " + somaPares);
		System.out.println("Quantidade de números impares digitados: " + contImpares);
	}

}
