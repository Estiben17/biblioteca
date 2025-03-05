package aplicacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        biblioteca biblioteca = new biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Agregar un libro");
            System.out.println("2. Buscar libro por título");
            System.out.println("3. Buscar libro por autor");
            System.out.println("4. Listar todos los libros");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ingrese el ISBN del libro: ");
                    String isbn = scanner.nextLine();
                    System.out.print("¿Está disponible? (true/false): ");
                    boolean disponible = scanner.nextBoolean();
                    scanner.nextLine();  // Consumir la nueva línea
                    Libro libro = new Libro(titulo, autor, isbn, disponible);
                    biblioteca.agregarLibro(libro);
                    break;
                case 2:
                    System.out.print("Ingrese el título a buscar: ");
                    String tituloBuscar = scanner.nextLine();
                    biblioteca.buscarPorTitulo(tituloBuscar);
                    break;
                case 3:
                    System.out.print("Ingrese el autor a buscar: ");
                    String autorBuscar = scanner.nextLine();
                    biblioteca.buscarPorAutor(autorBuscar);
                    break;
                case 4:
                    biblioteca.listarLibros();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
