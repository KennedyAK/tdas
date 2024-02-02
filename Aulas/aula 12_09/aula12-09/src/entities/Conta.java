package entities;

import java.util.Objects;

public abstract class Conta {

    private Pessoa titular;
    private int agencia;
    private int numero;
    private double saldo;

    public Conta() {

    }

    public Conta(Pessoa titular, int agencia, int numero) {
        Objects.requireNonNull(titular);
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getSaldoDisponivel() {
        return getSaldo();
    }

    public abstract void debitarMensal();

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que 0");
        } else {
            saldo += valor;
           System.out.print("Deposito de R$" + valor + "\n");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que 0");
        } else if (getSaldoDisponivel() - valor < 0) {
            throw new IllegalArgumentException("Saldo insuficiente");
        } else {
            saldo -= valor;
             System.out.print("Saque de R$" + valor + "\n");
        }
    }

    public void transferir(double valor, Conta conta) {
        sacar(valor);
        conta.depositar(valor);
    }

    public void sacar(double valor, double taxa) {
        sacar(valor + taxa);
    }

}
