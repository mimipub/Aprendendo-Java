package arrayunidimensional.exercicio4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        int[] pares = new int[n];
        int qtdePares = 0;

        for (int i = 0; i < n ; i++) {
            System.out.println("Digite um numero:");
            pares[i] = sc.nextInt();
        }

        for (int i = 0; i < n ; i++) {
            if (pares[i] % 2 == 0) {
                System.out.print(pares[i] + " ");
                qtdePares++;
            }
        }
        System.out.println();
        System.out.println("QUANTIDADES DE PARES = " + qtdePares);
        sc.close();
    }
}
