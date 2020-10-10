/*Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. 
Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.
*/

package lista04;

import java.util.Scanner;

public class Lista04Exercicio04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int primeiraMatriz[][] = new int[2][2];
		int segundaMatriz[][] = new int[2][2];
		int matrizAdicional[][] = new int[2][2];
		int valor, escolha = 0, constante = 0, escolhaColuna, escolhaLinha, escolhaMatriz;

		//SOLICITANDO AO USUARIO OS VALORES DA PRIMEIRA MATRIZ
		System.out.println("PRIMEIRA MATRIZ");
		for (int linha = 0; linha < 2; linha++) {
			for (int coluna = 0; coluna < 2; coluna++) {
				System.out.printf("Digite um valor para linha [%d] e coluna [%d]: ", linha, coluna);
				valor = leia.nextInt();
				primeiraMatriz[linha][coluna] = valor;
			}
		}
		
		//SOLICITANDO AO USUARIO OS VALORES DA SEGUNDA MATRIZ
		System.out.println();
		System.out.println("SEGUNDA MATRIZ");
		System.out.println();
		for (int linha = 0; linha < 2; linha++) {
			for (int coluna = 0; coluna < 2; coluna++) {
				System.out.printf("Digite um valor para linha [%d] e coluna [%d]: ", linha, coluna);
				valor = leia.nextInt();
				segundaMatriz[linha][coluna] = valor;
			}
		}
		
		//MOSTRANDO O MENU DE OPÇÕES
		System.out.println();
		System.out.println("ESCOLHA UMA DAS OPÇÕES:\n" 
				+ "(1) somar as duas matrizes \n"
				+ "(2) subtrair a primeira matriz da segunda \n" 
				+ "(3) adicionar uma constante as duas matrizes\n"
				+ "(4) imprimir as matrizes ");
		System.out.println();
		System.out.print("Escolha uma das opções: ");
		escolha = leia.nextInt();
		System.out.println();
		
		//CONDIÇÕES DE ESOLHA
		//CASO 1 - SOMA DAS DUAS MATRIZES
		if (escolha == 1) {
			System.out.println("SOMA DAS DUAS MATRIZES");
			for (int linha = 0; linha < 2; linha++) {
				for (int coluna = 0; coluna < 2; coluna++) {
					matrizAdicional[linha][coluna] = primeiraMatriz[linha][coluna] + segundaMatriz[linha][coluna];
					System.out.print("[" + matrizAdicional[linha][coluna] + "]");
				}
				System.out.println();
			}
		//CASO 2 - SUBTRAÇÃO DAS MATRIZES
		} else if (escolha == 2) {				
			System.out.println("SUBTRAÇÃO DAS DUAS MATRIZES");
			for (int linha = 0; linha < 2; linha++) {
				for (int coluna = 0; coluna < 2; coluna++) {
					matrizAdicional[linha][coluna] = primeiraMatriz[linha][coluna] - segundaMatriz[linha][coluna];
					System.out.print("[" + matrizAdicional[linha][coluna] + "]");
				}
				System.out.println();
			}
		//CASO 3 - ADIÇÃO DE UMA CONSTANTE	
		} else if (escolha == 3) {	
			System.out.print("Qual o valor constante que você deseja adicionar? ");
			constante = leia.nextInt();

			System.out.print("Em qual posição de linha você deseja adicionar? ");
			escolhaLinha = leia.nextInt();

			System.out.print("Em qual posição de coluna você deseja adicionar? ");
			escolhaColuna = leia.nextInt();
			
			System.out.print("Em qual matriz você deseja adicionar? [1 ou 2]: ");
			escolhaMatriz = leia.nextInt();
				//CONDIÇÃO CASO O USUARIO ESCOLHA ADICIONAR A CONST NA MATRIZ 1
				if(escolhaMatriz == 1) {
					primeiraMatriz[escolhaLinha][escolhaColuna] = constante;
					System.out.println();
					for (int linha = 0 ; linha < 2 ; linha++) {
						for (int coluna = 0 ; coluna < 2 ; coluna++) {
							System.out.print("[" + primeiraMatriz[linha][coluna] + "]");
						}
						System.out.println();
					}
				//CONDIÇÃO CASO O USUARIO ESCOLHA ADICIONAR A CONST NA MATRIZ 2
				} else if(escolhaMatriz == 2) {	
					segundaMatriz[escolhaLinha][escolhaColuna] = constante;
					System.out.println();
					for (int linha = 0 ; linha < 2 ; linha++) {
						for (int coluna = 0 ; coluna < 2 ; coluna++) {
							System.out.print("[" + segundaMatriz[linha][coluna] + "]");
						}
						System.out.println();
					}
				}
		//CONDIÇÃO CASO USUARIO ESCOLHA A OPÇÃO 4 DO MENU ONDE APENAS MOSTRA AS DUAS MATRIZES
		} else if (escolha == 4) {
			System.out.println("PRIMEIRA MATRIZ");
			for (int linha = 0; linha < 2; linha++) {
				for (int coluna = 0; coluna < 2; coluna++) {
					System.out.print("[" + primeiraMatriz[linha][coluna] + "] ");
				}
				System.out.println();
			}

			System.out.println();
			System.out.println("SEGUNDA MATRIZ");
			for (int linha = 0; linha < 2; linha++) {
				for (int coluna = 0; coluna < 2; coluna++) {
					System.out.print("[" + segundaMatriz[linha][coluna] + "] ");
				}
				System.out.println();
			}

		}
	}
}
