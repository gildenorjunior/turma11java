package lista03ExerciciosJavaBasico;

//Crie um programa que leia um número do teclado até que encontre um número igual a zero.
//No final, mostre a soma dos números digitados

import java.util.Scanner;

public class Lista03Exercicio05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int valor, contador = 0;
		
		do
		{
			System.out.print("Digite um valor: ");
			valor = leia.nextInt();
			contador = valor + contador;
		}while(valor != 0);
		
		System.out.println("A soma dos números digitados foi: " + contador);
			
		}

}