public class Medias {
    public static void main(String[] args) {
        double nota[][] = new double[3][3]; // linha coluna

        for (int i = 0; i < nota.length; i++) {
            for (int j = 0; j < nota.length; j++) {
                if (j < 2) {
                    nota[i][j] = Double.parseDouble(IO.readln("Entre com a nota da p" + (j + 1) + " do aluno " + (i + 1) + ": "));
                } else {
                    nota[i][j] = (nota[i][0] + nota[i][1]) / 2;
                }

            }
        }

        IO.println("Aluno   |  P1   |   P2   | Média  |");

        for (int i = 0; i < nota.length; i++) {
            IO.print("Aluno " + i + " | ");
            for (int j = 0; j < nota.length; j++) {
                IO.print(String.format("%.2f", nota[i][j]) + "  |  ");
            }
            IO.println();
        }

        double media[] = new double[3];

        IO.print("Média   | ");
        for (int i = 0; i < media.length; i++) {
            media[i] = (nota[0][i] + nota[1][i] + nota[2][i]) / 3;
            IO.print(String.format("%.2f", media[i]) + "  |  ");
        }
        IO.println();

    }

}

// 3 Alunos
// p1 p2 media
// 10 10 10
// 9 9 9
// 8 8 8
// Media p1 Media p2 Media total