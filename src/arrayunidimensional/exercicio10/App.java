package arrayunidimensional.exercicio10;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos alunos serao digitados? ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] alunos = new String[n];
        double[] notaA = new double[n];
        double[] notaB = new double[n];
        double[] mediaAprov = new double[n];
        double media = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite nome, "+(1)+"º e " +(2)+ "º nota do aluno: ");
            alunos[i] = sc.nextLine();
            notaA[i] = sc.nextDouble();
            notaB[i] = sc.nextDouble();
            sc.nextLine();
            media = notaA[i] + notaB[i];
            media = media / 2;
            mediaAprov[i] = media;

        }
        int contador = 0;

        System.out.println("Alunos aprovados:");
        for (int i = 0; i < n; i++) {
            if (mediaAprov[i] >= 6) {
                System.out.println(alunos[i]);
            }
        }

        sc.close();
    }
}
