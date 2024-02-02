package entities;

import services.AreaCalculavel;

public class Circunferencia implements AreaCalculavel {

    private double raio;

    //construtor

    public Circunferencia(double raio) {
        this.raio = raio;
    }

    @Override
    public Double calcularArea() {
        return Math.PI*Math.pow(raio,2);
    }
}
