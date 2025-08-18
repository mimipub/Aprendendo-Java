package exercise;

import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

public class main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Funcionario funci = new Funcionario();
		
		System.out.print("Name:");
		funci.nome= sc.nextLine();
		System.out.print("Gross Salary:");
		funci.grossSalary = sc.nextDouble();
		System.out.print("Tax:");
		funci.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + funci);
		System.out.println();
		System.out.println("which percentage to increase salary?");
		double percentage = sc.nextDouble();
		funci.IncreseSalary(percentage);
		System.out.println();
		System.out.println("Updated data: " + funci);
		sc.close();
	}

}