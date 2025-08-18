package nota;

import java.util.Locale;
import java.util.Scanner;

import entities.media;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		media Media = new media();
		
		
		System.out.println("Nome do aluno: ");
		Media.nome = sc.nextLine();
		System.out.println("Digite as Notas do primeiro Trimestre, Segundo e Terceiro:");
		Media.a = sc.nextDouble();
		Media.b = sc.nextDouble();
		Media.c = sc.nextDouble();
		
		if (Media.calcularMediana() < 60 ){
			System.out.println("====================================");
			System.out.println("Failed");
			System.out.printf( "MISSING %.2f POINTS",  Media.resto()  );
			
		}else {
			System.out.println("====================================");
			System.out.println("Pass");
		}		
		
		
		sc.close();
		
	

	}

}
