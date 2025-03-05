package aplicacion;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;

    // Constructor
    public Libro(String titulo, String autor, String isbn, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = disponible;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isDisponible() {
        return disponible;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Metodo para mostrar la información del libro
    @Override
    public String toString() {
        return "-----------------------------\n" +
                "Título: " + titulo + "\n" +
                "Autor: " + autor + "\n" +
                "ISBN: " + isbn + "\n" +
                "Disponible: " + (disponible ? "Sí" : "No") + "\n" +
                "-----------------------------";
    }
}
