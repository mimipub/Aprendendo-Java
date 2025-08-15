package trycatch.Applications;

import java.util.InputMismatchException;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{

            System.out.println("Digite um inteiro:");
            int numerador = sc.nextInt();
            System.out.println("Digite um divisor:");
            int denominador = sc.nextInt();

            double div = numerador/denominador;
        }
        catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        }
        catch (InputMismatchException e){
            System.out.println("Digite um número inteiro válido.");
        }
        sc.close();
    }
}
