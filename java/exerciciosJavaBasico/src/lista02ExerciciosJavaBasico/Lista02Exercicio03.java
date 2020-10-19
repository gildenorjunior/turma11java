package lista02ExerciciosJavaBasico;

import java.util.Scanner;

public class Lista02Exercicio03 {

	public static void main(String[] args) {
		
		//Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
		//categoria ela se encontra:
		
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		idade = leia.nextInt();
		
		if(idade >= 10 && idade <= 14)
		{
			System.out.println("Você está na categoria Infantil!");
		}
		else if (idade >= 15 && idade <= 17)
		{
			System.out.println("Você está na categoria Juvenil!");
		}
		else if (idade >= 18 && idade <= 25)
		{
			System.out.println("Você está na categoria Adulto!");
		}
		else
		{
			System.out.println("Você não se encaixa em nenhuma das categorias!");
		}
		

	}

}
