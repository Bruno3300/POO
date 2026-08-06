void main() {
    int idade = Integer.parseInt(IO.readln("Entre com sua idade: "));
    char sexo = IO.readln("Entre com seu sexo: ").toUpperCase().charAt(0);

    if (sexo == 'M' && idade >= 18) {
        IO.println("É necessário apresentar atestado de reservista");
    } else {
        IO.println("Nâo necessário apresentar atestado de reservista");
    }
}