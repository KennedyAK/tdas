package main;

import entities.Ponto2D;
import entities.Ponto3D;

public class Principal {
    public static void main(String[]args){

        Ponto2D p1 = new Ponto2D(25, 23);
        System.out.println(p1);

        Ponto3D p2 = new Ponto3D(2, 5, 8);
        System.out.println(p2);

    }
}
