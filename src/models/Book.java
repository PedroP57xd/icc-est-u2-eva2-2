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

    public String gettitulo() {
        return titulo;
    }

    public String getautor() {
        return autor;
    }

    public int getanio() {
        return anio;
    }

    @Override
    public String toString() {
        return "titulo=" + titulo + ", autor=" + autor + ", anio=" + anio ;
    }

    
}
