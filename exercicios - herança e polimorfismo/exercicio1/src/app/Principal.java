package app;

import entities.ContaEspecial;
import entities.ContaPoupanca;

public class Principal {
    public static void main(String[] args) {
        ContaPoupanca glicerio = new ContaPoupanca("Glicerio", 255, 232, 5);
        ContaEspecial gabriel = new ContaEspecial("Gabriel", 821, 0, 840);

        glicerio.sacar(100);
        gabriel.sacar(150);

        glicerio.depositar(560);
        gabriel.depositar(810);

        glicerio.calcularNovoSaldo(6);
        glicerio.getSaldo();

        System.out.println(glicerio + "Rendimento dia " + glicerio.getDiaRendimento());
        System.out.println(gabriel + "limite R$" + gabriel.getLimite());

    }
}
