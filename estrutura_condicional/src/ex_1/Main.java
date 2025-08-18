package ex_1;

import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		System.out.println("Digite um número inteiro:");
		x = sc.nextInt();
		
		if(x > 0) {
			System.out.println("POSITIVO");
		}
		else if(x == 0){
			System.out.println("NULO");
		} 
		else{
			System.out.println("NEGATIVO");
		}
		sc.close();
	}

}
