package course;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class project {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new  Scanner(System.in);
		
		System.out.println("Enter product data:");
		System.out.print("Name:");
		String name = sc.nextLine();
		System.out.print("Price:");
		double price = sc.nextDouble();
		Product p = new Product(name, price);
		
		p.setName ("Computer");
		System.out.println();
		System.out.println("Product data: "+ p.getName());
		p.setPrice(1200.00);
		System.out.println("Updated price:" + p.getPrice());
		
		System.out.println();
		System.out.print("Enter the number of products to be added from stock:");
		int quantity  = sc.nextInt();
		p.addProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: "+ p);
		
		System.out.println();
		System.out.print("Enter the number of products to be remove from stock:");
		quantity = sc.nextInt();
		p.removeProducts(quantity);	
		
		System.out.println();
		System.out.println("Update data: "+ p);
		
		sc.close();

	}

}
