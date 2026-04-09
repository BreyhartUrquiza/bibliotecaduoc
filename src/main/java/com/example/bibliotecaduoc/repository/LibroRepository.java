package com.example.bibliotecaduoc.repository;

import com.example.bibliotecaduoc.model.Libro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LibroRepository {

    // Lista precargada con libros
    private List<Libro> listaLibros = new ArrayList<>(List.of(

        new Libro(1, "978-0134685991", "Effective Java", "Addison-Wesley", 2017, "Joshua Bloch"),

        new Libro(2, "978-8420666014", "El Aleph", "Alianza Editorial", 1949, "Jorge Luis Borges"),

        new Libro(3, "978-8437604947", "Cien años de soledad", "Ediciones Cátedra", 1967, "Gabriel García Márquez"),

        new Libro(4, "978-0201633610", "Design Patterns", "Addison-Wesley", 1994, "Erich Gamma"),

        new Libro(5, "978-0596009205", "Head First Java", "O'Reilly Media", 2005, "Kathy Sierra")

    ));

    // Obtener todos los libros
    public List<Libro> obtenerLibros() {
        return listaLibros;
    }

    // Buscar por ID
    public Libro buscarPorId(int id) {
        for (Libro libro : listaLibros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }

    // Buscar por ISBN
    public Libro buscarPorIsbn(String isbn) {
        for (Libro libro : listaLibros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    // Guardar libro
    public Libro guardar(Libro libro) {
        listaLibros.add(libro);
        return libro;
    }

    // Actualizar libro
    public Libro actualizar(int id, Libro libroActualizado) {
        for (int i = 0; i < listaLibros.size(); i++) {
            if (listaLibros.get(i).getId() == id) {
                listaLibros.set(i, libroActualizado);
                return libroActualizado;
            }
        }
        return null;
    }

    // Eliminar libro
    public boolean eliminar(int id) {
        return listaLibros.removeIf(libro -> libro.getId() == id);
    }
}