package lista08;

import java.util.Scanner;

public class E02_Regressiva {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tempo para a bomba explodir:");
		int numero = sc.nextInt();
		
		while (numero >= 0) {
			System.out.println(numero);
			numero --;
		}
		
		sc.close();
	}
}
