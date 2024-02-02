package entities;

public abstract class Funcionario {

    private String nome;
    private int qtdH;
    private double valorH;

    public String getNome() {
        return nome;
    }

    public int getQtdH() {
        return qtdH;
    }

    public double getValorH() {
        return valorH;
    }

    public Funcionario() {
    }

    public Funcionario(String nome, int hora, double valorH) {
        this.nome = nome;
        this.qtdH = hora;
        this.valorH = valorH;
    }

    public double pagamento() {
        return getQtdH() * getValorH();
    }

    public String toString() {
        return getNome() + " - R$" + pagamento();
    }
}
