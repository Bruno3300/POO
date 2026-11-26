package ads.poo;

import java.util.Date;

public class Emprestimo {
    private boolean ativo;
    private Usuario usuario;
    private Livro livro;
    private Date dataEmp;

    public Emprestimo(Usuario usuario, Livro livro) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmp = new Date();
        this.ativo = true;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Livro getLivro() {
        return livro;
    }
}
