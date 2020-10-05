programa
{

	//Elabore um programa que calcule o que deve ser pago por um produto, considerando o preço normal
	//de etiqueta e a escolha da condição de pagamento. Utilize os códigos da tabela a seguir para ler qual
	//a condição de pagamento escolhida e efetuar o cálculo adequado. 
	//Código Condição de pagamento 
	//1 À vista em dinheiro ou cheque, recebe 20% de desconto 
	//2 À vista no cartão de crédito, recebe 15% de desconto 
	//3 Em duas vezes, preço normal de etiqueta sem juros 
	//4 Em três vezes, preço normal de etiqueta mais juros de 10%

	funcao inicio()
	{
		cadeia roupas[4] = {"Jaqueta","Bermuda","Camisa","Calça"}
		real preco[4] = {200.0, 90.0, 80.0, 120.0}
		real pagamentoFinal = 0.0
		inteiro opcaoRoupaEscolhida = 0, opcaoPagamentoEscolhida = 0
		cadeia pagamento[4] = {"À vista em dinheiro ou cheque, recebe 20% de desconto.",
		"À vista no cartão de crédito, recebe 15% de desconto. ",
		"Em duas vezes, preço normal de etiqueta sem juros.",
		"Em três vezes, preço normal de etiqueta mais juros de 10%."}
		

		escreva("\tMostruário: ")
		pula()

		//escreva("(1) Jaqueta \t R$200,00 \n(2)Bermuda \t R$90,00 \n(3) Camisa \t R$80,00 \n(4) Calça \t R$120,00")

		pula()

		//mostrando na tela os dois vetores de roupas e preco
		para(inteiro i = 0 ; i < 4 ; i++)
		{
			escreva("(", i+1, ") ", roupas[i])
			escreva("\tR$", preco[i])
			pula()
		}

		pula()
		escreva("Escolha uma das opções: ")
		leia(opcaoRoupaEscolhida)

		//condicao caso o usuario digite um numero fora do vetor
		se (opcaoRoupaEscolhida > 4 ou opcaoRoupaEscolhida <= 0)
		{
			escreva("Opção Invalida, por favor, digite novamente: ")
			leia(opcaoRoupaEscolhida)
		}
		
		
		limpa()

		escreva("A opção escolhida foi: ", roupas[(opcaoRoupaEscolhida - 1 )], " R$", preco[(opcaoRoupaEscolhida - 1 )])

		pula()
		pula()
		
		escreva("Escolha uma das opções de pagamento: ")
		pula()
		pula()

		//mostrando na tela todo o vetor de condições de pagamento
		para(inteiro i = 0 ; i < 4 ; i++)
		{
			escreva("(", i+1, ") ", pagamento[i])
			pula()
		}

		pula()
		escreva("Escolha uma das opções: ")
		leia(opcaoPagamentoEscolhida)

		//condicao caso o usuario digite um numero fora do vetor
		se (opcaoRoupaEscolhida > 4 ou opcaoRoupaEscolhida <= 0)
		{
			escreva("Opção Invalida, por favor, digite novamente: ")
			leia(opcaoRoupaEscolhida)
		}

		limpa()


		//condicao escolha-caso, pegando a opcao escolhida pelo user e fazendo o calculo das condições de pagamento de acordo.
		escolha (opcaoPagamentoEscolhida)
		{
		caso 1:		
		escreva ("A opção escolhida foi: ", pagamento[opcaoPagamentoEscolhida - 1])
		pula()
		pula()
		pagamentoFinal = preco[opcaoRoupaEscolhida - 1] - (preco[opcaoRoupaEscolhida - 1] * 20/100)
		//pagamentoFinal = ((preco[opcaoRoupaEscolhida - 1]) - ((20/100) * preco[opcaoRoupaEscolhida - 1]))
		escreva("O valor final da sua compra é de: R$", pagamentoFinal)
		pare

		caso 2:		
		escreva ("A opção escolhida foi: ", pagamento[opcaoPagamentoEscolhida - 1])
		pula()
		pula()
		pagamentoFinal = preco[opcaoRoupaEscolhida - 1] - (preco[opcaoRoupaEscolhida - 1] * 15/100)
		escreva("O valor final da sua compra é de: R$", pagamentoFinal)
		pare

		caso 3:		
		escreva ("A opção escolhida foi: ", pagamento[opcaoPagamentoEscolhida - 1])
		pula()
		pula()
		pagamentoFinal = preco[opcaoRoupaEscolhida - 1]
		escreva("O valor final da sua compra é de: R$", pagamentoFinal, "parcelado em duas vezes fica: R$", (pagamentoFinal/2))
		pare

		caso 4:
		escreva ("A opção escolhida foi: ", pagamento[opcaoPagamentoEscolhida - 1])
		pula()
		pula()
		pagamentoFinal = preco[opcaoRoupaEscolhida - 1] + (preco[opcaoRoupaEscolhida - 1] * 10/100)
		escreva("O valor final da sua compra é de: R$", pagamentoFinal, " parcelado em três vezes fica: R$", (pagamentoFinal/3))
		pare

		caso contrario:
		escreva("Opção invalida, por favor, digite novamente: ")
		leia(opcaoPagamentoEscolhida)
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
 * @POSICAO-CURSOR = 3728; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */