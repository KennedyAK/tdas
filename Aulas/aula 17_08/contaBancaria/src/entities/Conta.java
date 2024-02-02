package entities;

public class Conta {
    private String titular;
    private int agencia;
    private int numero;
    private double saldo;
    private double saldoDisponivel;

    public Conta(String titular, int agencia, int numero, double saldo) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que 0");
        }
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if ((this.saldo <= 0) || (valor <= 0)) {
            throw new IllegalArgumentException("insira um valor maior que zero");
        } else {
            this.saldo -= valor;
        }
    }

    public void transferir(double valor, Conta conta) {
        sacar(valor);
        conta.depositar(valor);
    }

    public String toString(String documento){
        StringBuilder text = new StringBuilder();
        text.append("Titular: " + this.titular + "\n");
        text.append("RG: " + documento + "\n");
        text.append("Agencia: " + this.agencia + "\n");
        text.append("Numero: " + this.numero + "\n");
        text.append("saldo: " + this.saldo + "\n");
        return text.toString();
    }
}