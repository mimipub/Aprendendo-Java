
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		String s1, s2, s3;
		int x;
		
		x = sc.nextInt();
		sc.nextLine(); // serve para consumir a quebra de linha que fica pendente.
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("dados fornecidos:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		 
		
		sc.close();
		
		/*String x;
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Sua sequência de dados digitados: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		*/
	
	}

}
