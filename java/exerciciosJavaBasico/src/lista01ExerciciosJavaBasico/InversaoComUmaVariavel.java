package lista01ExerciciosJavaBasico;

public class InversaoComUmaVariavel {

	public static void main(String[] args) {
		int a=5, b=9;
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("A: " + a + " B: " + b);

	}

}
