package poo.ads;

public class Ferrari extends Veiculo {
    private boolean capotaAberta;
    private boolean controleEstabilidade;

    public Ferrari(String id, int velocidade, int velocidadeMaxima) {
        super(id, velocidade, velocidadeMaxima);
        this.capotaAberta = false;
        this.controleEstabilidade = false;
    }

    @Override
    public String acelerar(int aceleracao) {
        if (this.velocidade + aceleracao < velocidadeMaxima) {
            this.velocidade += aceleracao;
            return "Ferrari acelerou " + velocidade + "A velocidade atual é " + velocidade;
        } else {
            this.velocidade = velocidadeMaxima;
            return "Ferrari alcançou velocidade máxima de " + velocidadeMaxima;
        }
    }
}
