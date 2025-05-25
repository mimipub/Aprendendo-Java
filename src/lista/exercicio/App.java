package lista.exercicio;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many employees will be registered?");
        int n = sc.nextInt();


        List<Employ> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("employee #" + (i+1)+ ":");
            System.out.print("Id:");
            int id = sc.nextInt();

            System.out.print("Name:");
            String name = sc.next();
            sc.nextLine();

            System.out.print("Salary:");
            double salary = sc.nextDouble();

            System.out.println();

            Employ employ = new Employ(id, name, salary);
            list.add(employ);
        }

        System.out.println("Enter the employee id that will have salary increase:");
        int id = sc.nextInt();

        Employ employ = list.stream()
                .filter(x -> x.getId() == id)
                .findFirst()
                .orElse(null);

        if (employ == null) {
            System.out.println("this id does not exist");
        }else{
            System.out.println("Enter the percentage:");
            double percentage = sc.nextDouble();
            employ.setGrosSalary(percentage);
        }
        System.out.println();
        System.out.println("List of employees:");
        for (Employ X : list) {
            System.out.println(X);
        }
        sc.close();
    }
}
