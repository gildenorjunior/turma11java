package lista01;

import java.util.Scanner;

public class Lista01Exercicio07 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a, b, c, d, e, f;
		double x = 0, y = 0;
		
		System.out.print("Informe o valor de A: ");
		a = leia.nextInt();
		
		System.out.print("Informe o valor de B: ");
		b = leia.nextInt();
		
		System.out.print("Informe o valor de C: ");
		c = leia.nextInt();
		
		System.out.print("Informe o valor de D: ");
		d = leia.nextInt();
		
		System.out.print("Informe o valor de E: ");
		e = leia.nextInt();

		System.out.print("Informe o valor de F: ");
		f = leia.nextInt();
		
		x = (((c * e) - (b * f)) / ((a * e) - (b * d)));

		y = (((a * f) - (c * d)) / ((a * e) - (b * d)));
		
		
		System.out.println("Os valores calculados para X e Y foram: " + x + y);
		System.out.println("Para X: " + x);
		System.out.println("Para y: " + y);
		
		leia.close();
	}

}
