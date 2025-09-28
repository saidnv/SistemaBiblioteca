package com.sistemadebiblioteca.demo.libros.infraestructure;

import com.sistemadebiblioteca.demo.libros.application.LibroService;
import com.sistemadebiblioteca.demo.libros.domain.Libro;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

@Tag(name = "Libros", description = "Operaciones CRUD para gestionar libros")@RequestMapping("/api/libros")
public class LibroController {

    private final LibroService libroService;
    
    public LibroController(LibroService libroService) {
        this.libroService = libroService;
    }

    @Operation(summary = "Crear nuevo libro")
    @PostMapping
    public Libro crearLibro(@RequestBody Libro libro) {
        return libroService.crearLibro(libro);
    }

    @Operation(summary = "Obtener libro por ID")
    @GetMapping("/{id}")
    public Optional<Libro> obtenerLibro(@PathVariable Long id) {
        return libroService.obtenerLibroPorId(id);
    }

    @Operation(summary = "Listar libros")
    @GetMapping
    public List<Libro> listarLibros() {
        return libroService.listarLibros();
    }

    @Operation(summary = "Actualizar libro")
    @PutMapping("/{id}")
    public Libro actualizarLibro(@PathVariable Long id, @RequestBody Libro libro) {
        return libroService.actualizarLibro(id, libro);
    }

    @Operation(summary = "Eliminar libro")
    @DeleteMapping("/{id}")
    public void eliminarLibro(@PathVariable Long id) {
        libroService.eliminarLibro(id);
    }
}
