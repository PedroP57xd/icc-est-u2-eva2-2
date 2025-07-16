package models;

public class Book {
    private String titulo;
    private String autor;
    private int anio;

    public Book(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnio() {
        return anio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return anio == book.anio && titulo.equals(book.titulo);
    }

    @Override
    public int hashCode() {
        return titulo.hashCode() + Integer.hashCode(anio);
    }

    @Override
    public String toString() {
        return titulo + " - " + autor + " (" + anio + ")";
    }
}
