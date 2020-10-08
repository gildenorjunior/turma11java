package lista03;

import java.util.Scanner;

public class Lista03Exercicio06 {
	/*
	 * Escrever um programa que receba vários números inteiros no teclado.
	 * E no final imprimir a média dos números múltiplos de 3.
	 * Para sair digitar 0(zero).(DO...WHILE)
	 */

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		int leitura, cont3 =0;
		double soma3 =0;
		
		do {
			System.out.print("Digite um numero :");
			leitura = leia.nextInt();
			if (leitura%3 ==0 && leitura !=0) {
				soma3 = soma3 + leitura;
				cont3++;
			}
			
		} while (leitura !=0);
		soma3 = soma3/cont3;
		
		System.out.println("Média dos números multiplos de 3 é :"+soma3);

	}

}