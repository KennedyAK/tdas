package entities;

public class Mamifero extends Animal {

    private String alimento;

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public Mamifero(String nome, Double comprimento, String cor, Double velocidade) {
        super(nome, comprimento, 4, cor, "TERRA", velocidade);
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder(stringA());

        if (getAlimento() != null) {
            string.append("\nAlimento: " + getAlimento());
        }

        return string.toString();
    }
}
