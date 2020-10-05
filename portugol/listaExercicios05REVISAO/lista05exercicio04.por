programa
{
	//EXERCICIO 04
	//Faça um programa que calcula e escreve a seguinte soma: soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50
	funcao inicio()
	{

		inteiro primeiroNumero = 1, segundoNumero = 1, soma = 0
		
		faca
		{
			escreva(primeiroNumero, "/", segundoNumero, " + ")
			soma = soma + primeiroNumero / segundoNumero
			primeiroNumero = primeiroNumero + 2
			segundoNumero = segundoNumero + 1
		}enquanto (primeiroNumero <= 99 e segundoNumero <= 50)

		escreva("\nSoma = ", soma)
		
	}

	funcao pula()
	{
		escreva("")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 471; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */