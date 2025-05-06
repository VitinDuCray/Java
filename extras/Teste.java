package extras;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("minutos");
		int minutoInput = sc.nextInt();
		System.out.println("segundos");
		int segundoInput = sc.nextInt();
		
		for (int minuto = minutoInput; minuto > -1; minuto--) {
            int segundoInicio = (minuto == minutoInput) ? segundoInput : 59;
            for (int segundo = segundoInicio; segundo > -1; segundo--) {
                System.out.println("Minuto: " + minuto + " Segundo: " + segundo);
            }
        }
		
		sc.close();
	}

}
