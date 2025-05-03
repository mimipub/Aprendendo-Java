package medianota;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Media media = new Media();

        System.out.println("name");
        media.name = sc.next();
        System.out.println("Digite as notas");
        media.n1 = sc.nextDouble();
        media.n2 = sc.nextDouble();
        media.n3 = sc.nextDouble();

        media.calcularMedia();
        sc.close();
    }
}
