
import java.util.Scanner;

public class Leitor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        while (leitor.hasNextLine()) {
            String linha = leitor.nextLine();
            String[] campos = linha.split(",");
            double media = Math.round((Double.parseDouble(campos[1])+Double.parseDouble(campos[2]))/2);
            IO.print(campos[0] + " | Média: " + media);
            IO.println(media >= 6 ? " | Aprovado" : " | Reprovado");
        }

        leitor.close();
    }
}

    // CSV
    //Juca,5.0,10.0