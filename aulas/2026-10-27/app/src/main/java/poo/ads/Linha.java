package poo.ads;

public class Linha extends Desenho {
    protected double xFinal;
    protected double yFinal;

    public Linha(String corDaLinha, double xInicial, double yInicial, double xFinal, double yFinal) {
        super(corDaLinha, xInicial, yInicial);
        this.xFinal = xFinal;
        this.yFinal = yFinal;
    }

    @Override
    public String Desenhar() {
        final StringBuffer sb = new StringBuffer();
        sb.append("Tipo de Desenho: Linha\n");
        sb.append(super.Desenhar());
        sb.append("Coordenada Final: (").append(xFinal);
        sb.append(", ").append(yFinal).append(")\n");
        return sb.toString();
    }
}
