package poo.ads;

public class Caneta {

    private String cor; // null
    private double nivelTinta; // 0% - 100%

    private final double CONSUMO = 0.01;

    public Caneta(double nivelTinta, String cor) {
        this.nivelTinta = Math.min(Math.max(0, nivelTinta), 100);
        this.cor = cor;
    }

    public Caneta(double nivelTinta) {
        this(nivelTinta, "azul");
    }

    public Caneta() {
        this(100);
    }

    public String getCor() {
        return cor;
    }

    public double getNivelTinta() {
        return nivelTinta;
    }

    public String toString(){
        return "Cor: " + cor + "\nTinta: " + nivelTinta;
    }

    public double draw(double x1, double y1, double x2, double y2) {
        double x = Math.pow(x1 + x2, 2);
        double y = Math.pow(y1 + y2, 2);
        double gastoTinta = Math.sqrt(x + y) * CONSUMO;
        if (gastoTinta <= nivelTinta) {
            nivelTinta -= gastoTinta;
            return gastoTinta;
        } else {
            return -1.0;
        }
    }
}
