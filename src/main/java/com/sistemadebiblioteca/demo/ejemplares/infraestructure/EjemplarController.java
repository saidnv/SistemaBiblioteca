package com.sistemadebiblioteca.demo.ejemplares.infraestructure;

import com.sistemadebiblioteca.demo.ejemplares.application.EjemplarService;
import com.sistemadebiblioteca.demo.ejemplares.domain.Ejemplar;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/ejemplares")
@Tag(name = "Ejemplares", description = "Operaciones CRUD para gestionar ejemplares físicos de libros")
public class EjemplarController {

    private final EjemplarService ejemplarService;

    public EjemplarController(EjemplarService ejemplarService) {
        this.ejemplarService = ejemplarService;
    }

    @Operation(summary = "Crear nuevo ejemplar")
    @PostMapping
    public Ejemplar crearEjemplar(@RequestBody Ejemplar ejemplar) {
        return ejemplarService.crearEjemplar(ejemplar);
    }

    @Operation(summary = "Obtener ejemplar por ID")
    @GetMapping("/{id}")
    public Optional<Ejemplar> obtenerEjemplar(@PathVariable Long id) {
        return ejemplarService.obtenerEjemplarPorId(id);
    }

     @Operation(summary = "Listar ejemplares")
    @GetMapping
    public List<Ejemplar> listarEjemplares() {
        return ejemplarService.listarEjemplares();
    }

    @Operation(summary = "Actualizar ejemplar")
    @PutMapping("/{id}")
    public Ejemplar actualizarEjemplar(@PathVariable Long id, @RequestBody Ejemplar ejemplar) {
        return ejemplarService.actualizarEjemplar(id, ejemplar);
    }

    @Operation(summary = "Eliminar ejemplar")
    @DeleteMapping("/{id}")
    public void eliminarEjemplar(@PathVariable Long id) {
        ejemplarService.eliminarEjemplar(id);
    }
}
