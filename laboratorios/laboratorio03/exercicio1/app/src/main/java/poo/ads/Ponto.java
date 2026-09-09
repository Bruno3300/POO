package poo.ads;

public class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calculaDistancia(Ponto outro) {
        double difX = this.x - outro.x;
        double difY = this.y - outro.y;

        return Math.sqrt(difX * difX + difY * difY);
    }

    @Override
    public String toString() {
        return "(x=" + x +
                ", y=" + y +
                ')';
    }
}
