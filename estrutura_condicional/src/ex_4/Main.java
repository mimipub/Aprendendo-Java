package ex_4;

import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int A, B, C;
			
			System.out.println("Inicio do jogo");
			A = sc.nextInt();
			
			System.out.println("fim do jogo:");
			B = sc.nextInt();
			
			
			if(A<B) {
				C = B-A;
			}
			else {
				C = 24 - (A-B);
			}
			
			System.out.println("O JOGO DUROU " + C + " HORAS (S)");
	}

}
