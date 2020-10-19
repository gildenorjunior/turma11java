package lista03ExerciciosJavaBasico;

import java.util.Scanner;

//Ler 10 números e imprimir quantos são pares e quantos são ímpares. 

public class Lista03Exercicio02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int i, pares = 0, impares = 0;
		
		for(i = 1 ; i <= 10 ; i++)
		{
			if((i % 2) == 0)
			{
				pares++; 
			}
			else
			{
				impares++;
			}
		}
		
		System.out.println("Total de números pares: " + pares);
		System.out.println("Total de números impares: " + impares);

	}

}