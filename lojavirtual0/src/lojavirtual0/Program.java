package lojavirtual0;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Somatorio soma = new Somatorio();
		
		System.out.println("Digite um valor:");
		double Va = sc.nextDouble();
		System.out.println("Digite o segundo valor");
		double Vb = sc.nextDouble();
		
		double c = Va + Vb;
		
		System.out.printf("o valor da soma é %.2f", c );
		sc.close();
	}

}
