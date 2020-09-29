programa
{
	
	funcao inicio()
	{
		/*
		 * O custo ao consumidor de um carro novo é a soma do custo 
		 * de fábrica com a percentagem do distribuidor e dos impostos 
		 * (aplicados ao custo de fábrica). Supondo que a percentagem 
		 * do distribuidor seja de 28% e os impostos de 45%, escrever 
		 * um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. 
		 * 
		 * 
		 * custo consumidor = custo de fabrica + porcentagem distribuidor + impostos
		 */

		real porcentagemDistribuidor = 0.28, impostos = 0.45, custoFabrica = 0, custoConsumidor = 0


		escreva("Qual foi o custo de fábrica do veiculo? ")
		leia(custoFabrica)

		custoConsumidor = (custoFabrica + ((porcentagemDistribuidor * custoFabrica) + (impostos * custoFabrica)))

		escreva("O custo do seu carro novo foi de: ", custoConsumidor)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 536; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */