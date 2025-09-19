package com.sistemadebiblioteca.demo.libros.infraestructure;

import com.sistemadebiblioteca.demo.libros.application.LibroService;
import com.sistemadebiblioteca.demo.libros.domain.Libro;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/libros")
public class LibroController {

    private final LibroService libroService;

    public LibroController(LibroService libroService) {
        this.libroService = libroService;
    }

    @PostMapping
    public Libro crearLibro(@RequestBody Libro libro) {
        return libroService.crearLibro(libro);
    }

    @GetMapping("/{id}")
    public Optional<Libro> obtenerLibro(@PathVariable Long id) {
        return libroService.obtenerLibroPorId(id);
    }

    @GetMapping
    public List<Libro> listarLibros() {
        return libroService.listarLibros();
    }

    @PutMapping("/{id}")
    public Libro actualizarLibro(@PathVariable Long id, @RequestBody Libro libro) {
        return libroService.actualizarLibro(id, libro);
    }

    @DeleteMapping("/{id}")
    public void eliminarLibro(@PathVariable Long id) {
        libroService.eliminarLibro(id);
    }
}
