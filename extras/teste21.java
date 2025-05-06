package extras;

import java.util.Scanner;

public class teste21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe as horas:");
		int hora = sc.nextInt();
		System.out.println("Informe os minutos:");
		int minuto = sc.nextInt();
		System.out.println("Informe os segundos:");
		int segundo = sc.nextInt();
		
		for (hora = hora; hora > -1; hora--) {
			for (minuto = minuto; minuto > -1; minuto--) {
				for (segundo  = segundo; segundo > -1; segundo--) {
					System.out.println(hora + ":" + minuto + ":" + segundo);
				}
				segundo = 59;
			}
			minuto = 59;
		}
		
		sc.close();
	}

}
