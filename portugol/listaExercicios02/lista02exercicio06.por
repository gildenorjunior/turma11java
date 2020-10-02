programa
{
	/*EXERCICIO 06
	 * 
	 * Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
	 * 
	 */
	funcao inicio()
	{
		cadeia nome
		inteiro idade

		escreva("Digite seu nome: ")
		leia(nome)

		escreva("Digite sua idade: ")
		leia(idade)
		
		limpa()

		se (idade <= 7)
		{
			escreva("Sua categoria é 'Infantil A'")
		}
		senao se (idade >= 8 e idade <= 11)
		{
			escreva("Sua categoria é 'Infantil B'")
		}
		senao se (idade >= 12 e idade <= 13)
		{
			escreva("Sua categoria é 'Juvenil A'")
		}
		senao se (idade >= 14 e idade <= 17)
		{
			escreva("Sua categoria é 'Juvenil B'")
		}
		senao se (idade > 18)
		{
			escreva("Sua categoria é 'Adultos'")
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 132; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */