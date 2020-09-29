programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		/*
		 * Construa um programa em c que, tendo como dados de entrada 
		 * dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), 
		 * escreva a distância entre eles. 
		 * 
		 */

		inteiro x1, x2, y1, y2, distancia

		escreva("Digite uma entrada para o primeiro ponto em X no plano: ")
		leia(x1)

		escreva("Digite uma entrada para o segundo ponto em X no plano: ")
		leia(x2)

		escreva("Digite uma entrada para o segundo ponto em Y no plano: ")
		leia(y1)

		escreva("Digite uma entrada para o segundo ponto em Y no plano: ")
		leia(y2)

		distancia = mat.raiz((mat.potencia((x2 - x1), 2) + (mat.potencia(y2 - y1, 2))), 2)

		escreva("O resultado da operação é: ", distancia)
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 751; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */