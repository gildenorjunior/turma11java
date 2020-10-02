programa
{
	//EXERCICIO 01
	//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
	//atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
	
	funcao inicio()
	{
		inteiro valores[5], valorDigitado = 0, maiorValor = 0

		//loop de repetição para pedir a digitação das cinco pontuações.
		para (inteiro i = 0 ; i <= 4 ; i++ )
		{
			escreva("Pontuação [", i+1, "]: ")
			leia(valorDigitado)
			
			limpa()
			//condicional que verifica se o o valor digitado é o maior
			se (valorDigitado > maiorValor)
			{
				maiorValor = valorDigitado
			}
		}

		//após o loop rodar cinco vezes dentro do vetor e sair, mostra a mensagem de maior valor.
		escreva("A maior pontuação registrada foi: ", maiorValor)
		
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 448; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {valores, 9, 10, 7};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */