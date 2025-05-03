package Exerciciosecao9;

public class Conta {
    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }
    public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        depositar(saldo);
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double deposito) {
        this.saldo += deposito;
    }

    public void sacar(double deposito) {
      saldo -= deposito + 5.0;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + getNumero() +
                ", titular='" + getTitular() + '\'' +
                ", saldo=" + getSaldo() +
                '}';
    }
}
