package lista01;

import java.util.Scanner;

public class MediaAritmetica {
	public static void main (String [] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Vamos calcular a média aritmética que desejar.");
	System.out.println("Digite um número: ");
	int numero1 = sc.nextInt();
	System.out.println("Digite outro número: ");
	int numero2 = sc.nextInt();
	System.out.println("Digite outro número: ");
	int numero3 = sc.nextInt();
	int resultado = (numero1 + numero2 + numero3) / 3;
	System.out.println("A média aritmética é: " + resultado + ".");
	sc.close();

	}
}
