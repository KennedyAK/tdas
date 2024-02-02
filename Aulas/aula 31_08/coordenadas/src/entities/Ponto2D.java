package entities;

public class Ponto2D {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Ponto2D" +
                " x = " + x +
                "; y = " + y;
    }
}
