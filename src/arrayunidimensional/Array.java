package arrayunidimensional;

import java.util.Locale;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] array = new double[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextDouble();
        }

        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += array[i];

        }
        double v = sum / n;
        System.out.println("a media da altura é " + v );
        sc.close();

    }

}
