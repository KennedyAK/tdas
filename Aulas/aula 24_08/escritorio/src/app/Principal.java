package app;

import entities.Funcionario;
import entities.Gerente;
import entities.Assistente;
import entities.Vendedor;

public class Principal {

    public static void main(String[]args){
        Gerente gerente = new Gerente("CARLA", "213", 1200);
        Assistente assistente = new Assistente("vinicio", "254", 1000);
        Vendedor vendedor = new Vendedor("Willian", "654", 800, 0.1, 5);

        System.out.println("\nGerente \n" + gerente);
        System.out.println("Assistente \n" + assistente);
        System.out.println("Vendedor \n" + vendedor);
    }
}
