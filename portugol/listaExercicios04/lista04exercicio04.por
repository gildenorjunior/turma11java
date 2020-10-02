programa
{
	//EXERCICIO 04
	//Crie um programa que receba valores do usuário para preencher uma matriz 3X3,
	//e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal,
	//ou seja, diagonal principal.

	funcao inicio()
	{
		const inteiro TAMANHOLINHA = 3, TAMANHOCOLUNA = 3
		inteiro linha, coluna, somaValores = 0, somaDiagonal = 0 
		inteiro matriz[TAMANHOLINHA][TAMANHOCOLUNA]

		//estrutura que percorre as linhas da matriz
		para (linha = 0 ; linha < TAMANHOLINHA ; linha++)
		{
			//estrutura que percorre a coluna da matriz e a cada loop pergunta os valores para o usuario
			 para (coluna = 0 ; coluna < TAMANHOCOLUNA ; coluna++)
			 {
			 	escreva("\nDigite o valor da linha [", linha, "] e da coluna [", coluna, "]: ")
			 	leia(matriz[linha][coluna])

				//armazena os valores digitados para a matriz na variavel somaValores
				somaValores = (somaValores + matriz[linha][coluna])

			 }
			//cada vez que passa um loop de linha pega os valores iguais da linha e armazena na variavel somaDiagonal
			somaDiagonal = (somaDiagonal + matriz[linha][linha])
		}

		limpa()

		//estrutura que depois de todos os valores armazenados exibe-os na tela 
		para (linha = 0 ; linha < TAMANHOLINHA ; linha++)
		{
			para (coluna = 0 ; coluna < TAMANHOCOLUNA ; coluna++)
			{
				escreva("[", matriz[linha][coluna], "]")
			}
			escreva("\n")
		}

		escreva("\nSoma de todos os valores da matriz é: ", somaValores)
		escreva("\nSoma da diagonal da matriz é: ", somaDiagonal)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1184; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */