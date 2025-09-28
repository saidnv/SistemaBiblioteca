package com.sistemadebiblioteca.demo.detalle_prestamo.infraestructure;

import com.sistemadebiblioteca.demo.detalle_prestamo.application.DetallePrestamoService;
import com.sistemadebiblioteca.demo.detalle_prestamo.domain.DetallePrestamo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/detalle-prestamos")
@Tag(name = "Detalle Préstamos", description = "Operaciones CRUD para gestionar los detalles de un préstamo (ejemplares prestados)")
public class DetallePrestamoController {

    private final DetallePrestamoService detallePrestamoService;

    public DetallePrestamoController(DetallePrestamoService detallePrestamoService) {
        this.detallePrestamoService = detallePrestamoService;
    }

    @Operation(summary = "Crear nuevo detalle de préstamo")
    @PostMapping
    public DetallePrestamo crearDetallePrestamo(@RequestBody DetallePrestamo detallePrestamo) {
        return detallePrestamoService.crearDetallePrestamo(detallePrestamo);
    }

    @Operation(summary = "Obtener detalle por ID")
    @GetMapping("/{id}")
    public Optional<DetallePrestamo> obtenerDetallePrestamo(@PathVariable Long id) {
        return detallePrestamoService.obtenerDetallePrestamoPorId(id);
    }

    @Operation(summary = "Listar detalles de préstamos")
    @GetMapping
    public List<DetallePrestamo> listarDetallePrestamos() {
        return detallePrestamoService.listarDetallePrestamos();
    }

    @Operation(summary = "Actualizar detalle de préstamo")
    @PutMapping("/{id}")
    public DetallePrestamo actualizarDetallePrestamo(@PathVariable Long id, @RequestBody DetallePrestamo detalle) {
        return detallePrestamoService.actualizarDetallePrestamo(id, detalle);
    }

    @Operation(summary = "Eliminar detalle de préstamo")
    @DeleteMapping("/{id}")
    public void eliminarDetallePrestamo(@PathVariable Long id) {
        detallePrestamoService.eliminarDetallePrestamo(id);
    }
}

