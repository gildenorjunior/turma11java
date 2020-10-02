programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		inteiro a, b, c, r, s, d

		escreva("Digite o primeiro valor: ")
		leia(a)

		escreva("Digite o segundo valor: ")
		leia(b)

		escreva("Digite o terceiro valor: ")
		leia(c)

		r = mat.potencia((a + b), 2)
		s = mat.potencia((b + c), 2)


		d = (r + s) / 2

		escreva("O valor de d é: ", d, "\n")
		escreva("O valor de r é: ", r, "\n")
		escreva("O valor de s é: ", s, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 304; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */