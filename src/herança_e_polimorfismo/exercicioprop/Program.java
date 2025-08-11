package herança_e_polimorfismo.exercicioprop;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("Enter the number of employees:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + i + " data:" );
            System.out.println("Outsourced (y/n)?");
            char ch = sc.next().charAt(0);
            System.out.print("name: ");
            String name = sc.next();
            System.out.print("hours");
            int hours = sc.nextInt();
            System.out.print("value per hour: ");
            double value = sc.nextDouble();

            if (ch == 'y' || ch == 'Y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                list.add(new OutsourcedEmployee(name,hours,value,additionalCharge));
            }
            else{
                list.add(new Employee(name,hours,value));
            }
        }

        System.out.println();
        System.out.println("PAYMENTS");
        for (Employee emp : list){
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }

        sc.close();
    }
}
