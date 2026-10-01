package ads.poo;

import java.util.ArrayList;

public class Aviao {
    private int maxTripulantes;
    private int maxPassageiros;
    private int maxCombustivel;
    private boolean status;
    private ArrayList<Motor> motores;

    public Aviao(int maxTripulantes, int maxPassageiros, int maxCombustivel, int totalMotores, String tipoMotor) {
        this.maxTripulantes = maxTripulantes;
        this.maxPassageiros = maxPassageiros;
        this.maxCombustivel = maxCombustivel;
        this.status = false;
        this.motores = new ArrayList<>();

        for (int i = 0; i < totalMotores; i++) {
            this.motores.add(new Motor(tipoMotor));
        }
    }


    public void alterarStatusGeral(){
        status = !status;

        this.motores.forEach(e -> {
            if (e.getStatus() != this.status) {
                e.alterarStatus();
            }
        } );
    }

    public void alterarStatusUnico(int n){
        Motor motor = motores.get(n);
        motor.alterarStatus();
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "maxTripulantes=" + maxTripulantes +
                ", maxPassageiros=" + maxPassageiros +
                ", maxCombustivel=" + maxCombustivel +
                ", ligado=" + status +
                ", motores=" + motores +
                '}';
    }
}
