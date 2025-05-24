package arrayunidimensional.exercicios11;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas serao digitadas?");
        int n = sc.nextInt();
        String[] genero = new String[n];
        double[] altura = new double[n];
        double menor = 0 , maior = 0;
        double soma = 0, media = 0;
        int contador = 0;
        maior = altura[0];
        menor = altura[0];

        for (int i = 0; i < n; i++) {
            System.out.print("Altura da " +(i+1)+"º pessoa");
            altura[i] = sc.nextDouble();
            System.out.print("Gênero da " +(i+1)+"º pessoa");
            genero[i] = sc.next();


            if (genero[i] == "F" || genero[i] == "f") {
                soma += altura[i];
            }else if (genero[i] == "M" || genero[i] == "m") {
                contador++;
            }
            if (altura[i] > maior) {
                maior = altura[i];
            }
            if (altura[i] < menor) {
                menor = altura[i];
            }
        }
        double mediaF = soma / n;
        System.out.println("Menor altura: " + menor);
        System.out.println("Maior altura: " + maior);
        System.out.println("Media das alturas das mulheres: " + mediaF);
        System.out.println("Numero de homens: " + contador);

        sc.close();
    }
}
