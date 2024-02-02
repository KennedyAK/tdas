package entities;

public class Motocicleta  extends Veiculo{

    @Override
    public void ligar() {
        super.ligar();
        System.out.println("Motocicleta Ligada");
    }

    @Override
    public void desligar() {
        super.desligar();
        System.out.println("Motocicleta Desligada");
    }
}
