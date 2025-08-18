import java.util.Locale;
import java.util.Scanner;

class main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			int a,b;
			double c, calc;
			
			a = sc.nextInt(); //numero do funcionário.
			b = sc.nextInt(); // numero de horas trabalhadas.
			c = sc.nextDouble(); // valor por horas trabalhadas.
			
			calc = b*c;
			
			System.out.println("NUMBER = " + a);
			System.out.printf("SALARY = U$ %.2f%n", calc );
			
		
		sc.close();
	}

}
