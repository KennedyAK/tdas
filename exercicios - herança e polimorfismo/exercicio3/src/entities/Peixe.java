package entities;

public class Peixe extends Animal {

    private int numPatas = 0;
    private String caracteristicas;

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public Peixe(String nome, Double comprimento, Double velocidade, String caracteristicas) {
        super(nome, comprimento, 0, "CINZENTA", "MAR", velocidade);
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder(stringA());
        string.append("\nCaracteristicas: " + getCaracteristicas());
        return string.toString();
    }
}