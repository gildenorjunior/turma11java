programa
{
	//EXERCICIO 05
	//Faça um programa que leia um vetor de 5 posições para números reais e, depois,
	//um código inteiro. Se o código for zero, finalize o programa;
	//se for 1, mostre o vetor na ordem direta; se for 2, mostre o vetor na ordem inversa.
	//Caso, o código for diferente de 1 e 2, escreva uma mensagem informando que o código inválido.
	
	funcao inicio()
	{
		const inteiro LIMITE = 5
		inteiro vetor[LIMITE], codigo, valorDigitado, i = 0

		//preenchendo o vetor
		para (i = 0 ; i < LIMITE ; i++)
		{
			escreva("Digite um número: ")
			leia(valorDigitado)
			vetor[i] = valorDigitado
		}
			limpa()
			escreva("Digite o código: ")
			leia(codigo)
			limpa()

			//condições de exibição
			se(codigo == 0)
			{
				escreva("Fim do programa!")
			}senao se (codigo == 1)
			{
				para(i = 0; i < LIMITE ; i++)
				{
					escreva("[", vetor[i], "]")
				}
			}senao se (codigo == 2)
			{
				para(i = 4; i >=0 ; i--)
				{
					escreva("[", vetor[i], "]")
				}
			}senao 
			{
				escreva("Código informado invalido!")	
			}

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
 * @POSICAO-CURSOR = 623; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */