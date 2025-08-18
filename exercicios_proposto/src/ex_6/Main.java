package ex_6;

import java.util.Locale;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

			double pi = 3.14159;
			double a,b,c,d,e;
			System.out.println("Digite os valores que deseja ser calculados:");
			
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			
			d = (float) Math.pow(c, 2.0);
			System.out.printf("TRIÂNGULO: %.3f%n", (a*c)/2);
			System.out.printf("CIRCULO: %.3f%n", d*pi);
			System.out.printf("TRAPEZIO: %.3f%n", (a+b)*c/2);
			
			e = (float) Math.pow(b, 2.0);
			
			System.out.printf("QUADRADO: %.3f%n", e );
			System.out.printf("RETANGULO: %.3f%n", a*b);
			
		sc.close();

	}

}
