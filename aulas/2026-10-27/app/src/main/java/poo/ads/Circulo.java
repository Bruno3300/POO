package poo.ads;

public class Circulo extends Forma {
    private double raio;

    public Circulo(String corDaLinha, double xInicial, double yInicial, double raio) {
        super(corDaLinha, xInicial, yInicial);
        this.raio = raio;
    }

    @Override
    public String Desenhar() {
        final StringBuffer sb = new StringBuffer();
        sb.append("Tipo de Desenho: Círculo\n");
        sb.append(super.Desenhar());
        sb.append("Raio: ").append(raio).append("\n");
        sb.append("Área: ").append(calcularArea()).append("\n");
        sb.append("Perímetro: ").append(calcularPerimetro()).append("\n");
        return sb.toString();
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}
