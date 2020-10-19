package lista03ExerciciosJavaBasico;

import java.util.Scanner;

//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
//Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)

public class Lista03Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade = 0, primeiroContador = 0, segundoContador = 0;
		
		while(idade != -99)
		{
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
			if(idade < 21)
			{
				primeiroContador++;
			}
			else if (idade > 50)
			{
				segundoContador++;
			}
		}
		
		System.out.println("Total de pessoas com menos de 21 anos: " + primeiroContador);
		System.out.println("Total de pessoas com mais de 50 anos: " + segundoContador);
		
	}

}
