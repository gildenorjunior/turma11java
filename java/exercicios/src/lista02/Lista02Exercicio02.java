package lista02;

import java.util.Scanner;

public class Lista02Exercicio02 {

	public static void main(String[] args) 
	{
		
		//Faça um programa que entre com três números e coloque em ordem crescente.
		
		int valor1, valor2, valor3, maior = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		valor1 = leia.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		valor2 = leia.nextInt();
		
		System.out.print("Digite o terceiro valor: ");
		valor3 = leia.nextInt();
	
		if(valor1 > valor2 && valor1 > valor3)
		{
			
			if(valor2 > valor3)
			{
				System.out.printf("Os números e ordem crescente:  %d , %d , %d", valor1,valor2,valor3 );
				
			}else 
			{
				System.out.printf("Os números e ordem crescente:  %d , %d , %d", valor1,valor3,valor2 );
			}
		} 
		else if(valor2>valor1 && valor2>valor3)
		{
			if(valor1>valor3)
			{
				System.out.printf("Os números e ordem crescente:  %d , %d , %d", valor2,valor1,valor3 );
				
			}else 
			{
				System.out.printf("Os números e ordem crescente:  %d , %d , %d", valor2,valor3,valor1 );
			}

		}
		else if(valor3>valor1 && valor3>valor2)
		{
			if(valor1>valor2)
			{
				System.out.printf("Os números e ordem crescente:  %d , %d , %d", valor3,valor1,valor2 );
				
			}else 
			{
				System.out.printf("Os números e ordem crescente:  %d , %d , %d", valor3,valor2,valor1 );
			}
		}
		leia.close();
	}
		
}


