package poo.ads;

public enum Planeta {
    MERCURIO(1, "Mercúrio"),
    VENUS(2, "Vênus"),
    TERRA(3, "Terra"),
    MARTE(4, "Marte"),
    JUPITER(5, "Júpiter"),
    SATURNO(6, "Saturno"),
    URANO(7, "Urano"),
    NETUNO(8, "Netuno");

    public final int posicao;
    public final String nome;

    Planeta(int posicao, String nome) {
        this.posicao = posicao;
        this.nome = nome;
    }

    public static String getByPosicao(int p) {
        for (Planeta planeta: Planeta.values()) {
            if (p == planeta.posicao){
                return planeta.nome;
            }
        }
        throw new IllegalArgumentException("Posição Inválida");
    }


}
