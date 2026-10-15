package poo.ads.produtos;

public class Dimensao {
    private double altura;
    private double largura;
    private double profundidade;

    public Dimensao(double altura, double largura, double profundidade) {
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dimensao{");
        sb.append("altura=").append(altura);
        sb.append(", largura=").append(largura);
        sb.append(", profundidade=").append(profundidade);
        sb.append('}');
        return sb.toString();
    }
}
