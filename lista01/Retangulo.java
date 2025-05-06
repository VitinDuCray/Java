package lista01;

import java.util.Scanner;

public class Retangulo {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vamos calcular a área de um retângulo: ");
		System.out.println("Digite a largura do retângulo: ");
		int largura = sc.nextInt();
		System.out.println("Digite a altura do retângulo: ");
		int altura = sc.nextInt();
		int resultado = largura * altura;
		System.out.println("A área do retângulo é: " + resultado + ".");
		sc.close();
	}
}
