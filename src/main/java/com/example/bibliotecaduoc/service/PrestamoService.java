package com.example.bibliotecaduoc.service;

import org.springframework.stereotype.Service;
import com.example.bibliotecaduoc.model.Prestamo;
import com.example.bibliotecaduoc.repository.PrestamoRepository;

import java.util.List;

@Service
public class PrestamoService {

    private final PrestamoRepository prestamoRepository;
    private Integer contador = 1;

    public PrestamoService(PrestamoRepository prestamoRepository) {
        this.prestamoRepository = prestamoRepository;
    }

    public List<Prestamo> listar() {
        return prestamoRepository.obtenerTodos();
    }

    public Prestamo guardar(Prestamo prestamo) {
        prestamo.setIdPrestamo(contador++);
        return prestamoRepository.guardar(prestamo);
    }

    public Prestamo obtenerPorId(Integer id) {
        return prestamoRepository.buscarPorId(id);
    }

    public boolean eliminar(Integer id) {
        return prestamoRepository.eliminar(id);
    }
}