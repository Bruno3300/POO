package ads.poo;

import edu.princeton.cs.algs4.Draw;

public class CartaGrafica extends Carta{
    private double x;
    private double y;
    private final String posicaoDaImagem;

    public CartaGrafica(Valor v, Naipe n, double x, double y) {
        super(v, n);
        this.x = x;
        this.y = y;
        this.posicaoDaImagem = "cartas/" + this.v.simbolo.toLowerCase() + this.n.inicial + ".png";
    }

    public void Desenhar() {
        Draw draw = new Draw();

        draw.picture(x, y, posicaoDaImagem);
    }

    public void mover(double novoX, double novoY){
        this.x = novoX;
        this.y = novoY;
    }

}
