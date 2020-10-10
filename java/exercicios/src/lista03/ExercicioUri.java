package lista03;

import java.util.Scanner;

public class ExercicioUri {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int value, count = 1;
		
		System.out.print("Put a number: ");
		value = keyboard.nextInt();
			
		
		while(count <= 12)
		{
			value++;
			count++;
			
			if ((value % 2) == 1)
			{
				System.out.println(value);
			}
		}
	}
}	
		

