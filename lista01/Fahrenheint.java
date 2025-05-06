package lista01;

import java.util.Scanner;

public class Fahrenheint {
	public static void main(String[]args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Vamos converter uma temperatura em Celsius para Fahrenheint.");
	System.out.println("Digite a temperatura em Celsius: ");
	float celsius = sc.nextFloat();
	float fahrenheint = (float) (celsius * 1.8) + 32;
	System.out.println("Graus em Fahrenheint: " + fahrenheint + ".");
	sc.close();
}
}
