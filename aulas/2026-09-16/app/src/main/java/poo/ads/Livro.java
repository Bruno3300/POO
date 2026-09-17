package poo.ads;

public class Livro {
    private final String ISBN;
    private String title;
    private String author;
    private int publicationYear;

    public Livro(String ISBN, String title, String author, int publicationYear) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Livro{");
        sb.append("ISBN='").append(ISBN).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", publicationYear=").append(publicationYear);
        sb.append('}');
        return sb.toString();
    }
}
