package ads.poo;

public class Pessoa {
    private static int nextId = 1;
    private final int id;
    private String name;
    private String email;

    public Pessoa(String name, String email) {
        this.id = nextId;
        nextId++;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("--------------");
        sb.append("\nId   : ").append(id);
        sb.append("\nNome : ").append(name);
        sb.append("\nEmail: ").append(email);
        sb.append("\n--------------");
        return sb.toString();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
