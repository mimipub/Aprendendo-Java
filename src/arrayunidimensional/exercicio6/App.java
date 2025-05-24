package arrayunidimensional.exercicio6;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quais valores vai ter cada vetor? ");
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        int soma = 0;

        System.out.println("Digite os valores do vetor A? ");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B? ");
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < n; i++) {
            soma = A[i] + B[i];
            System.out.println(soma);
        }

        sc.close();
    }
}
