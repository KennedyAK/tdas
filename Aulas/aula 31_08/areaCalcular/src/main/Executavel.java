package main;

import entities.Circunferencia;
import entities.Quadrado;
import entities.Retangulo;
import services.AreaCalculavel;

public class Executavel {

    //exercicio sobre diferenca entre abstract e interface

    public static void main(String[]args){
        AreaCalculavel c = new Circunferencia(3);
        AreaCalculavel q = new Quadrado(2);
        AreaCalculavel r = new Retangulo(3, 2);

        System.out.println("Area de uma Circunferencia, raio = 3: " + c.calcularArea());
        System.out.println("Area de um Quadrado, lado = 2: " + q.calcularArea());
        System.out.println("Area de um Retângulo, ladoA = 3 - ladoB = 2: " + r.calcularArea());
    }
}
