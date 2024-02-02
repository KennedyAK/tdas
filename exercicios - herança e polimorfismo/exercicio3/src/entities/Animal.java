package entities;

public abstract class Animal {

    private String nome;
    private Double comprimento;
    private int numPatas = 4;
    private String cor;
    private String ambiente;
    private Double velocidade; // metros por segundo

    public Animal() {
    }

    public Animal(String nome, Double comprimento, int numPatas, String cor, String ambiente, Double velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numPatas = numPatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public Double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Double velocidade) {
        this.velocidade = velocidade;
    }

    public String stringA() {
        StringBuilder animal = new StringBuilder();
        animal.append("\nNome: " + getNome());
        animal.append("\nComprimento: " + getComprimento() + "cm");
        animal.append("\nPatas: " + getNumPatas());
        animal.append("\nCor: " + getCor());
        animal.append("\nAmbiente: " + getAmbiente());
        animal.append("\nVelocidade: " + getVelocidade() + "m/s");
        return animal.toString();
    }

    public abstract String toString();
}