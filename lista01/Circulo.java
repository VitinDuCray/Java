package lista01;

import java.util.Scanner;

public class Circulo {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		//P = 2 π . r
		System.out.println("Cálculadora de perímetro de um círculo.");
		System.out.println("Informe o diâmetro do círculo: ");
		float diametro = sc.nextFloat();
		float raio = diametro / 2;
		double pi = 3.14;
		double perimetro = 2 * pi * raio;
		System.out.println("O perímetro desse círuclo é de: " + perimetro + ".");
		sc.close();
	}
}
