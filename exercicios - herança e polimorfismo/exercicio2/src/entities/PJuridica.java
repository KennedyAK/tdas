package entities;

public class PJuridica extends Contribuinte {

    public PJuridica(String nome, double rendaB) {
        super.Contribuinte(nome, rendaB);
    }

    @Override
    public void calImp(double renda) {
        setImposto(getRendaB() * 0.1);
        setAliquota(10);
    }
}
