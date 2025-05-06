package extras;

import java.util.Scanner;

public class MesesDoAno {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número referente ao mês:");
		int mesesdoAno = sc.nextInt();
		
		if (mesesdoAno == 1) {
			System.out.println("");
		}
		else if (mesesdoAno == 1) {
			System.out.println("Janeiro");
		} else if (mesesdoAno == 2) {
			System.out.println("Fevereiro");
		} else if (mesesdoAno == 3) {
			System.out.println("Março");
		} else if (mesesdoAno == 4) {
			System.out.println("Abril");
		} else if (mesesdoAno == 5) {
			System.out.println("Maio");
		} else if (mesesdoAno == 6) {
			System.out.println("Junho");
		} else if (mesesdoAno == 7) {
			System.out.println("Julho");
		} else if (mesesdoAno == 8) {
			System.out.println("Agosto");
		} else if (mesesdoAno == 9) {
			System.out.println("Setembro");
		} else if (mesesdoAno == 10) {
			System.out.println("Outubro");
		} else if (mesesdoAno == 11) {
			System.out.println("Novembro");
		} else if (mesesdoAno == 12) {
			System.out.println("Dezembro");
		}
		sc.close();
	}
}
