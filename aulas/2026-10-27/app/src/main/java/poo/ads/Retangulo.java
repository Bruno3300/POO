package poo.ads;

public class Retangulo extends Forma {
    private double xFinal;
    private double yFinal;


    public Retangulo(String corDaLinha, double xInicial, double yInicial, double xFinal, double yFinal) {
        super(corDaLinha, xInicial, yInicial);
        this.xFinal = xFinal;
        this.yFinal = yFinal;
    }

    @Override
    public String Desenhar() {
        final StringBuffer sb = new StringBuffer();
        sb.append("Tipo de Desenho: Retângulo\n");
        sb.append(super.Desenhar());
        sb.append("Coordenada Final: (").append(xFinal);
        sb.append(", ").append(yFinal).append(")\n");
        sb.append("Área: ").append(calcularArea()).append("\n");
        sb.append("Perímetro: ").append(calcularPerimetro()).append("\n");
        return sb.toString();
    }

    @Override
    public double calcularArea() {
        return calcularAltura() * calcularLargura();
    }

    @Override
    public double calcularPerimetro() {
        return (2 * calcularLargura()) + (2 * calcularAltura());
    }

    private double calcularAltura() {
        return Math.abs(yFinal-yInicial);
    }

    private double calcularLargura() {
        return Math.abs(xFinal-xInicial);
    }
}
