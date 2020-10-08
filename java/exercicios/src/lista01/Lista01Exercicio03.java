package lista01;

import java.util.Scanner;

public class Lista01Exercicio03 {

	public static void main(String[] args) {
		
		//Faça um sistema que leia o tempo de duração de um evento em uma fábrica
		//expressa em segundos e mostre-o expresso em horas, minutos e segundos.
		
		Scanner leia = new Scanner(System.in);
		
		int tempoEmSegundos;
		
		System.out.print("Digite o tempo de duração do evento expresso em segundos: ");
		tempoEmSegundos = leia.nextInt();
		
		System.out.println("A duração do evento em minutos foi: " + (tempoEmSegundos / 60) + " minutos.");
		System.out.println("A duração do evento em horas foi: " + (tempoEmSegundos / 3600) + " horas.");
		System.out.println("A duração do evento em segundos foi: " + tempoEmSegundos + " segundos.");
		
		leia.close();

	}

}
