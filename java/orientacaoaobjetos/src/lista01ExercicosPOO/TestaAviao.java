package lista01ExercicosPOO;

public class TestaAviao {

	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao();
		
		aviao1.capacidade = 100;
		aviao1.companhia = "GOL";
		aviao1.modelo = "Boeing 727";
		aviao1.porte = "Medio";
		
		System.out.println("Modelo do avião: " + aviao1.modelo);
		System.out.println("Companhia do avião: " + aviao1.companhia);
		System.out.println("Porte do avião: " + aviao1.porte);
		System.out.println("Capacidade do avião: " + aviao1.capacidade);
		
		System.out.println();
		aviao1.liga();
	}

}
