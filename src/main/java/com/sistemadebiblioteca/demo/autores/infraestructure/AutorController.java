package com.sistemadebiblioteca.demo.autores.infraestructure;

import com.sistemadebiblioteca.demo.autores.application.AutorService;
import com.sistemadebiblioteca.demo.autores.domain.Autor;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/autores")
@Tag(name = "Autores", description = "Operaciones CRUD para gestionar autores de libros")
public class AutorController {

    private final AutorService autorService;

    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }

    @Operation(summary = "Crear un nuevo autor")
    @PostMapping
    public Autor crearAutor(@RequestBody Autor autor) {
        return autorService.crearAutor(autor);
    }

    @Operation(summary = "Obtener autor por ID")
    @GetMapping("/{id}")
    public Optional<Autor> obtenerAutor(@PathVariable Long id) {
        return autorService.obtenerAutorPorId(id);
    }

    @Operation(summary = "Listar autores")
    @GetMapping
    public List<Autor> listarAutores() {
        return autorService.listarAutores();
    }

    @Operation(summary = "Actualizar autor")
    @PutMapping("/{id}")
    public Autor actualizarAutor(@PathVariable Long id, @RequestBody Autor autor) {
        return autorService.actualizarAutor(id, autor);
    }

    @Operation(summary = "Eliminar autor")
    @DeleteMapping("/{id}")
    public void eliminarAutor(@PathVariable Long id) {
        autorService.eliminarAutor(id);
    }
}
