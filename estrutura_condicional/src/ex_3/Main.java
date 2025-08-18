package ex_3;

import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int A, B;
		
		System.out.println("Digite um valor inteiro");
		A = sc.nextInt();
		System.out.println("Digite o segundo valor inteiro:");
		B = sc.nextInt();
		
		if ( A%B==0 || B%A ==0 ) {
			System.out.println(A + " é multiplo de " + B);
		}
		else {
			System.out.println(A +" não é multiplo de " + B);
		}
		
		sc.close();
	}

}
