package poo.ads;

public abstract class Veiculo {
    protected String id;
    protected int velocidade;
    protected int velocidadeMaxima;

    public Veiculo(String id, int velocidade, int velocidadeMaxima) {
        this.id = id;
        this.velocidade = velocidade;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public abstract String acelerar(int aceleracao);

    public String desacelerar(int desaceleracao){
        this.velocidade -= desaceleracao;
        return "O veículo desacelerou " + velocidade + "A velocidade atual é " + velocidade;
    }

}
