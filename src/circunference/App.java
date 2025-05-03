package circunference;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Circunferencia circunferencia = new Circunferencia();
        System.out.println("Enter Radius:");
        circunferencia.radius = sc.nextDouble();
        System.out.println(circunferencia);
        sc.close();
    }
}
