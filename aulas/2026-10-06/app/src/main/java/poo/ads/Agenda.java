package poo.ads;

import java.time.LocalDate;
import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;

    public boolean addContato(String nome, String sobrenome, LocalDate dataNasc) {
        this.contatos.add(new Contato(nome, sobrenome, dataNasc));
        return true;
    }

    public boolean findContato(String nome, String sobrenome) {
        this.contatos.
    }
}