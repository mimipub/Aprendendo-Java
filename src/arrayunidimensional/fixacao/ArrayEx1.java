package arrayunidimensional.fixacao;

import java.util.Locale;
import java.util.Scanner;

public class ArrayEx1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Product[] array = new Product[n];

        for (int i = 0; i < array.length; i++) {
            sc.nextLine();
            String name = sc.next();
            double price = sc.nextDouble();
            array[i] = new Product(name, price);
        }

        double total = 0;

        for (int i = 0; i < array.length; i++) {
            total += array[i].getPrice();
        }
        double average = total / n;

        System.out.println("Average price = " + average);


        sc.close();
    }
}
