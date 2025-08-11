package composicao.ex2_fixação;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String data = sc.nextLine();
        Date birthDate = sdf.parse(data);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String orderStatus = sc.nextLine();

        Order order = new Order(new Date(),OrderStatus.valueOf(orderStatus), new Cliente(name, email, birthDate));

        System.out.print("hoow many items to this order? ");
        int n = sc.nextInt();

        for (int i = 0; i < n ; i++) {
            sc.nextLine();
            System.out.println("Enter  #" + (i + 1) + " item data:");
            System.out.print("product name: ");
            String productName = sc.next();
            System.out.print("product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(quantity, productPrice, new Product(productName, productPrice));
            order.addItem(orderItem);
        }
        System.out.println(order);
        sc.close();
    }
}