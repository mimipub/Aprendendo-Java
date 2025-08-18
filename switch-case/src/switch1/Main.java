package switch1;

import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		
/*		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String dia;
		
		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "valor inválido";
			break;
		} 
		System.out.printf("Dia da semana: " + dia);  
		
		sc.close(); */ 
	
		int x = 3;
		int y = 0;
		int i;
		for( i=0; i<=x; i++ ) {
			y = y +5;
			System.out.println(i + "," + y);
			
		}
		
	}

}
