package poo.ads;

import java.time.LocalDate;
import java.util.HashMap;

public class Contato {
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private HashMap<String, Telefone> telefones;
    private HashMap<String, Email> emails;

    public Contato(String nome, String sobrenome, LocalDate dataNasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
    }

    public boolean addTelefone(String rotulo, String valor) {
        if (!this.telefones.containsKey(rotulo)) {
            this.telefones.put(rotulo, new Telefone(valor));
            return true;
        } else {
            return false;
        }
    }

    public boolean addEmail(String rotulo, String valor) {
        String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";

        // Valida se o email tem o formato válido e se o rótulo já exite
        if (!this.emails.containsKey(rotulo) && valor.matches(eR)) {
            this.emails.put(rotulo, new Email(valor));
            return true;
        } else {
            return false;
        }
    }

    public boolean removeTelefone(String rotulo) {
        if (this.telefones.containsKey(rotulo)) {
            this.telefones.remove(rotulo);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeEmail(String rotulo) {
        if (this.emails.containsKey(rotulo)) {
            this.emails.remove(rotulo);
            return true;
        } else {
            return false;
        }
    }

    public boolean updateTelefone(String rotulo, String valor) {
        if (!this.telefones.containsKey(rotulo)) {
            return false;
        } else {
            this.telefones.get(rotulo).setValor(valor);
            return true;
        }
    }

    public boolean updateEmail(String rotulo, String valor) {
        String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";

        if (this.emails.containsKey(rotulo) && valor.matches(eR)) {
            this.emails.get(rotulo).setValor(valor);
            return true;
        } else {
            return false;
        }
    }
}