public class Media {

    public static void main(String[] args) {

        double p1, p2, media;
        p1 = Double.parseDouble(IO.readln("Entre com a nota da prova 1: "));
        p2 = Double.parseDouble(IO.readln("Entre com a nota da prova 2: "));

        media = Math.round((p1 + p2) / 2.0);

        IO.print("Sua média é " + media + ". ");
        IO.println(media >= 6.0 ? "Aprovado." : "Reprovado");
    }
}
