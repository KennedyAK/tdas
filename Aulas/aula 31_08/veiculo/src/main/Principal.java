package main;

import entities.Automovel;
import entities.Motocicleta;
import entities.Onibus;

public class Principal {

    public static void main (String[]args){
        Automovel hb20 = new Automovel();
        hb20.ligar();
        hb20.desligar();
        System.out.println(hb20.isLigado());

        Motocicleta twister = new Motocicleta();
        twister.ligar();
        twister.desligar();
        System.out.println(twister.isLigado());

        Onibus mercedes = new Onibus();
        mercedes.ligar();
        mercedes.desligar();
        System.out.println(mercedes.isLigado());
    }
}
