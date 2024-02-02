import java.util.Scanner;
public class Principal {

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = ler.next();
        Pessoa pessoa1 = new Pessoa(nome);
        System.out.println("");

        System.out.print("Agencia: ");
        int agencia = ler.nextInt();
        System.out.println("");

        System.out.print("numero: ");
        int numero = ler.nextInt();
        System.out.println("");

        System.out.print("saldo: ");
        double saldo = ler.nextDouble();
        System.out.println("");

        Conta minhaConta = new Conta(pessoa1,agencia, numero, saldo);

        System.out.print("Deposito: ");
        double dep = ler.nextDouble();
        minhaConta.depositar(dep);
        System.out.println("");

        System.out.print("Sacar: ");
        double sac = ler.nextDouble();
        minhaConta.sacar(sac);
        System.out.println("");
        //-----------------------------------------------

        System.out.print("Nome: ");
        nome = ler.next();
        Pessoa pessoa2 = new Pessoa(nome);
        System.out.println("");

        System.out.print("Agencia: ");
        agencia = ler.nextInt();
        System.out.println("");

        System.out.print("numero: ");
        numero = ler.nextInt();
        System.out.println("");

        System.out.println("saldo: ");
        saldo = ler.nextDouble();
        System.out.println("");

        Conta suaConta = new Conta(pessoa2,agencia, numero, saldo);

        System.out.println("Deposito: ");
        dep = ler.nextDouble();
        minhaConta.depositar(dep);
        System.out.println("");

        System.out.println("Sacar: ");
        sac = ler.nextDouble();
        minhaConta.sacar(sac);
        System.out.println("");

        System.out.print("Tranferencia: ");
        double valor = ler.nextDouble();
        minhaConta.transferir(valor, suaConta);

        ler.close();

        System.out.println("Titular: " + minhaConta.Titular.nome);
        System.out.println("Agencia: " + minhaConta.agencia);
        System.out.println("numero: " + minhaConta.numero);
        System.out.println("Saldo: R$" + minhaConta.saldo);
        System.out.println(" ");

        System.out.println("Titular: " + suaConta.Titular.nome);
        System.out.println("Agencia: " + suaConta.agencia);
        System.out.println("numero: " + suaConta.numero);
        System.out.println("Saldo: R$" + suaConta.saldo);
        System.out.println(" ");
    }
}