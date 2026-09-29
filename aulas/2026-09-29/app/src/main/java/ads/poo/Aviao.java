package ads.poo;

import java.util.ArrayList;

public class Aviao {
    private int maxTripulantes;
    private int maxPassageiros;
    private int maxCombustivel;
    private boolean status;
    private ArrayList<Motor> motores;

    public Aviao(int maxTripulantes, int maxPassageiros, int maxCombustivel) {
        this.maxTripulantes = maxTripulantes;
        this.maxPassageiros = maxPassageiros;
        this.maxCombustivel = maxCombustivel;
        this.status = false;
    }

    public void adicionarMotor(String tipo) {
        motores.add(new Motor(tipo));
    }

    public void alterarStatusGeral(){
        status = !status;

    }

    public void alterarStatusUnico(int n){
        motores
    }
}
