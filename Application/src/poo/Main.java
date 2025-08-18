package poo;


import java.util.Locale;
import java.util.Scanner;

import entities.triangle;

import entities.triangle;

class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in) ;
		
		triangle x, y;
		x = new triangle();
		y = new triangle();
		
		System.out.println("enter the measure of triangle X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("enter the measure the Triangle Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		sc.close();
		
		double areaX = x.area();
		double areaY = y.area();		
		
		System.out.printf("Triangle X área %.4f%n", areaX);
		System.out.printf("Triangle Y área %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger área: Y");
		}else {
			System.out.println("Larger área: X");
		}
	}

}

// código sem classe orientada a objetos

