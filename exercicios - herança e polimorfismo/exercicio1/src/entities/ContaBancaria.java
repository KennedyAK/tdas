package entities;

public class ContaBancaria {
    private String nomeCliente;
    private int numConta;
    private double saldo;

    public ContaBancaria(String nomeCliente, int numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeC) {
        this.nomeCliente = nomeC;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numC) {
        this.numConta = numC;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (getSaldo() - valor < 0) {
            System.out.printf("Saldo Insuficiente");
        } else if (valor <= 0) {
            System.out.printf("Valor tem que ser maior que zero");
        } else {
            double s = getSaldo();
            s -= valor;
            setSaldo(s);
        }
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("VALOR TEM QUE SER MAIOR QUE ZERO");
        } else {
            valor += getSaldo();
            setSaldo(valor);
        }
    }

    @Override
    public String toString() {
        StringBuilder dadosC = new StringBuilder();
        dadosC.append("\nNome Cliente: " + getNomeCliente());
        dadosC.append("\nNumero da Conta: " + getNumConta());
        dadosC.append("\nSaldo: R$" + getSaldo() + "\n");
        return dadosC.toString();
    }
}