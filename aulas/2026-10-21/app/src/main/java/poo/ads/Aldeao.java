package poo.ads;

public class Aldeao extends Personagem implements Guerreiro, Coletor{

    public Aldeao() {
        super(25, 1, 0.8);
    }

    @Override
    public String atacar() {
        return "Aldeão atacou com força " + this.ataque;
    }

    @Override
    public String mover() {
        return "Aldeão se moveu com velocidade " + this.velocidade;
    }

    @Override
    public String coletarMadeira() {
        return "Aldeão coletou Madeira";
    }

    @Override
    public String coletarOuro() {
        return "Aldeão coletou Ouro";
    }
}
