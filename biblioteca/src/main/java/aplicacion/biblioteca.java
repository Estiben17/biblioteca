package aplicacion;

import java.util.ArrayList;
import java.util.List;

public class biblioteca {
    private List<Libro> libros;

    // Constructor
    public biblioteca() {
        this.libros = new ArrayList<>();
    }

    // Método para agregar un libro a la biblioteca
    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado: " + libro.getTitulo());
    }

    // Método para buscar libros por título
    public void buscarPorTitulo(String titulo) {
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println(libro);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron libros con el título: " + titulo);
        }
    }

    // Método para buscar libros por autor
    public void buscarPorAutor(String autor) {
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getAutor().equalsIgnoreCase(autor)) {
                System.out.println(libro);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron libros del autor: " + autor);
        }
    }

    // Método para listar todos los libros
    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }
    }
}
