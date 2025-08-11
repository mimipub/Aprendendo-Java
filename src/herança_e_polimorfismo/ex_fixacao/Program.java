package herança_e_polimorfismo.ex_fixacao;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        List<Product> products = new ArrayList<Product>();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Product #" + (i + 1) + " data:");
            System.out.print("Common,used or imported (c/u/i)?");
            char s = sc.next().toLowerCase().charAt(0);
            System.out.print("Name:");
            String name = sc.next();
            System.out.print("Price:");
            double price = sc.nextDouble();

            if (s == 'c'){
                products.add(new Product(name, price));
            }else if (s == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY):");
                LocalDate manufactureDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                products.add(new UsedPrduct(name, price, manufactureDate));
            }else if (s == 'i'){
                System.out.print("Customs fee:");
                double customsFee = sc.nextDouble();
                products.add(new ImportedProduct(name, price, customsFee));
            }else{
                System.out.println("Digite um numero válido.");
                i--;
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product p : products) {
                System.out.println(p.priceTag());
        }
        sc.close();
    }
}
