package app;

import atm.*;
import entities.*;

public class Principal {

    public static void main(String[] args) {
        Pessoa titular1 = new Pessoa();
        titular1.setNome("João da Silva");
        titular1.setDocumento("12312312311");

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Maria Abadia");
        titular2.setDocumento("22233344455");

        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaInvestimento minhaConta = new ContaInvestimento(titular1, 123, 987);
        ContaEspecial suaConta = new ContaEspecial(titular2, 222, 333, 1_000);

        minhaConta.depositar(15_000);
        minhaConta.sacar(1_000);
        minhaConta.creditarRendimento(0.8);
        minhaConta.debitarMensal();

        Boleto havan = new Boleto(titular1, 880);
        System.out.println();

        caixaEletronico.pagar(havan, minhaConta);
        caixaEletronico.imprimirSaldo(minhaConta);
        System.out.println();

        suaConta.depositar(15_000);
        suaConta.sacar(5000);
        suaConta.debitarMensal();

        Holerite senior = new Holerite(titular2, 23, 48);
        caixaEletronico.pagar(senior, suaConta);
        caixaEletronico.imprimirSaldo(suaConta);
        System.out.println();

        caixaEletronico.estornarPagamento(havan, minhaConta);
        caixaEletronico.imprimirSaldo(minhaConta);

    }
}
