package atm;

import entities.*;

public class Boleto implements DocumentoPagavel, DocumentoEstornavel {

    private Pessoa beneficiario;
    private double valor;
    private boolean pago;

    public Boleto(Pessoa beneficiario, double valor) {
        this.beneficiario = beneficiario;
        this.valor = valor;
    }

    @Override
    public double getValorTotal() {
        return valor;
    }

    @Override
    public boolean estaPago() {
        return pago;
    }

    @Override
    public void estornarPagamento() {
        pago = false;

        if (pago == true) {
            System.out.println("Pagamento não Estornado");
        } else {
            System.out.println("Pagamento Estornado");
        }
    }

    @Override
    public void quitarPagamento() {
        pago = true;

        if (pago == false) {
            System.out.println("Pagamento não Quitado");
        } else {
            System.out.println("Pagamento Quitado");
        }
    }
}
