package entities;

public class PFisica extends Contribuinte {

    public PFisica(String nome, double rendaB) {
        super.Contribuinte(nome, rendaB);
    }

    @Override
    public void calImp(double renda) {

        if ((getRendaB() >= 1400.01) || (getRendaB() <= 2100.0)) {
            setImposto((getRendaB() * 0.1) - 100);
            setAliquota(10);
        }

        if ((getRendaB() >= 2100.01) || (getRendaB() <= 2800.0)) {
            setImposto((getRendaB() * 0.15) - 270);
            setAliquota(15);
        }

        if ((getRendaB() >= 2800.01) || (getRendaB() <= 3600.0)) {
            setImposto((getRendaB() * 0.25) - 500);
            setAliquota(25);
        }

        if (getRendaB() >= 3600.01) {
            setImposto((getRendaB() * 0.30) - 700);
            setAliquota(30);
        }
    }
}