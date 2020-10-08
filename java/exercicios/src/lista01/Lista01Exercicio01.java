package lista01;

import java.util.Scanner;

public class Lista01Exercicio01 {

	public static void main(String[] args) {

		//Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
		//dias e mostre-a expressa apenas em dias.
		
		Scanner leia = new Scanner(System.in);
		
		int anos, meses, dias, totalDias;
		
		System.out.print("Digite os anos: ");
		anos = leia.nextInt();
		
		System.out.print("Digite os meses: ");
		meses = leia.nextInt();
		
		System.out.print("Digite os dias: ");
		dias = leia.nextInt();
		
		totalDias = ( (anos*365) + (meses*30) + dias);
		System.out.println("Total de dias é: " + totalDias);
		
		
		leia.close();

	}

}
