package poo.ads;

public class Horario {
    private int h;
    private int min;
    private int seg;


    public Horario() {
        this.h = 0;
        this.min = 0;
        this.seg = 0;
    }

    public Horario(int h) {
        if (validarHora(h)) {
            this.h = h;
        }
    }

    public Horario(int h, int min) {
        if (validarHora(h)) {
            this.h = h;
        }
        if (validarMinSeg(min)) {
            this.min = min;
        }
    }

    public Horario(int h, int min, int seg) {
        if (validarHora(h)) {
            this.h = h;
        }
        if (validarMinSeg(min)) {
            this.min = min;
        }
        if (validarMinSeg(seg)) {
            this.seg = seg;
        }
    }

    public int converterSegundos() {
        return h * 3600 + min * 60 + seg;
    }

    public int calcularDiferenca(Horario outro) {
        return Math.abs(this.converterSegundos()-outro.converterSegundos());
    }

    public String porExtenso() {
        return  (h > 0 ? converterExtenso(h, true) + (h == 1 ? " hora" : " horas") : "" ) +
                (h > 0 && min > 0 && seg > 0 ? ", " : "") + (h > 0 && min > 0 && seg == 0 ? " e " : "") +
                (min > 0 ? converterExtenso(min, false) + (min == 1 ? " minuto" : " minutos") : "" ) +
                (h > 0 && seg > 0 || min > 0 && seg > 0 ? " e " : "") +
                (seg > 0 ? converterExtenso(seg, false) + (seg == 1 ? " segundo" : " segundos") : "");

    }

    private String converterExtenso(int n, boolean isHour) {
        String[] unidades = {
                "", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez",
                "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"
        };
        String[] dezenas = {
                "", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta"
        };
        int d;
        int u;

        if (n < 20) {
            u = n;
            d = 0;
        } else {
            u = n % 10;
            d = n / 10;
        }
        if (isHour && u == 1) {
            return dezenas[d] + (d > 0 && u > 0 ? " e " : "") + "uma";
        } else if (isHour && u == 2) {
            return dezenas[d] + (d > 0 && u > 0 ? " e " : "") + "duas";
        } else {
            return dezenas[d] + (d > 0 && u > 0 ? " e " : "") + unidades[u];
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", h, min, seg);
    }

    private boolean validarHora(int h) {
        return h >= 0 && h <=23;
    }

    private boolean validarMinSeg(int uni) {
        return uni >= 0 && uni <=59;
    }

}
