package aula2;

import java.util.Locale;
import java.util.Scanner;
public class if_Else {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        double b = sc.nextDouble();
        String c = sc.next();

        sc.nextLine();
        
        System.out.println("String: " + c);
        System.out.printf("Double: %.4f%n", b);
        System.out.println("Int: " + a);
        
        sc.close();
    }
}
