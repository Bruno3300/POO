package ads.poo;

public class App {

    private Pessoa[] banco = new Pessoa[100];
    private int totalPessoas = 0;

    public static void main(String[] args) {
        App app = new App();
        int sel = 0;

        while (sel != 4) {
            sel = app.menu();
            switch (sel) {
                case 1 -> app.cadastrar();
                case 2 -> app.listarTodos();
                case 3 -> app.listarUm();
            }
        }


    }

    public int menu() {

        IO.println("""
                1 - Cadastrar
                2 - Listar todas pessoas
                3 - Imprimir dados de uma pessoa
                4 - Sair
                """);
        return Integer.parseInt(IO.readln("Entre com a opção desejada: "));
    }

    public void cadastrar() {
        String nome = IO.readln("Entre com o nome: ");
        String mail = IO.readln("Entre com o email: ");
        banco[totalPessoas] = new Pessoa(nome, mail);
        totalPessoas++;
    }

    public void listarTodos() {
        IO.println("+" + "-".repeat(43) + "+");
        IO.println("|   Id  |    Nome    |        Email         |");
        IO.println("+" + "-".repeat(43) + "+");
        for (int i = 0; i < totalPessoas; i++) {
            int id = banco[i].getId();
            String nome = banco[i].getName();
            String email = banco[i].getEmail();
            String user = String.format("| %5d | %10s | %20s |", id, nome, email);
            IO.println(user);
            IO.println("+" + "-".repeat(43) + "+");
        }
    }

    public void listarUm() {
        int id = Integer.parseInt(IO.readln("Entre com o Id da pessoa: "));
        id--;
        IO.println(banco[id]);
    }


}

