package ads.poo;

public class Motor {
    private String tipo;
    private boolean status;

    public Motor(String tipo) {
        this.tipo = tipo;
        this.status = false;
    }

    public void alterarStatus() {
        status = !status;
    }

}
