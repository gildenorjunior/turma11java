programa
{
	
	funcao inicio()
	{
		inteiro diaAniversario, idadeEmAnos, idadeEmMes, idadeEmDias
		escreva("Digite sua idade em dias: ")
		leia(diaAniversario)

		idadeEmAnos = (diaAniversario / 365) //calculando a idade em anos
		idadeEmMes = ((diaAniversario % 365) / 30)
		idadeEmDias = ((diaAniversario % 365) % 30)

		escreva("Sua idade em anos é: ", idadeEmAnos, "\n")
		escreva("Sua idade em meses é: ", idadeEmMes, "\n")
		escreva("Sua idade em dias é: ", idadeEmDias, "\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 191; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */