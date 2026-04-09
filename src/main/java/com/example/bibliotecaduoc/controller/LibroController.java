package com.example.bibliotecaduoc.controller;

import com.example.bibliotecaduoc.model.Libro;
import com.example.bibliotecaduoc.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    // GET - listar todos
    @GetMapping
    public List<Libro> obtenerLibros() {
        return libroService.obtenerLibros();
    }

    // GET - buscar por ID
    @GetMapping("/{id}")
    public Libro buscarPorId(@PathVariable int id) {
        return libroService.buscarPorId(id);
    }

    // POST - crear libro
    @PostMapping
    public Libro guardar(@RequestBody Libro libro) {
        return libroService.guardar(libro);
    }

    // PUT - actualizar libro
    @PutMapping("/{id}")
    public Libro actualizar(@PathVariable int id, @RequestBody Libro libro) {
        return libroService.actualizar(id, libro);
    }

    // DELETE - eliminar libro
    @DeleteMapping("/{id}")
    public boolean eliminar(@PathVariable int id) {
        return libroService.eliminar(id);
    }
}