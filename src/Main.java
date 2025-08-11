import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Davi, digite um numero inteiro:");
        int numero = sc.nextInt();
        System.out.println("Digite outro numero inteiro:");
        int numero2 = sc.nextInt();

        System.out.println("Digite uma operação (1 para adição, 2 para subtração, 3 para multiplicação, 4 para divisão ):");
        int operacao = sc.nextInt();
        switch (operacao) {
            case 1:
                int soma = numero + numero2;
                System.out.println("O resultado da adição é: " + soma);
                break;
            case 2:
                int subtracao = numero - numero2;
                System.out.println("O resultado da subtração é: " + subtracao);
                break;
            case 3:
                // A multiplicação será feita abaixo
                int multiplicacao = numero * numero2;
                System.out.println("O resultado da multiplicação é: " + multiplicacao);
                break;
            case 4:
                int divisao = numero / numero2;
                System.out.println("O resultado da divisão é: " + divisao);
                break;
            case 5:
                // A operação de exponenciação será feita abaixo
                int potencia = (int) Math.pow(numero, numero2);
                System.out.println("O resultado da exponenciação é: " + potencia);
                break;
            case 6:
                // A operação de raiz quadrada será feita abaixo
                if (numero >= 0) {
                    double raizQuadrada = Math.sqrt(numero);
                    System.out.println("A raiz quadrada de " + numero + " é: " + raizQuadrada);
                } else {
                    System.out.println("Não é possível calcular a raiz quadrada de um número negativo.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
                sc.close();
                return; // Encerra o programa se a operação for inválida
        }
        sc.close();
    }
}