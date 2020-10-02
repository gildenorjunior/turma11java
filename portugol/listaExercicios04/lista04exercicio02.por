programa
{
	//EXERCICIO 02 (VETORES)
	//Um dado é lançado 10 vezes e o valor correspondente é anotado.
	//Faça um programa que gere um vetor com os lançamentos, escreva esse vetor.
	//A seguir determine e imprima a média aritmética dos lançamentos, contabilize
	//e apresente também quantas foram as ocorrências da maior pontuação

	inclua biblioteca Util -> util
	funcao inicio()
	{
		const inteiro TAMANHOVETOR = 10
		inteiro vetor[TAMANHOVETOR], soma = 0, media = 0, maiorValor = 0, qtdMaiorValor = 0


		//Percorre o vetor e a cada rodada atribui um valor sorteado ao vetor
		para (inteiro posicao = 0 ; posicao <= 9 ; posicao ++)
		{
			vetor[posicao] = Util.sorteia(1, 6)
			escreva("\nLançamento [", posicao+1 , "]: ", vetor[posicao])

			//atribui o valor atual do vetor a variavel soma com o valor anterior
			soma = (soma + vetor[posicao])

			//verifica se a posicao atual do vetor é maior que a variavel (maiorValor) e se for atribui a ela
			se (vetor[posicao] > maiorValor)
			{
				maiorValor = vetor[posicao]
				
			}
			
		}

		//estrutra para percorrer o loop e contar quantas vezes o maior valor apareceu
		para (inteiro posicao = 0 ; posicao <= 9 ; posicao ++)
		{
			se (vetor[posicao] == maiorValor)
			{
				qtdMaiorValor = qtdMaiorValor + 1
			}
		}

		media = (soma / TAMANHOVETOR)
		escreva("\nTotal foi de: ", soma)
		escreva("\nA média dos valores foi de: ", media)
		escreva("\nO maior valor foi: ", maiorValor)
		escreva("\nA quantidade de aparições do maior valor foi de: ", qtdMaiorValor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1124; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */