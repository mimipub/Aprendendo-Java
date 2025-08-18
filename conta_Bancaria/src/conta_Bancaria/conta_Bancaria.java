package conta_Bancaria;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class conta_Bancaria {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.println("Enter account number:");
		int number  = sc.nextInt();
		System.out.println("Enter account holder");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("is there an initial deposit? (y/n)");
		char Vinit = sc.next().charAt(0);
		
		if(Vinit == 'y' || Vinit == 'Y') {
			System.out.println("Enter initial deposit value:");
			double valueInitial = sc.nextDouble();
			account = new Account(number, holder, valueInitial);
			
		}else if(Vinit == 'n' || Vinit == 'N') {
			account = new Account(number, holder);
		}else {
            System.out.println("Invalid option!");
            return;  // Se a entrada não for válida, finaliza o programa
        }		
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.println("");
		System.out.println("enter a deposit value: ");
		double depoositValue = sc.nextDouble();
		account.deposit(depoositValue);
		System.out.println("Updated Account data:");
		System.out.println(account);
		
		
		System.out.println("");
		System.out.println("enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated Account data:");
		System.out.println(account);
		
		sc.close();

	}

}
