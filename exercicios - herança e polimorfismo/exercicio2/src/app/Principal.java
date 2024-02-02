package app;

import entities.PFisica;
import entities.PJuridica;

public class Principal {
    public static void main(String[] args) {
        PFisica antonio = new PFisica("Antonio", 3000);
        PFisica camila = new PFisica("camila", 28000);
        PFisica leticia = new PFisica("leticia", 14000);

        antonio.calImp(antonio.getRendaB());
        camila.calImp(camila.getRendaB());
        leticia.calImp(leticia.getRendaB());

        System.out.println(antonio.toString());
        System.out.println(camila.toString());
        System.out.println(leticia.toString());

        PJuridica telles = new PJuridica("Telles", 15000);
        PJuridica cEmbalagens = new PJuridica("Casa das Embalagens", 120000);
        PJuridica polpaN = new PJuridica("Polpa Norte", 28000);

        telles.calImp(telles.getRendaB());
        cEmbalagens.calImp(cEmbalagens.getRendaB());
        polpaN.calImp(polpaN.getRendaB());

        System.out.println(telles.toString());
        System.out.println(cEmbalagens.toString());
        System.out.println(polpaN.toString());

    }
}
