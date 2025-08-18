package ex_5;

import java.util.Locale;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int a,b, a1,b1;
		double c, c1, calc1, calc2, fim;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextDouble();
		
		calc1 = b*c;
		
		a1 = sc.nextInt();
		b1 = sc.nextInt();
		c1 = sc.nextDouble();
		
		calc2 = b1*c1;
		fim = calc1+calc2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n ", fim);
				
		sc.close();
	}

}
