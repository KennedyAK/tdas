package app;
import entities.Conta;
import entities.Pessoa;

public class Principal {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("João da Silva");
        Pessoa pessoa2 = new Pessoa("Maria da Silva");
        Conta minhaConta = new Conta(pessoa1.getNome(), 130, 248332, 0);
        Conta suaConta = new Conta(pessoa2.getNome(), 260, 82132, 0);

        minhaConta.depositar(10000);
        minhaConta.sacar(5000);
        minhaConta.transferir(1000,suaConta);

        System.out.println(minhaConta);
        System.out.println(suaConta);
    }
}
