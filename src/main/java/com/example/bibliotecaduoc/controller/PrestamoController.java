package com.example.bibliotecaduoc.controller;

import org.springframework.web.bind.annotation.*;
import com.example.bibliotecaduoc.model.Prestamo;
import com.example.bibliotecaduoc.service.PrestamoService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/solicitudes")
public class PrestamoController {

    private final PrestamoService prestamoService;

    public PrestamoController(PrestamoService prestamoService) {
        this.prestamoService = prestamoService;
    }

    @GetMapping
    public List<Prestamo> listar() {
        return prestamoService.listar();
    }

    @PostMapping
    public Prestamo guardar(@RequestBody Prestamo prestamo) {
        return prestamoService.guardar(prestamo);
    }

    @GetMapping("/{id}")
    public Prestamo obtener(@PathVariable Integer id) {
        return prestamoService.obtenerPorId(id);
    }

    @DeleteMapping("/{id}")
    public boolean eliminar(@PathVariable Integer id) {
        return prestamoService.eliminar(id);
    }
}