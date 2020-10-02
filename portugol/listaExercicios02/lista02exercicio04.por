programa
{

	/*EXERCICIO 04
	 * 
	 * Faça um sistema que leia um número inteiro e mostre uma mensagem indicando 
	 * se este número é par ou ímpar, e se é positivo ou negativo.
	 * 
	 */
	
	funcao inicio()
	{
		inteiro n

		escreva("Digite um número: ")
		leia(n)

		limpa()


		se ((n % 2) != 0 e (n > 0))
		{
			escreva("Este número é impar e positivo!") 
		}
		senao se ((n % 2) != 0 e (n  < 0))
		{
			escreva("Este número é impar e negativo!")
		}
		senao se ((n % 2) == 0 e (n > 0))
		{
			escreva("Este número é par e positivo!")
		}
		senao se ((n % 2) == 0 e (n < 0))
		{
			escreva("Este número é par e negativo!")
		}
		senao
		{
			escreva("Zero é neutro!")
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 640; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */