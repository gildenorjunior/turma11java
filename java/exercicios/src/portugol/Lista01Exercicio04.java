package portugol;

import java.util.Scanner;

public class Lista01Exercicio04 {

	public static void main(String[] args) {
		
		//Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
		//calcule a seguinte expressão:

		Scanner leia = new Scanner(System.in);
		
		int a, b, c;
		double r, s, d;
		
		System.out.print("Digite o primeiro valor: ");
		a = leia.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		b = leia.nextInt();
		
		System.out.print("Digite o terceiro valor: ");
		c = leia.nextInt();
		
		r = Math.pow((a + b), 2);
		s = Math.pow((b + c), 2);
		
		d = ((r + s) / 2);
		
		System.out.printf("O valor de d é %.1f \n", d);
		System.out.printf("O valor de r é %.1f \n", r);
		System.out.printf("O valor de s é %.1f \n", s);
		
		leia.close();
	}

}
