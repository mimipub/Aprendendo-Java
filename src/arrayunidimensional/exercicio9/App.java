package arrayunidimensional.exercicio9;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas você vai digitar?");
        int n = sc.nextInt();
        String[] pessoas = new String[n];
        int[] idade = new int[n];
        int maior = 0;
        int indiceMaior = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i+1) + "ª pessoa:");
            System.out.print("Nome:");
            pessoas[i] = sc.next();
            System.out.print("idade:");
            idade[i] = sc.nextInt();

            if (idade[i] > maior) {
                maior = idade[i];
                indiceMaior = i;
            }
        }
        System.out.println("PESSOA MAIS VELHA " + pessoas[indiceMaior]);



        sc.close();
    }
}
