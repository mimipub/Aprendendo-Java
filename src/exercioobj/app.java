package exercioobj;

import java.util.Scanner;

public class app{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle retangulo = new Rectangle();
        System.out.println("Enter rectangle width and height:");
        retangulo.width = sc.nextDouble();
        retangulo.height = sc.nextDouble();

        System.out.println(retangulo);
        sc.close();
    }
}
