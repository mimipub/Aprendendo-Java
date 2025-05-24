package arrayunidimensional.exercicio5;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        int[] pares = new int[n];
        int maior = 0;
        int maiorV = 0;

        for (int i = 0; i < n ; i++) {
            System.out.println("Digite um numero:");
            pares[i] = sc.nextInt();

            if (pares[i] > maior) {
                maior = pares[i];
                maiorV = i;
            }
        }
        System.out.println("Maior número: " + maior);
        System.out.println("Posição do maior número: " + maiorV);
    }
}
