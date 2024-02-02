package app;

import entities.Mamifero;
import entities.Peixe;

public class Principal {

    public static void main(String[] args) {
        Mamifero camelo = new Mamifero("Camelo", 150.0, "Amarelo", 2.0);
        Peixe tubarao = new Peixe("Tubarão", 300.0, 1.5, "Barbatanas e Caldas");
        Mamifero urso_do_canada = new Mamifero("Urso do Canadá", 180.0, "Vermelho", 0.5);

        urso_do_canada.setAlimento("Mel");

        StringBuilder leg = new StringBuilder();
        leg.append("Zoo \n----------");
        leg.append(camelo.toString() + "\n----------");
        leg.append(tubarao.toString() + "\n----------");
        leg.append(urso_do_canada.toString() + "\n----------");

        System.out.println(leg.toString());
    }
}
