package lista01ExerciciosJavaBasico;

import java.util.Scanner;

public class Lista01Exercicio02 {

	public static void main(String[] args) {
		
		//Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
		//expressa em anos, meses e dias.
		
		Scanner leia = new Scanner(System.in);
		
		int diaAniversario, idadeEmAnos, idadeEmMes, idadeEmDias;
		
		System.out.print("Digite sua idade em dias: ");
		diaAniversario = leia.nextInt();
		
		idadeEmAnos = (diaAniversario / 365); //calculando a idade em anos
		idadeEmMes = ((diaAniversario % 365) / 30);
		idadeEmDias = ((diaAniversario % 365) % 30);
		
		System.out.println("Sua idade em anos é: " + idadeEmAnos);
		System.out.println("Sua idade em meses é: " + idadeEmMes);
		System.out.println("Sua idade em dias é: " + idadeEmDias);
		
		leia.close();
	}

}
