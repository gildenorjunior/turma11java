programa
{
	//EXERCICIO 03
	//Escrever um programa que leia uma quantidade desconhecida de números e conte quantos
	//deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100].
	//A entrada de dados deve terminar quando for lido um número negativo.

	funcao inicio()
	{

		inteiro valorDigitado, primeiroIntervalo = 0, segundoIntervalo = 0, terceiroIntervalo = 0, quartoIntervalo = 0 
				
		//enquanto o número digitado não for negativo pede para o user digitar novamente
		//e enquadra o numero na categoria adequada
		 
		faca 
		{
			escreva("Digite um número: ")
			leia(valorDigitado)
			
			se (valorDigitado >= 0 e valorDigitado<= 25)
			{
				primeiroIntervalo = primeiroIntervalo + 1
			}senao se (valorDigitado >= 26 e valorDigitado <= 50)
			{
				segundoIntervalo = segundoIntervalo + 1
			}senao se (valorDigitado >= 51 e valorDigitado <= 75)
			{
				terceiroIntervalo = terceiroIntervalo + 1
			}senao se (valorDigitado >= 76 e valorDigitado <= 100)
			{
				quartoIntervalo = quartoIntervalo + 1
			}
			
			limpa()
		}enquanto (valorDigitado > 0)

		
		escreva("Quantidade de valores do primeiro intervalo: ", primeiroIntervalo)
		escreva("\nQuantidade de valores do segundo intervalo: ", segundoIntervalo)
		escreva("\nQuantidade de valores do terceiro intervalo: ", terceiroIntervalo)
		escreva("\n Quantidade de valores do quarto intervalo: ", quartoIntervalo)
		
	}

	funcao pula()
	{
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1084; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */