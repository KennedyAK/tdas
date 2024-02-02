package entities;

public abstract class Conta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta() {
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if (valor < 0){
            System.out.println("Impossivel depositar um numero negativo! ");
        }else{
            this.saldo += valor;
        }
    }

    public void sacar(double valor){
        if (valor < this.saldo){
            System.out.println("Impossivel sacar este valor.");
        }else{
            this.saldo -= valor;
        }

    }

    public void transferir(Conta contaD, double valor){
        sacar(valor);
        contaD.depositar(valor);
    }

    public abstract double calcularSaldo();

}
