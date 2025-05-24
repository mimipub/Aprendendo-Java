package arrayunidimensional.pensionato;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("how many rooms will be rented?");
        int n = sc.nextInt();
        Rooms[] rooms = new Rooms[10];

        for (int i = 0; i < n; i++) {
            System.out.println("Rent # " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.next();
            sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int room = sc.nextInt();
            System.out.println("---------------------------------");
            rooms[room] = new Rooms(name, email, room);
        }

        if (rooms != null){
            System.out.println("Busy rooms:");
            for (int i = 0; i < rooms.length; i++) {
                if (rooms[i] != null) {
                    System.out.println(rooms[i]);
                }
            }
        }

        sc.close();
    }
}
