package poo.ads;

public class Batedeira {
    // Properties
    private String estado = "Desligado";
    private int capacidade = 0;
    private int potencia = 0;
    //Methods
    public void mudarEstado() {
        if (estado.equals("Desligado")) {
            estado = "Ligado";
        } else {
            estado = "Desligado";
        }
    }

    public String obterEstado() {
        return estado;
    }

    public void alterarPotencia(int i) {
        if (estado.equals("Desligado")) {
            potencia = 0;
        } else {
            potencia = Math.max(potencia + i, 0);
            potencia = Math.min(potencia, 100);
        }
    }

    public int obterPotencia(){
        return potencia;
    }
}
