void main() {
    // Faça um programa que usuário deve informar:
    // - Sigla da disciplina
    // - Dias da semana que tem aula desse disciplina
    // Por fim imprima:
    // Na disciplina **** você tem aula nos seguintes dias:
    // - Seg
    // - Qua 
    // - Sex

    String disciplina = IO.readln("Entre com a sigla da disciplina: ");
    String[] dia = new String[5];
    int i = 0;

    while (i != dia.length) {
        String buffer = IO.readln("Informe dia da semana ou não para encerrar: ");

        switch (buffer) {
            case "seg":
                if (dia[0] == null) {
                    dia[0] = "seg";
                    i++;
                }
                break;
                
            case "ter":
                if (dia[1] == null) {
                    dia[1] = "ter";
                    i++;
                }
                break;

            case "qua":
                if (dia[2] == null) {
                    dia[2] = "qua";
                    i++;
                }
                break;

            case "qui":
                if (dia[3] == null) {
                    dia[3] = "qui";
                    i++;
                }
                break;

            case "sex":
                if (dia[4] == null) {
                    dia[4] = "sex";
                    i++;
                }
                break;

            case "nao":
                i = 5;
                break;
            
        
            default:
                IO.println("Entrada Inválida. Entre com seg, ter, qua, qui ou sex");
                break;
        }

    }
    IO.println("Na disciplina " + disciplina + " você tem aula nos seguintes dias:");
    for (i=0 ; i < dia.length; i++) {
        if (dia[i] != null) {
            IO.println("- " + dia[i]);
        }
    }
}
