package entities;

public class Vendedor extends Funcionario{
    private double  comissao;
    private double qtdVendas;

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(double qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    public Vendedor(String nome, String matricula, double salario_base, double comissao, int qtdVendas) {
        super(nome, matricula, salario_base);
        this.comissao = comissao;
        this.qtdVendas = qtdVendas;
    }

    @Override
    public double calculaSalario(){
        double porcComissao = comissao * getSalario_base();
        double totalComissao = porcComissao * qtdVendas;
        return getSalario_base() + totalComissao;
    }

}
