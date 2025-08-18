package cond_ternaria;

import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		
		/*double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05 ;
		
		System.out.println(desconto);
		*/
		
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		
		while( x != 0 ){
			soma =+ soma + x;
			x = sc.nextInt();
			
		}	
		System.out.println(soma);
		
		sc.close();

		
		
	}

}
// importante//