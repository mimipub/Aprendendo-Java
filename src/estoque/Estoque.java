package estoque;

import java.util.Locale;
import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.println("name:");
        String name = sc.next();
        System.out.println("price:");
        double price = sc.nextDouble();
        System.out.println("quantity:");
        int quantity = sc.nextInt();

        Stock stock = new Stock(name, price, (int) quantity);

        System.out.println();
        System.out.println("Product data: " + stock);

        System.out.println();
        System.out.println("Enter the number of products to be add in stock:");
        quantity = sc.nextInt();
        stock.AddProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + stock);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock:");
        quantity = sc.nextInt();
        stock.RemoveProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + stock);
        sc.close();
    }
}