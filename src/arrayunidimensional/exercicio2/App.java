package arrayunidimensional.exercicio2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar?");
        int n = sc.nextInt();

        ArrayEx2[] numero = new ArrayEx2[n];

        for (int i = 0; i < n ; i++) {
            System.out.println("Digite um número:");
             double numb = sc.nextDouble();
            numero[i] = new ArrayEx2(numb);

        }

        double soma = 0;

        System.out.print("Valores = ");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i].getNumb() + " ");
            soma += numero[i].getNumb();
        }

        System.out.println("SOMA = "+soma);
        System.out.println("MEDIA = " + soma / n);
        sc.close();
    }
}