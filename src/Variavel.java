package aula2;

public class Variavel {
    public static void main(String[] args) {
        
        String nome = "João";
        int idade = 25;
        boolean isEstudante = true;
        double altura = 1.75;
        
        System.out.println("meu nome é " + nome + " e tenho " + idade + " anos com altura de " + altura + " sou estudante? " + isEstudante);


        Long numero1 = 7277777777L;
        System.out.println(numero1);
        
        // TRABALHANDO COM VARIÁVEIS (STRINGS)
        String nome1 = "Mizael"; // String armazena textos e mensagens.
        String nome2 = "Miguel";
        String juntos = nome1 +" "+ nome2; // é possivel criar uma nova variavel com a junção de duas variaveis.
        System.out.println(nome1 +" "+ nome2); // O SIMBOLO " + " é usado para concatenar variaveis.
        System.out.println(juntos); // a nova variavel que foi alterada
    
    // char

    char simbol = 'J';  // char armazena apenas um caractere.

    //char simbol2 = 'sj' char não aceita mais de um caractere.

    //char teste = "a"; // char não aceita aspas duplas, apenas aspas simples.

    char teste = 5755; // char aceita numeros inteiros, mas é convertido para o caractere correspondente na tabela ASCII.

    System.out.println("simbolo: " + simbol);
    System.out.println("para o teste char foi usado o numero 5755 e retornou: " + teste);

    // int

    int n = 23;
    System.out.println("23 somado por 1 = " + ( n + 1));
    System.out.println("23 menos 1 = " + (n-1));
    System.out.println("23 multiplicado por 2 = " + n*2);
    System.out.println("23 dividido por 3 = " + n/3);
    System.out.println("modulo de 23: = " + n%2);

    //Long - Quando o int não consegue dar conta do tamanho do numero, usamos o Long. ocupando 64 bits. e 8 bytes.
    //Long - é usado em calculos financeiros e contagem de tempo.
    long saldoBancario = 123_456_789_123L; // é possivel usar underline para separar os numeros e facilitar a leitura e a Letra L indica o tipo.
    System.out.println("Saldo bancario: " + saldoBancario);


    //Double - é um numero de ponto flutuante usado para numeros decimais.

    double pi = 3.141_592_122; // também é possivel usar underline para separar os numeros e facilitar a leitura.
    double preco = 123.45;
    System.out.println("Preço: " + preco);
    System.out.println("PI: " + pi);

    //Boolean - é um tipo de dado que armazena verdadeiro ou falso.
    boolean isEstudante1 = true; // true é verdadeiro.
    boolean isProgramador = false; //false é falso.
    System.out.println("Estudante: " + isEstudante1); // é possivel imprimir o valor da variavel booleana.
    System.out.println("Programador: " + isProgramador);
    
    //float - é um numero de ponto flutuante de precisão simples. ocupando 32 bits e 4 bytes.

    float altura1 = 1.75f; // é possivel usar a letra f para indicar o tipo.
    System.out.println("Altura: " + altura1);

    // Exercicios de fixação.

    int valor = 10;
    int dobro = valor * 2;
    System.out.println("O dobro de " + valor + " é " + dobro);

    char letra = 'B';
    int valorASCII = letra;
    System.out.println("O valor ASCII da letra " + letra + " é " + valorASCII);

    double valor1 = 15.75;
    double valor2 = 20.40;
    double somaDouble = valor1 + valor2;

    System.out.println("A soma de " + valor1 + " + " + valor2 + " é " + somaDouble);

    long milhoes = 2_000_000_000L;
    int ConvertLong = (int) milhoes;

    System.out.println("O valor de " + milhoes + " convertido para int é " + ConvertLong);

    String saudacao = "Olá, Mundo!";
    String saudacao2 = saudacao +" Bem vindo ao Java!";
    System.out.println(saudacao2);




    }
}
