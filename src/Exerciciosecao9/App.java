package Exerciciosecao9;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta = null;

        System.out.println("digite o número da conta");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.println("digite o nome do titular da conta");
        String titular = sc.nextLine();
        System.out.println("Deseja depositar um valor inicial? (s/n)");
        char opcao = sc.next().charAt(0);

        if (Character.toLowerCase(opcao) == 'n'){
            System.out.println("Account data");
            conta = new Conta(numero, titular);
        }else if (Character.toLowerCase(opcao) == 's'){
            System.out.println("digite o valor do deposito inicial");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numero, titular, depositoInicial);
        }else{
            System.out.println("opção inválida");
        }

        System.out.println();
        System.out.println("Account data");
        System.out.println(conta);

        System.out.println();
        System.out.println("deposite um valor");
        double deposito = sc.nextDouble();
        System.out.println("Dados atualizados:");
        conta.depositar(deposito);
        System.out.println(conta);

        System.out.println("digite o valor do saque");
        double saque = sc.nextDouble();
        System.out.println("Dados atualizados:");
        conta.sacar(saque);
        System.out.println(conta);
        sc.close();
    }
}
