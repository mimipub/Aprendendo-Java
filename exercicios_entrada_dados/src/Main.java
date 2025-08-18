import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		double pi = 3.14159;
		double area, raio, calc;
		
		
		raio = sc.nextDouble();
		calc = Math.pow(raio, 2.0);
		area = pi*calc;
		
		System.out.printf("área = %.4f%n", area);
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	int soma, soma1, soma2;
		
		soma1 = sc.nextInt();
		soma2 = sc.nextInt();
		soma = soma1 + soma2;
		
		System.out.println("Soma = " + soma);
*/		
		sc.close();

	}

}
