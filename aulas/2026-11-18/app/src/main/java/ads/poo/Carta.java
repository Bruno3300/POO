package ads.poo;

public class Carta {
    protected final Valor v;
    protected final Naipe n;

    public Carta(Valor v, Naipe n) {
        this.v = v;
        this.n = n;
    }

    public String nomeDaImagem() {
        String simboloValor = v.simbolo.toLowerCase();
        String simboloNaipe = n.inicial;
        return simboloValor + simboloNaipe + ".png";
    }

    @Override
    public String toString() {
        return v + " de " + n + "\n";
    }
}
