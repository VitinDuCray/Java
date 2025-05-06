package lista01;

import java.util.Scanner; 

public class QuadradoNumero {
	public static void main (String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		int resultado = numero * numero;
		System.out.println (numero + " ao quadrado é: " + resultado + ".");
		sc.close();
	}
 }
