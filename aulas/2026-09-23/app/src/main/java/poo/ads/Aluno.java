package poo.ads;

public class Aluno {
    private String nome;
    private String email;
    private String matricula;
    private Endereco endereco;

    public Aluno(String nome, String email, String matricula, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.matricula = matricula;
        this.endereco = endereco;
    }
}
