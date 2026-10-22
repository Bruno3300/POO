package poo.ads;

public class Arqueiro extends Personagem{
    public Arqueiro() {
        super(35, 2, 1);
    }

    @Override
    public String atacar() {
        return "Arqueiro atacou com força " + this.ataque;
    }

    @Override
    public String mover() {
        return "Arqueiro se moveu com velocidade " + this.velocidade;
    }
}
