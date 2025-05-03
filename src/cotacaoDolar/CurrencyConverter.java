package cotacaoDolar;

import static cotacaoDolar.App.tax;

public class CurrencyConverter{

    public static double convert(double price, double dollars){
        return  price * dollars;
        // conversor + (conversor * tax);
    }

    public static double somarConvert(double price, double dollars){
        return convert(price, dollars) + (convert(price, dollars) * tax);
    }
}
