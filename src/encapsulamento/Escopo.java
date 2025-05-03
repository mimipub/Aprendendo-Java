package encapsulamento;

public class Escopo {
    private String nome;
    private int idade;

    public Escopo(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int setIdade(int idade) {
        if (idade > 0 && idade <= 100) {
            System.out.println("Idade válida");
        } else {
            System.out.println("Idade inválida");
        }
            return this.idade;
    }
}
