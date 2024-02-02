package entities;

import services.AreaCalculavel;

public class Retangulo implements AreaCalculavel {
    private double base;
    private double altura;

    //Construtor
    public Retangulo(double ladoA, double ladoB) {
        this.base = ladoA;
        this.altura = ladoB;
    }

    @Override
    public Double calcularArea() {
        return base*altura;
    }
}
