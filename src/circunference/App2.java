package circunference;

import java.util.Locale;
import java.util.Scanner;

import static circunference.Circunferencia.*;

public class App2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius:");
        double radius = sc.nextDouble();

        double v = Circunferencia.circunference(radius);
        double c = Circunferencia.volum(radius);

        System.out.printf("Circunference %.2f%n",c);
        System.out.printf("Volume: %.2f%n ", v);
        System.out.printf("PI Value: %.2f ", Circunferencia.PI);
        sc.close();
    }
}
