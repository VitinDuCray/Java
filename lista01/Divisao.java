package lista01;

import java.util.Scanner;

public class Divisao {
public static void main(String[]args) {

	Scanner sc = new Scanner(System.in);
			
	System.out.println("Digite um número:");
	float numero1 =sc.nextFloat();
	System.out.println("Digite um número:");
	float numero2 =sc.nextFloat();
	float resultado = numero1 / numero2;
	System.out.printf("A divisão dos valores digitados é: %f",resultado);
	sc.close();
}
}
