package poo.ads;

public class Desenho {
    protected String corDaLinha;
    protected double xInicial;
    protected double yInicial;

    public Desenho(String corDaLinha, double xInicial, double yInicial) {
        this.corDaLinha = corDaLinha;
        this.xInicial = xInicial;
        this.yInicial = yInicial;
    }

    public String Desenhar() {
        final StringBuffer sb = new StringBuffer();
        sb.append("Cor da Linha: ").append(corDaLinha).append("\n");
        sb.append("Coordenada Inicial: (").append(xInicial);
        sb.append(", ").append(yInicial).append(")\n");
        return sb.toString();
    }


}
