package entities;

public class ContaInvestimento extends Conta{
    public ContaInvestimento() {
    }

    public ContaInvestimento(double saldo) {
        super(saldo);
    }

    @Override
    public double calcularSaldo(){
        return 9;
    }
}
