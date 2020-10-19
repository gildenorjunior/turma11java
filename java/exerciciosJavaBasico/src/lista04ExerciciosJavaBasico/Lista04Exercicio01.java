/*1- Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.
*/

package lista04ExerciciosJavaBasico;

public class Lista04Exercicio01 {

	public static void main(String[] args) {
		
		
		int a[] = {1, 0, 5, -2, -5, 7};
		int soma = 0;
		
		for(int i = 0 ; i < a.length ; i++)
		{
			if(i == 0) 
			{
				soma = soma + a[i];
			}
			else if(i == 1)
			{
				soma = soma + a[i];
			}
			else if (i == 5)
			{
				soma = soma + a[i];
			}
			else if(i == 4)
			{
				a[4] = 100;
			}
			
			
			
			System.out.printf("Valor do vetor na posição [%d]: %d", i ,a[i]);
			System.out.println();
			
		}
		
		System.out.println("\nSoma das posições A[0] A[1] A[5] : " + soma);
		
	}

}
