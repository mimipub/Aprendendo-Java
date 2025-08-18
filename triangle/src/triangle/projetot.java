package triangle;

import java.util.Locale;
import java.util.Scanner;

import entities.area;

public class projetot {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		area areax = new area();
		
		System.out.println("Enter rectangle width and height:");
		areax.width = sc.nextDouble();		
		areax.height = sc.nextDouble();
		
		sc.close();
		
		double retangle = areax.areaR();	
		System.out.printf("AREA = " + "%.2f%n", retangle);
		double perimetro = areax.perimeter();
		System.out.printf("PERIMETER = " + "%.2f%n", perimetro);
		double diagonal = areax.diagonal();
		System.out.printf("DIAGONAL = " + "%.2f%n", diagonal);
	}

}
