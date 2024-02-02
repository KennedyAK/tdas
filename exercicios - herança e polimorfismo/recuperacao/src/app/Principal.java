package app;

import entities.Funcionario;
import entities.Tercerizado;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Quantidade de Funcionarios: ");
        int qtdF = ler.nextInt();

        List<Tercerizado> funcionario = new ArrayList<>();

        for (int i = 0; i < qtdF; i++) {
            System.out.print("----------------------------------------------\n");
            System.out.printf("Dados do %d° Funcionario ", (i + 1));

            System.out.print("\nTercerizado (y/n)? ");
            String opT = ler.next();

            System.out.print("nome: ");
            String nome = ler.next();

            System.out.print("Quantidade de Horas: ");
            int qtdH = ler.nextInt();

            System.out.print("Valor da Hora: ");
            double valorH = ler.nextDouble();

            Tercerizado fun;

            if (opT.equalsIgnoreCase("y")) {
                System.out.print("Despesa Adicional: ");
                double despAdd = ler.nextDouble();

                fun = new Tercerizado(nome, qtdH, valorH, despAdd);
            } else {
                fun = new Tercerizado(nome, qtdH, valorH);
            }

            funcionario.add(fun);
        }
        ler.close();


        System.out.print("\nPagamentos: \n");

        //for each loop:  percorre todos os objetos na lista funcionario
        for (Funcionario fun : funcionario) {
            System.out.println(fun.toString());
        }
    }


}
