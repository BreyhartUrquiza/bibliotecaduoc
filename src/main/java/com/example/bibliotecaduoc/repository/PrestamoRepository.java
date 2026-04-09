package com.example.bibliotecaduoc.repository;

import org.springframework.stereotype.Repository;
import com.example.bibliotecaduoc.model.Prestamo;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PrestamoRepository {

    private List<Prestamo> listaPrestamos = new ArrayList<>();

    public List<Prestamo> obtenerTodos() {
        return listaPrestamos;
    }

    public Prestamo guardar(Prestamo prestamo) {
        listaPrestamos.add(prestamo);
        return prestamo;
    }

    public Prestamo buscarPorId(Integer id) {
        return listaPrestamos.stream()
                .filter(p -> p.getIdPrestamo().equals(id))
                .findFirst()
                .orElse(null);
    }

    public boolean eliminar(Integer id) {
        return listaPrestamos.removeIf(p -> p.getIdPrestamo().equals(id));
    }
}