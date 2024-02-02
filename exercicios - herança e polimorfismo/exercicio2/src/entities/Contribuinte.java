package entities;

public abstract class Contribuinte {

    private String nome;
    private Double rendaB;
    private Double imposto = 0.0;
    private int aliquota = 0;


    public void Contribuinte(String nome, Double rendaB) {
        this.nome = nome;
        this.rendaB = rendaB;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaB() {
        return this.rendaB;
    }

    public void setRendaB(Double rendaB) {
        this.rendaB = rendaB;
    }

    public Double getImposto() {
        return imposto;
    }

    public void setImposto(Double imposto) {
        this.imposto = imposto;
    }

    public int getAliquota() {
        return aliquota;
    }

    public void setAliquota(int aliquota) {
        this.aliquota = aliquota;
    }

    public abstract void calImp(double renda);

    public String toString() {
        StringBuilder leg = new StringBuilder();
        leg.append("\nNome Contribuinte: " + getNome());
        leg.append("\nRenda Bruta: R$" + getRendaB());
        leg.append("\nImposto: R$" + getImposto());
        leg.append("\nAliquota: " + getAliquota() + "%");

        return leg.toString();
    }
}