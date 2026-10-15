package poo.ads.produtos;

public class Telefone extends Produto {
    private String tipo;

    public Telefone(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao, String tipo) {
        super(codigo, numSerie, modelo, peso, dimensao);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("tipo='").append(tipo).append('\'');
        return sb.toString();
    }
}
