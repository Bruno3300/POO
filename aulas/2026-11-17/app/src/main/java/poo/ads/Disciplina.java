package poo.ads;

import java.util.Arrays;

public class Disciplina {
    private String sigla;
    private DiaDaSemana[] dias;

    public Disciplina(String sigla, DiaDaSemana[] dias) {
        this.sigla = sigla;
        this.dias = dias;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Disciplina: ");
        sb.append(sigla).append("\nDias com aula\n");
        for (int i = 0; i < dias.length; i++) {
            sb.append("- ").append(dias[i]).append("\n");
        }
        return sb.toString();
    }
}
