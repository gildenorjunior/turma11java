/*Criar um vetor A com 5 elementos inteiros.
 *Construir um vetor B de mesmo tipo e tamanho e com os "mesmos" elementos do vetor A,
 * ou seja, B[i] = A[i].
 */

package exerciciosLoianeVetores;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetorA[] = new int[5];
		int vetorB[] = new int[vetorA.length];
		int valor;
		
		//PREENCHENDO O VETOR COM O VALOR DIGITADO E IGUAL O VALOR DO VETOR (A) PARA O VETOR (B)
		for(int i = 0 ; i < vetorA.length ; i++) {
			System.out.print("Digite um valor para o vetor: ");
			valor = leia.nextInt();
			vetorA[i] = valor;
			vetorB[i] = vetorA[i];
		}
		
		System.out.println();
		//IMPRIMINDO O VETOR A
		System.out.println("VETOR A");
		for(int i = 0 ; i < vetorA.length ; i++) {
			System.out.print("["+ vetorA[i]+ "] ");
		}
		
		System.out.println();
		System.out.println();
		//IMPRIMINDO O VETOR B
		System.out.println("VETOR B");
		for(int i = 0 ; i < vetorA.length ; i++) {
			System.out.print("["+ vetorB[i]+ "] ");
		}

	}

}
