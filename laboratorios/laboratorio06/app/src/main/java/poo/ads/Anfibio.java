package poo.ads;

public class Anfibio extends Veiculo {
    protected int capacidadeLastroAtual;
    protected final int capacidadeLastroMaxima;
    protected boolean rodasRecolhidas;

    public Anfibio(String id, int velocidade, int velocidadeMaxima, int capacidadeLastroAtual, int capacidadeLastroMaxima) {
        super(id, velocidade, velocidadeMaxima);
        this.capacidadeLastroAtual = capacidadeLastroAtual;
        this.capacidadeLastroMaxima = capacidadeLastroMaxima;
        this.rodasRecolhidas = false;
    }

    public String alterarEstadoRodas() {
        if (this.velocidade == 0) {
            this.rodasRecolhidas = !this.rodasRecolhidas;
            if (rodasRecolhidas) {
                esvaziarLastro();
                return "Rodas foram recolhidas e lastro esvaziado";
            }
            return "Rodas foram recolhidas";
        }
        return "As rodas podem ser recolhidas apenas com o veículo parado.";
    }

    public String encherLastro() {
        if (rodasRecolhidas) {
            esvaziarLastro();
            return "Não é possível encher o lastro com as rodas recolhidas.";
        }
        this.capacidadeLastroAtual = this.capacidadeLastroMaxima;
        return "O lastro foi enchido";
    }

    public String esvaziarLastro() {
        this.capacidadeLastroAtual = 0;
        return "O lastro foi esvaziado";
    }
}
