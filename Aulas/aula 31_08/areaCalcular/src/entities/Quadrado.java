package entities;

import services.AreaCalculavel;

public class Quadrado implements AreaCalculavel {
    private double lado;

    //Construtor

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public Double calcularArea() {
        return Math.pow(lado, 2);
    }
}
