package app;

import entities.Agenda;
import entities.Contato;
import excecao.ContatoNaoExisteException;
import excecao.AgendaCheiaException;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Agenda agenda = new Agenda();

        StringBuilder menu = new StringBuilder();

        menu.append("\n-----------------------\n");
        menu.append("          MENU\n");
        menu.append("1 - Consultar Contato\n");
        menu.append("2 - Adicionar Contato\n");
        menu.append("0 - Sair\n");
        menu.append("-----------------------\n");

        int i = 1;
        while (i != 0) {
            System.out.println(menu);
            System.out.print("Escolha uma opção do menu: ");
            i = ler.nextInt();

            switch (i) {
                case 0:
                    System.out.println("\nENCERRANDO.");
                    break;

                case 1:
                    System.out.print("Identificador: ");
                    int idt = ler.nextInt();

                    try {
                        Contato contatoEnc = agenda.consultarCtt(idt);
                        System.out.println("Contato encontrado: " + contatoEnc.getNome() + ", " + contatoEnc.getTel());
                    } catch (ContatoNaoExisteException e) {
                        System.out.println(e.getMessage());
                    }

                    break;

                case 2:
                    System.out.print("\nNome do Contato: ");
                    String nome = ler.next();

                    System.out.print("Telefone do contato: ");
                    int tel = ler.nextInt();

                    System.out.print("Identificador do contato: ");
                    int idtt = ler.nextInt();

                    Contato newContato = new Contato(nome, tel, idtt);

                    try {
                        agenda.addContato(newContato);
                        System.out.println("Contato adicionado com sucesso!");
                    } catch (AgendaCheiaException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
            }


        }


    }
}
