package com.sistemadebiblioteca.demo.prestamos.infraestructure;

import com.sistemadebiblioteca.demo.prestamos.application.PrestamoService;
import com.sistemadebiblioteca.demo.prestamos.domain.Prestamo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/prestamos")
@Tag(name = "Préstamos", description = "Operaciones CRUD para gestionar préstamos de libros")
public class PrestamoController {

    private final PrestamoService prestamoService;

    public PrestamoController(PrestamoService prestamoService) {
        this.prestamoService = prestamoService;
    }

    @Operation(summary = "Crear nuevo préstamo")
    @PostMapping
    public Prestamo crearPrestamo(@RequestBody Prestamo prestamo) {
        return prestamoService.crearPrestamo(prestamo);
    }


    @Operation(summary = "Obtener préstamo por ID")
    @GetMapping("/{id}")
    public Optional<Prestamo> obtenerPrestamo(@PathVariable Long id) {
        return prestamoService.obtenerPrestamoPorId(id);
    }


    @Operation(summary = "Listar préstamos")
    @GetMapping
    public List<Prestamo> listarPrestamos() {
        return prestamoService.listarPrestamos();
    }

    @Operation(summary = "Actualizar préstamo")
    @PutMapping("/{id}")
    public Prestamo actualizarPrestamo(@PathVariable Long id, @RequestBody Prestamo prestamo) {
        return prestamoService.actualizarPrestamo(id, prestamo);
    }


    @Operation(summary = "Eliminar préstamo")
    @DeleteMapping("/{id}")
    public void eliminarPrestamo(@PathVariable Long id) {
        prestamoService.eliminarPrestamo(id);
    }
}
