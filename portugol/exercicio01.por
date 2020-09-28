programa
{
	
	funcao inicio()
	{
		inteiro idadeEmAnos, idadeEmMeses, idadeEmDias
		inteiro totalEmDias = 0
		
		escreva("Digite sua idade expressa em anos: ")
		leia(idadeEmAnos)

		escreva("Digite sua idade expressa em meses: ")
		leia(idadeEmMeses)

		escreva("Digite sua idade expressa em dias: ")
		leia(idadeEmDias)
		
		totalEmDias = totalEmDias + (idadeEmAnos * 365) //convertendo de ano para dias
		escreva("Sua idade de em dias é: ", totalEmDias, " dias.")

		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 466; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */