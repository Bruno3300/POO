public class Media {

    public static void main(String[] args) {
        if (args.length != 2) {
            IO.println("Entre com 2 notas");
        } else {
            double media = (Double.parseDouble(args[0]) + Double.parseDouble(args[1]))/2;
            media = Math.round(media);

            IO.print("Média: " + String.format("%.2f", media));
            IO.println(media >= 6 ? "| Status: Aprovado" : "| Status: Reprovado");

        }

        
    }
}


//  Faça um programa que recebe duas notas como argumentos de linha de comando
// Imprima na tela a média e situação do aluno Aprovado o reprovado
