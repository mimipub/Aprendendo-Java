package Enumeracoes;

import java.util.Date;

public class app {
    public static void main(String[] args) {
        Order order1 = new Order(1080, new java.util.Date(), OrderStatus.PENDING_PAYMENT);
        Order order2 = new Order(1081, new java.util.Date(), OrderStatus.PROCESSING);
        Order order3 = new Order(1082, new java.util.Date(), OrderStatus.SHIPPED);
        Order order4 = new Order(1083, new java.util.Date(), OrderStatus.DELIVERED);

        System.out.println("Order 1: " + order1.getId() + " - Status: " + order1.getStatus());
        System.out.println("Order 2: " + order2.getId() + " - Status: " + order2.getStatus());
        System.out.println("Order 3: " + order3.getId() + " - Status: " + order3.getStatus());
        System.out.println("Order 4: " + order4.getId() + " - Status: " + order4.getStatus());

        Order ordert = new Order(1089, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(ordert);
    }
}
