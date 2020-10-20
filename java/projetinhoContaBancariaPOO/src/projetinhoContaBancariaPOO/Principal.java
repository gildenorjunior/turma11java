package projetinhoContaBancariaPOO;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int escolhaTipoConta, escolhaAcoesConta, valorEmprestimo;
		double valorCredito, valorDebito;
		char condicaoParada = 'S';

		ContaCorrente contaCorrente = new ContaCorrente();
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		ContaEmpresa contaEmpresa = new ContaEmpresa();
		ContaEspecial contaEspecial = new ContaEspecial();

		System.out.println("════════════════════════════════════════════════");
		System.out.println("═══════════════ BANCO GENERATION ═══════════════");
		System.out.println("════════════════════════════════════════════════\n");

		Scanner leia = new Scanner(System.in);

		System.out.print("Por favor, selecione o tipo da sua conta: ");
		System.out.print("\n[1] - Conta corrente\n" + "[2] - Conta Poupança\n" + "[3] - Conta Empresa\n"
				+ "[4] - Conta Especial\n" + "Digite a opção escolhida: ");
		escolhaTipoConta = leia.nextInt();

		switch (escolhaTipoConta) {
		case 1: { // conta corrente

			System.out.print("\nDigite seu nome: ");
			contaCorrente.setNomeCliente(leia.next());

			System.out.print("Digite o número da conta: ");
			contaCorrente.setNumConta(leia.nextInt());

			do {

				System.out.println("\nVocê está na conta Corrente, o que você deseja fazer: ");
				System.out.print("[1] - Creditar em conta\n" + "[2] - Debitar em conta\n"
						+ "[3] - Emitir novo Talonário\n" + "[4] - Consultar Saldo\n" + "\nDigite a opção escolhida: ");
				escolhaAcoesConta = leia.nextInt();

				if (escolhaAcoesConta == 1) {
					System.out.print("Quanto deseja creditar a conta: ");
					valorCredito = leia.nextDouble();
					contaCorrente.credite(valorCredito);
				} else if (escolhaAcoesConta == 2) {
					System.out.print("Quanto deseja debitar da conta: ");
					valorDebito = leia.nextDouble();
					contaCorrente.debite(valorDebito);
				} else if (escolhaAcoesConta == 3) {
					contaCorrente.emiteTalonario();
					System.out.print("Novo talonário emitido com sucesso!");
				} else if (escolhaAcoesConta == 4) {
					System.out.print("Seu saldo é de: " + contaCorrente.getSaldo());
				}

				System.out.print("\nDeseja ver novamente o menu de opções para Conta Corrente [S/N]: ");
				condicaoParada = leia.next().toUpperCase().charAt(0);

				for (int i = 0; i < 50; i++) {
					System.out.println();
				}

			} while (condicaoParada != 'N');

			break;
		}
		case 2: { // conta poupança

			contaPoupanca.setJuros(0.02);
			contaPoupanca.setCorrecaoMonetaria(0.2);

			System.out.print("\nDigite seu nome: ");
			contaPoupanca.setNomeCliente(leia.next());

			System.out.print("Digite o número da conta: ");
			contaPoupanca.setNumConta(leia.nextInt());

			System.out.print("Por favor, digite o mês do seu aniversário: ");
			contaPoupanca.setMesAniversario(leia.nextInt());

			do {

				System.out.println("\nVocê está na conta Poupança, o que você deseja fazer: ");
				System.out.print("[1] - Creditar em conta\n" + "[2] - Debitar em conta\n" + "[3] - Consultar Saldo\n"
						+ "Digite a opção escolhida: ");
				escolhaAcoesConta = leia.nextInt();

				if (escolhaAcoesConta == 1) {
					System.out.print("Quanto deseja creditar a conta: ");
					valorCredito = leia.nextDouble();
					contaPoupanca.credite(valorCredito);
				} else if (escolhaAcoesConta == 2) {
					System.out.print("Quanto deseja debitar da conta: ");
					valorDebito = leia.nextDouble();
					contaPoupanca.debite(valorDebito);
				} else if (escolhaAcoesConta == 3) {
					System.out.print("Seu saldo é de: " + contaCorrente.getSaldo());
				}

				//contaPoupanca.aniversarioMes(); // verificar o método debite da conta bancaria

				System.out.println("\nDeseja ver novamente o menu de opções para Conta Poupanca [S/N]: ");
				condicaoParada = leia.next().toUpperCase().charAt(0);

				for (int i = 0; i < 50; i++) {
					System.out.println();
				}

			} while (condicaoParada != 'N');

			break;
		}
		case 3: { // conta empresa

			System.out.print("\nDigite seu nome: ");
			contaEmpresa.setNomeCliente(leia.next());

			System.out.print("Digite o número da conta: ");
			contaEmpresa.setNumConta(leia.nextInt());

			System.out.print("Qual seu limite: ");
			contaEmpresa.setLimiteEmpresa(leia.nextDouble());

			

			do {
				
				System.out.println("\nVocê está na conta Empresa, o que você deseja fazer: ");
				System.out.print("[1] - Creditar em conta\n" + "[2] - Debitar em conta\n" + "[3] - Empréstimo\n[4] - Consultar Saldo\n"
						+ "Digite a opção escolhida: ");
				escolhaAcoesConta = leia.nextInt();

				if (escolhaAcoesConta == 1) {
					System.out.print("Quanto deseja creditar a conta: ");
					valorCredito = leia.nextDouble();
					contaEmpresa.credite(valorCredito);
				} else if (escolhaAcoesConta == 2) {
					System.out.print("Quanto deseja debitar da conta: ");
					valorDebito = leia.nextDouble();
					contaEmpresa.debite(valorDebito);
				} else if (escolhaAcoesConta == 3) {
					System.out.print("Qual o valor de empréstimo que você deseja: ");
					valorEmprestimo = leia.nextInt();
					contaEmpresa.emprestimoSalarial(valorEmprestimo);
					System.out.print("Seu emprestimo foi de: " + valorEmprestimo + ", seu saldo atual é de: "
							+ contaEmpresa.getSaldo());
				} else if (escolhaAcoesConta == 4) {
					System.out.print("Seu saldo é de: " + contaEmpresa.getSaldo());
				}

				System.out.println("\nDeseja ver novamente o menu de opções para Conta Empresa [S/N]: ");
				condicaoParada = leia.next().toUpperCase().charAt(0);

				for (int i = 0; i < 50; i++) {
					System.out.println();
				}

			} while (condicaoParada != 'N');

			break;
		}

		case 4: { // conta especial

			System.out.print("\nDigite seu nome: ");
			contaEspecial.setNomeCliente(leia.next());

			System.out.print("Digite o número da conta: ");
			contaEspecial.setNumConta(leia.nextInt());

			System.out.print("Qual seu limite: ");
			contaEspecial.setLimite(leia.nextDouble());


			do {
				
				System.out.println("\nVocê está na conta Especial, o que você deseja fazer: ");
				System.out.print("[1] - Creditar em conta\n" + "[2] - Debitar em conta\n" + "[3] - Consultar Saldo\n"
						+ "Digite a opção escolhida: ");
				escolhaAcoesConta = leia.nextInt();
				

				if (escolhaAcoesConta == 1) {
					System.out.print("Quanto deseja creditar a conta: ");
					valorCredito = leia.nextDouble();
					contaEspecial.credite(valorCredito);
				} else if (escolhaAcoesConta == 2) {
					System.out.print("Quanto deseja debitar da conta: ");
					valorDebito = leia.nextDouble();
					contaEspecial.debite(valorDebito);
				} else if (escolhaAcoesConta == 3) {
					System.out.print("Seu saldo é de: " + contaEspecial.getSaldo());
				}

				//contaEspecial.calculaJuros();

				System.out.println("\nDeseja ver novamente o menu de opções para Conta Especial [S/N]: ");
				condicaoParada = leia.next().toUpperCase().charAt(0);

				for (int i = 0; i < 50; i++) {
					System.out.println();
				}

			} while (condicaoParada != 'N');
			break;
		}
		}

		leia.close();

		System.out.println("Muito obrigado pela preferência no Banco Generation!");

	}

}
