import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaMain {
    private static List<Libro> libros = new ArrayList<>();
    private static List<Usuario> usuarios = new ArrayList<>();
    private static List<Prestamo> prestamos = new ArrayList<>();

    public static void main(String[] args) {
        // Crear usuarios
        Usuario usuario1 = new Usuario("Juan", "Pérez", "juan.perez@ejemplo.com", "contraseña123", 35, true);
        Usuario usuario2 = new Usuario("María", "Gómez", "maria.gomez@ejemplo.com", "password456", 28, false);
        usuarios.add(usuario1);
        usuarios.add(usuario2);

        // Crear libros
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", "Literatura", 1605, 900);
        Libro libro2 = new Libro("1984", "George Orwell", "Ficción", 1949, 50);
        libros.add(libro1);
        libros.add(libro2);

        // Realizar préstamos
        LocalDate fechaPrestamo1 = LocalDate.of(2023, 7, 1);
        LocalDate fechaDevolucion1 = LocalDate.of(2023, 7, 15);
        Prestamo prestamo1 = new Prestamo(usuario1, libro1, fechaPrestamo1, fechaDevolucion1);
        prestamos.add(prestamo1);

        LocalDate fechaPrestamo2 = LocalDate.of(2023, 8, 1);
        LocalDate fechaDevolucion2 = LocalDate.of(2023, 8, 15);
        Prestamo prestamo2 = new Prestamo(usuario2, libro2, fechaPrestamo2, fechaDevolucion2);
        prestamos.add(prestamo2);

        // Imprimir información
        System.out.println("Usuarios registrados:");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }

        System.out.println("\nLibros disponibles:");
        for (Libro libro : libros) {
            System.out.println(libro);
        }

        System.out.println("\nPréstamos realizados:");
        for (Prestamo prestamo : prestamos) {
            System.out.println(prestamo);
        }
    }
}