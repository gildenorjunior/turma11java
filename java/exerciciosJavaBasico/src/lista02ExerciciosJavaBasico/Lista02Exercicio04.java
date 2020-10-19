package lista02ExerciciosJavaBasico;

import java.util.Scanner;

public class Lista02Exercicio04 {

	public static void main(String[] args) {
		
		//Faça um programa em que permita a entrada de um número qualquer e exiba se este
		//número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
		//ímpar exiba o número elevado ao quadrado.
		
		double valor, resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		valor = leia.nextInt();
		
		if((valor % 2) == 0 && (valor > 0))
		{
			resultado = Math.sqrt(valor);
			System.out.println("O valor digitado é par e sua raiz é: " + resultado);
		}
		else if ((valor % 2) == 1 && (valor > 0))
		{
			resultado = Math.pow(valor, 2);
			System.out.println("O valor digitado é ímpar e sua elevação ao quadrado é: " + resultado);
		}
		else
		{
			System.out.println("Valor inválido!");
		}

	}

}
