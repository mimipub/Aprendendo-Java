package arrayunidimensional.exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas? ");
        int p = sc.nextInt();

        String[] nomes = new String[p];
        int[] idades = new int[p];
        double[] altura = new double[p];

        for (int i = 0; i < p; i++) {

            System.out.println("dados da " + (i + 1) + "º pessoa: ");

            System.out.println("nome: ");
            nomes[i] = sc.next();
            System.out.println("idade: ");
            idades[i] = sc.nextInt();
            System.out.println("altura: ");
            altura[i] = sc.nextDouble();

        }

        double media = 0;
        for (int i = 0; i < p; i++) {
            media += altura[i];
        }
        media /= p;
        // calcular a porcentagem de P (nomes.length / p) * 100 mostra a porcentagem idadess menor que 16
        System.out.printf("Altura média %.2f: %n ", media);



        for (int j = 0; j < idades.length; j++) {
            if(idades[j] < 16){
                idades[j] = (idades[j] / p) * 100 ;
                System.out.println(nomes[j]);
            }
        }




        sc.close();
    }
}
