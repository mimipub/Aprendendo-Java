package orientadaobj;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double Xa, Xb, Xc, Ya, Yb, Yc;
        System.out.println("Enter the measures of triangle: x");
        Xa = sc.nextDouble();
        Xb = sc.nextDouble();
        Xc = sc.nextDouble();
        System.out.println("Enter the measures of triangle: y");
        Ya = sc.nextDouble();
        Yb = sc.nextDouble();
        Yc = sc.nextDouble();

        //calculo do perimetro
        Double perimetroX = (Xa + Xb + Xc)/2;
        Double perimetroY = (Ya + Yb + Yc)/2;

        //calculo do
        double areaX = Math.sqrt(perimetroX*(perimetroX-Xa)*(perimetroX-Xb)*(perimetroX-Xc));
        double areaY = Math.sqrt(perimetroY*(perimetroY-Ya)*(perimetroY-Yb)*(perimetroY-Yc));
        System.out.printf("Triangle X area: %.4f%n  ", areaX);
        System.out.printf("Triangle Y area: %.4f%n ", areaY);


        if (areaX > areaY) {
            System.out.println("Larger area: X");
        }else {
            System.out.println("Larger area: Y");
        }
        sc.close();

    }
}
