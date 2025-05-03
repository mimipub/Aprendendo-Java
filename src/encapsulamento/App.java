package encapsulamento;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();
        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();

        Escopo escopo = new Escopo(nome, idade);

        System.out.println("Nome: " + escopo.getNome());
        System.out.println("Idade: " + escopo.getIdade());

        System.out.println(escopo.setIdade(idade));
        sc.close();
    }
}
