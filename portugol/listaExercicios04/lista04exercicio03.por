programa
{
	//EXERCICIO 03
	
	//3.  	Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
	//a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
	//b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
	inclua biblioteca Util
	funcao inicio()
	{
		inteiro n1[4][6], n2[4][6], m1[4][6], m2[4][6], linha, coluna

		escreva("PRIMEIRA MATRIZ COM NÚMEROS SOMADOS\n")

		//estrutura que percorre as linhas da matriz
		para (linha = 0 ; linha < 4 ; linha++)
		{
			//estrutura que percorre as colunas, sorteia um número para a posição 
			para(coluna = 0 ; coluna < 6 ; coluna++)
			{
				n1[linha][coluna] = Util.sorteia(1, 10)
				//cada vez que corre o loop para a coluna ele joga o valor anterior e soma na variavel
				m1[linha][coluna] = n1[linha][coluna] + n2 [linha][coluna]
				escreva("[ ", m1[linha][coluna], " ] ")
			
			}

			escreva("\n")
		}

		


		escreva("\n\n")
		escreva("SEGUNDA MATRIZ COM NÚMEROS SUBTRAIDOS\n")

		//estrutura que percorre as linhas da matriz
		para (linha = 0 ; linha < 4 ; linha++)
		{
			//estrutura que percorre as colunas, sorteia um número para a posição 
			para(coluna = 0 ; coluna < 6 ; coluna++)
			{
				n2[linha][coluna] = Util.sorteia(1, 10)
				//cada vez que corre o loop para a coluna ele joga o valor anterior e subtrai na variavel
				m2[linha][coluna] = n1[linha][coluna] - n2 [linha][coluna]
				escreva("[ ", m2[linha][coluna], " ] ")
			
			}

			escreva("\n")
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1385; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */