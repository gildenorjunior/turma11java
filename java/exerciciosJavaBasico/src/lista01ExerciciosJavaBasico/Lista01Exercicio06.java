package lista01ExerciciosJavaBasico;

import java.util.Scanner;

public class Lista01Exercicio06 {

	public static void main(String[] args) {
		
		//Construa um programa em c que, tendo como dados de entrada dois pontos
		//quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles.
		//A fórmula que efetua tal cálculo é:
		
		Scanner leia = new Scanner(System.in);
		
		int x1, x2, y1, y2;
		double distancia;
		double potenciacao;
		
		System.out.print("Digite uma entrada para o primeiro ponto em X no plano: ");
		x1 = leia.nextInt();
		
		System.out.print("Digite uma entrada para o segundo ponto em X no plano: ");
		x2 = leia.nextInt();
		
		System.out.print("Digite uma entrada para o primeiro ponto em Y no plano: ");
		y1 = leia.nextInt();
		
		System.out.print("Digite uma entrada para o segundo ponto em Y no plano: ");
		y2 = leia.nextInt();
		
		potenciacao = Math.pow(x1, x2)+2+Math.pow(y1, y2)+2+2;
		
		distancia = Math.sqrt(potenciacao);
		
		System.out.printf("O resultado da operação é: %.1f", distancia);
		
		leia.close();

	}

}
