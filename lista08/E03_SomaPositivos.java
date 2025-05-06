package lista08;

import java.util.Scanner;

public class E03_SomaPositivos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int somaNumeros = 0;
		int numero2 = 0;
		
		System.out.println("Digite um número para ser somado:");
		int numero = sc.nextInt();
		somaNumeros += numero;
		
		while (numero2 >= 0) {
		System.out.println("Digite o próximo número para ser somado:");
		numero2 = sc.nextInt();
		somaNumeros += numero2;
		}
		
		somaNumeros = somaNumeros - numero2;
		System.out.println("A soma dos números é igual a: " + somaNumeros);
		
		sc.close();
	}

}
