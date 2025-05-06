package extras;

import java.util.Scanner;

public class DiaDaSemana {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número referente ao dia:");
		int diadaSemana = sc.nextInt();

		if (diadaSemana == 1) {
			System.out.println("Domingo");
		} else if (diadaSemana == 2) {
			System.out.println("Segunda-feira");
		} else if (diadaSemana == 3) {
			System.out.println("Terça-feira");
		} else if (diadaSemana == 4) {
			System.out.println("Quarta-feira");
		} else if (diadaSemana == 5) {
			System.out.println("Quinta-feira");
		} else if (diadaSemana == 6) {
			System.out.println("Sexta-feira");
		} else if (diadaSemana == 7) {
			System.out.println("Sábado");
		} else {
			System.out.println("Não há dia correspondente.");
		}
		sc.close();
	}
}
