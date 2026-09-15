package poo.ads;

public class Pessoa {
    private String nome;
    private String email;

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pessoa{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
