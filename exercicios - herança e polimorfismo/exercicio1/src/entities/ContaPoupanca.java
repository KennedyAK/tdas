package entities;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;

    public ContaPoupanca(String nomeCliente, int numConta, double saldo, int diaRendimento) {
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public int obterDia() {
        Calendar cal = Calendar.getInstance();
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        return dia;
    }

    public double calcularNovoSaldo(double taxaR) {
        if (obterDia() == this.diaRendimento) {
            double jMes = ((taxaR / 100) / 12);
            double montante = getSaldo() + jMes;
            setSaldo(montante);
        } else {
            System.out.println("\nRendimento não aplicado hoje");
        }
        return getSaldo();
    }
}
