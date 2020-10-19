package exerciciosLoianePOO;

public class Contador {

	private static int contador;
	
	//getters and setters
	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Contador.contador = contador;
	}
	
	public static void incrementar() {
		contador++;
	}
	
	public static void zerar() {
		contador = 0;
	}
	
	public static int obterValor() {
		return contador;
	}
	
	
	
	
	
}
