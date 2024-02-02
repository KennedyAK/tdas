package entities;

public class ContaEspecial extends ContaBancaria {
    private double limite;

    public ContaEspecial(String nomeCliente, int numConta, double saldo, double limite) {
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setContaEspecial(double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        this.limite += getSaldo();
        setSaldo(this.limite);
    }
}
