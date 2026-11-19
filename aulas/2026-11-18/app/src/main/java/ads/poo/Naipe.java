package ads.poo;

public enum Naipe {
    OUROS(1, "\u2662", "o"),
    ESPADAS(2, "\u2660", "e"),
    COPAS(3, "\u2661", "c"),
    PAUS(4, "\u2663", "p");

    public final int codigo;
    public final String simbolo;
    public final String inicial;

    Naipe(int codigo, String simbolo, String inicial) {
        this.codigo = codigo;
        this.simbolo = simbolo;
        this.inicial = inicial;
    }



    @Override
    public String toString() {
        return simbolo;
    }
}
