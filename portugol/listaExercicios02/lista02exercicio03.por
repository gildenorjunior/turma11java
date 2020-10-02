programa
{
	/*EXERCICIO 03
	 * 
	 * Desenvolva um sistema em que:
	 *	Leia 4 (quatro) números;
	 *	Calcule o quadrado de cada um;
	 * 	Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
	 *	Caso contrário, imprima os valores lidos e seus respectivos quadrados.
      * 
	 */
	 
	funcao inicio()
	{
		inteiro n1, n2, n3, n4, n1Quadrado, n2Quadrado, n3Quadrado, n4Quadrado

		escreva("Digite o primeiro número: ")
		leia(n1)

		escreva("Digite o segundo número: ")
		leia(n2)

		escreva("Digite o terceiro número: ")
		leia(n3)

		escreva("Digite o quarto número: ")
		leia(n4)

		limpa()

		n1Quadrado = (n1 * n1)

		n2Quadrado = (n2 * n2)

		n3Quadrado = (n3 * n3)

		n4Quadrado = (n4 * n4)

		se (n3Quadrado >= 1000)
		{
			escreva("O quadrado do terceiro número foi: ", n3Quadrado)
		}
		senao
		{
			escreva("O valor lido do primeiro número foi: ", n1, " e seu quadrado: ", n1Quadrado, "\n")
			escreva("O valor lido do segundo número foi: ", n2, " e seu quadrado: ", n2Quadrado, "\n")
			escreva("O valor lido do terceiro número foi: ", n3, " e seu quadrado: ", n3Quadrado, "\n")
			escreva("O valor lido do quarto número foi: ", n4, " e seu quadrado: ", n4Quadrado, "\n")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1185; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */