package arrayunidimensional.exercicio8;

import medianota.Media;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("QUANTOS ELEMENTOS VAI TER O VETOR? ");
        int n = sc.nextInt();
        int[] vetor = new int[n];
        double soma = 0;
        int contador = 0;

        for (int i = 0; i <n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
            if (vetor[i] % 2 == 0) {
                soma += vetor[i];
                contador++;
            }
        }

        if (contador > 0) {
            double media = soma / contador;
            System.out.printf("MEDIA DOS PARES: %.2f", media);
        }else {
            System.out.println("NENHUM NUMERO PAR ENCONTRADO");
        }
        sc.close();
    }
}
