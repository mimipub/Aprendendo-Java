package herança_e_polimorfismo.ex_fixacao2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<TaxPayers> taxPayers = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Tax payer " + "#" + (i+1) + " data:");
            System.out.println("Individual or company (i/c)?");
            char ch = sc.next().toLowerCase().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();
            System.out.println("Anual income: ");
            double anualIncome = sc.nextDouble();

            if (ch == 'i') {
                System.out.println("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                taxPayers.add(new HealthExpenditures(name, anualIncome, healthExpenditures));
            } else if (ch == 'c') {
                System.out.println("Number of employees: ");
                Integer employees = sc.nextInt();
                taxPayers.add(new Employ(name, anualIncome, employees));
            }else{
                System.out.println("Invalid option!");
                System.out.println("Digite 'i'ou 'c'" );
                --i;
            }
        }
        System.out.println();
        System.out.println("Taxes paid: ");

        double sum = 0;
        for (TaxPayers taxPayer : taxPayers) {
            double tax = taxPayer.taxPayers();
            System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", tax));
            sum += tax;
        }

        System.out.println();
        System.out.println("Total taxes: $ " + String.format("%.2f", sum));
        sc.close();
    }
}