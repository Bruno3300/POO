package poo.ads.produtos;

public class Pager extends Produto {
    private int numLinhasDisplay;

    public Pager(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao, int numLinhasDisplay) {
        super(codigo, numSerie, modelo, peso, dimensao);
        this.numLinhasDisplay = numLinhasDisplay;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("numLinhasDisplay='").append(numLinhasDisplay).append('\'');
        return sb.toString();
    }
}
