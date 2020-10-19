package lista04ExerciciosJavaBasico;
import java.util.Scanner;
public class TimesRodadas {
	final String[] constante = new String[3];
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] times = {"Corinthians", "Santos", "Palmeiras", "São Paulo"};
		char resultado;
		int pontos[] = new int[4];
		
		for (int i = 0; i < times.length; i++) {
			System.out.println(times[i] );
			for (int j = 0; j < times.length; j++) {
				if(times[i] == times[j]) {
					System.out.println();
				}else {
				System.out.println(times[i] + " X " + times[j] + " = ");
				System.out.println("Qual o resultado? Ganhou - 1 / Perdeu - 2 / Empatou - 3");
				resultado = sc.next().charAt(0);
				if(resultado == '1') {
					pontos[i] += 3;
				}else if(resultado == '2') {
					pontos[i] += 0;
				}else if(resultado == '3') {
					pontos[i] += 1;
				}else {
					System.out.println("Inválido...");
				}
				
				}
			}
		}
		
		for (int i = 0; i < times.length; i++) {
			System.out.println(times[i]);
			System.out.println();
			System.out.println("Total de pontos: " + pontos[i]);
		}
	}
}





