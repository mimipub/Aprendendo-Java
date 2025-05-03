package cotacaoDolar;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static final double tax = 0.06;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("what is the dollar price?");
        double price = sc.nextDouble();
        System.out.println("how many dollars will be bought?");
        double dollars = sc.nextDouble();

        System.out.println(CurrencyConverter.somarConvert(price, dollars));
        CurrencyConverter.somarConvert(price,dollars);

        sc.close();
    }
}
