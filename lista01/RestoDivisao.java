package lista01;

import java.util.Scanner;

public class RestoDivisao {
public static void main(String[]args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite um  número:");
	float numero1 =sc.nextFloat();
	System.out.println("Digite um número:");
	float numero2 =sc.nextFloat();
	float resultado = numero1 / numero2;
	float resto = numero1 % numero2;
	System.out.println("A divisão dos valores digitados é: " + resultado);
	System.out.println("O resto da divisão é: " + resto);
	sc.close();
	
}
}