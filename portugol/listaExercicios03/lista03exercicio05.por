programa
{
	//EXERCICIO 05 (USANDO FAÇA ENQUANTO)
	//Faça um programa que mostre uma contagem na tela de 233 a 456,
	//só que contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.
	inclua biblioteca Util
	funcao inicio()
	{
		inteiro inicio = 233, FIM = 456, contador = 0
		faca
		{

			escreva("»»»»»»»»»»»»»»»»»»»»»»»»»»", inicio, "»»»»»»»»»»»»»»»»»»»»»»»»»»\n")
			escreva("»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»\n")

			se (inicio >= 300 e inicio <= 400)
			{
				inicio = inicio + 3
			}
			senao
			{
				inicio = inicio + 5
			}
		}
		enquanto (inicio <= FIM)


	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 311; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */