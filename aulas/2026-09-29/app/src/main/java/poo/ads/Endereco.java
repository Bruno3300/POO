package poo.ads;

public class Endereco {
    private String pais;
    private String uf;
    private String cidade;
    private String bairro;
    private String rua;
    private String cep;
    private String numero;

    public Endereco(String pais, String uf, String cidade, String bairro, String rua, String cep, String numero) {
        this.pais = pais;
        this.uf = uf;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.cep = cep;
        this.numero = numero;
    }
}
