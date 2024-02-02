package entities;

public class ContaCorrente extends Conta{
    public ContaCorrente() {
    }

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public double calcularSaldo(){
        return 8;
    }
}
