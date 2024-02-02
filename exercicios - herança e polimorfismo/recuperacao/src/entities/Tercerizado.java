package entities;

public class Tercerizado extends Funcionario {

    private double despAdd;

    public double getDespAdd() {
        return despAdd;
    }

    public Tercerizado(String nome, int qtdH, double valorH) {
        super(nome, qtdH, valorH);
    }

    public Tercerizado(String nome, int qtdH, double valorH, double despAdd) {
        super(nome, qtdH, valorH);
        this.despAdd = despAdd;
    }

    @Override
    public double pagamento() {
        double bonus = (getDespAdd() * 110) / 100;
        return (getQtdH() * getValorH()) + bonus;
    }
}
