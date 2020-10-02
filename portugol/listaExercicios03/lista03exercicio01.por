programa
{
	//EXERCICIO 01 (LAÇO PARA)
	funcao inicio()
	{
		//VARIAVEIS
		inteiro numeroHabitantes, salario = 0, mediaSalario = 0, mediaFilhos = 0, qtdFilhos = 0, 
		inteiro maiorSalario = 0, percentualPessoas = 0, contadorSalario = 0, contadorFilhos = 0


		//LAÇO DE REPETIÇÃO
		para (numeroHabitantes = 1; numeroHabitantes <= 3; numeroHabitantes++)
		{

			//MENSAGEM PARA O USUARIO SOLICITANDO OS DADOS
			escreva("Olá habitante nº ", numeroHabitantes, " , por favor, digite o seu salário: ")
			leia(salario)

				//CONDICAO QUE VERIFICA DE SALARIO ATÉ 100 E GUARDA EM PERCENTUAL PARA CALCULAR DEPOIS
				se (salario > 0 e salario <= 100)
				{
					percentualPessoas = ( percentualPessoas + 1 )
				}

				//VERIFICA SE É O MAIOR SALARIO E GUARDA NA VARIAVEL
				se (salario > maiorSalario)
				{
					maiorSalario = salario
				}

			
			//CONTADOR GUARDAR UM SALARIO EM CIMA DO OUTRO	
			contadorSalario = ( contadorSalario + salario )

			//MENSAGEM PARA O USUARIO SOLICITANDO OS DADOS
			escreva("Agora por favor, digite sua quantidade de filhos: ")
			leia(qtdFilhos)

			//CONTADOR QUE FAZ O ADICIONAR A QUANTIDADE DE FILHOS UM EM CIMA DO OUTRO
			contadorFilhos = contadorFilhos + qtdFilhos

			limpa()
			
		}


		//FAZENDO OS CALCULOS DE MÉDIAS E PERCENTUAL
		mediaSalario = ( contadorSalario / numeroHabitantes )
		mediaFilhos = ( contadorFilhos / numeroHabitantes )
		percentualPessoas = (percentualPessoas / numeroHabitantes)


		//EXIBIÇÃO FINAL PARA O USUARIO COM OS DADOS CALCULADOS
		escreva("A média dos salários da população foi de: ", mediaSalario, " reias.")
		
		pulaLinha()
		
		escreva("A média de filhos da população foi de: ", mediaFilhos, " filhos por pessoa.")

		pulaLinha()
		
		escreva("O maior salário entre a população foi de: ", maiorSalario, " reais.")

		pulaLinha()

		escreva("O percentual de pessoas que ganham até 100 reais foi de: ", percentualPessoas, "% porcento.")
		
	}

	funcao pulaLinha()
	{
		escreva("\n")
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 257; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */