package poo.ads;

public class Cavaleiro extends Personagem{
    public Cavaleiro() {
        super(50, 3, 2);
    }

    @Override
    public String atacar() {
        return "Cavaleiro atacou com força " + this.ataque;
    }

    @Override
    public String mover() {
        return "Cavaleiro se moveu com velocidade " + this.velocidade;
    }

}
