package arrayunidimensional.exercicio7;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double[] vetor = new double[n];
        double media = 0;


        for (int i = 0; i <n; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextDouble();
            media+= vetor[i];
        }

        double mediaFinal = media/n;

        System.out.println("MEDIA DO VETOR " + mediaFinal );
        System.out.println("VALORES ABAIXO DA MEDIA: ");
        for (int i = 0; i <n; i++) {
            if (vetor[i] < mediaFinal) {
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }
}
