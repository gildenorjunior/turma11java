//Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

package lista04ExerciciosJavaBasico;

import java.util.Random;

public class Lista04Exercicio03 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int valores, maiorQueDez = 0;
		
		int matriz[][] = new int[3][3];
		
		for(int linha = 0 ; linha < 3 ; linha++)
		{
			for(int coluna = 0; coluna < 3 ; coluna++)
			{
				valores = random.nextInt(20);
				
				if(valores > 10)
				{
					maiorQueDez++;
				}
				
				matriz[linha][coluna] = valores;
				
				System.out.print("[" + matriz[linha][coluna] + "]");
			}
			
			System.out.println();
		}
		
		System.out.println("Quantidade de valores maiores que dez: " + maiorQueDez);

	}

}
