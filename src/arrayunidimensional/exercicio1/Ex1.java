package arrayunidimensional.exercicio1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar?");
        int n = sc.nextInt();
        ArrayEx[] array = new ArrayEx[n];

        if (n > 10){
            System.out.println("Número máximo de elementos é 10.");
        }else{
            for (int i = 0; i < n; i++) {
                System.out.println("Digite um número:");
                int numero = sc.nextInt();
                array[i] = new ArrayEx(numero);
            }
        }

        System.out.println("Números negativos:");
        for (int i = 0; i < n ; i++) {
            if ( array[i].getNumero() < 0){
                System.out.println(array[i].getNumero());
            }
        }
        sc.close();
    }
}
