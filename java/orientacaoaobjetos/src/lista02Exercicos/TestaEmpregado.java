package lista02Exercicos;

public class TestaEmpregado {

	public static void main(String[] args) {
		
		Empregado empregado1 = new Empregado("José", "Av. E", "(11) 91111-2222", 001, 1045, 10);
		
		System.out.println("Mostrando os atributos do Empregado 1: ");
		System.out.println("Nome: " + empregado1.getNome());
		System.out.println("Endereço: " + empregado1.getEndereco());
		System.out.println("Telefone: " + empregado1.getTelefone());
		System.out.println("Código do Setor: " + empregado1.getCodigoSetor());
		System.out.println("Salario Base: " + empregado1.getSalarioBase());
		System.out.println("Imposto: " + empregado1.getImposto());		
		System.out.println("Salario Calculado: " + empregado1.calcularSalario(1045, 10));

	}

}
