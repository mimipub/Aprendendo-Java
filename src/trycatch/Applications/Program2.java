package trycatch.Applications;

import trycatch.exceptions.DomainExceptions;
import trycatch.model.Account;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        String holder = sc.next();
        sc.nextLine();
        System.out.print("Initial balance: ");
        double initialBalance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        Account account = new Account(number, holder, initialBalance, withdrawLimit);
        System.out.println("Enter amount for withdraw:");
        double amount = sc.nextDouble();

        try {
            account.withdraw(amount);
            System.out.println("New balance:" + account.getBalance());
        }catch (DomainExceptions e) {
            System.out.println("withdraw Error: " + e.getMessage());
        }

        sc.close();

    }
}
