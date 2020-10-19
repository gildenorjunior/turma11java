package lista01ExerciciosJavaBasico;

import java.util.Scanner;

public class LacoRepeticao {

	public static void main(String[] args) {
		
		/*int x = 0;
		
		for(int i = 0 ; i <= 1000 ; i++)
		{
			System.out.println(i);
		}

		System.out.println("-------------------------------------------");
		*/
		
		char pergunta;
		int contador = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.print(contador);
			System.out.print("\nVocê quer continuar? (S - sim) ou (N - nao) ");
			pergunta = leia.next().toUpperCase().charAt(0);
			contador = contador + 10;
		}while(pergunta != 'N');
		
		System.out.println("Fim de programa!");
	}

}
