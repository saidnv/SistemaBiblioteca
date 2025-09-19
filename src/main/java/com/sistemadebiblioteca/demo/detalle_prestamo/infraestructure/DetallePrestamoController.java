package com.sistemadebiblioteca.demo.detalle_prestamo.infraestructure;

import com.sistemadebiblioteca.demo.detalle_prestamo.application.DetallePrestamoService;
import com.sistemadebiblioteca.demo.detalle_prestamo.domain.DetallePrestamo;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/detalle-prestamos")
public class DetallePrestamoController {

    private final DetallePrestamoService detallePrestamoService;

    public DetallePrestamoController(DetallePrestamoService detallePrestamoService) {
        this.detallePrestamoService = detallePrestamoService;
    }

    @PostMapping
    public DetallePrestamo crearDetallePrestamo(@RequestBody DetallePrestamo detallePrestamo) {
        return detallePrestamoService.crearDetallePrestamo(detallePrestamo);
    }

    @GetMapping("/{id}")
    public Optional<DetallePrestamo> obtenerDetallePrestamo(@PathVariable Long id) {
        return detallePrestamoService.obtenerDetallePrestamoPorId(id);
    }

    @GetMapping
    public List<DetallePrestamo> listarDetallePrestamos() {
        return detallePrestamoService.listarDetallePrestamos();
    }

    @PutMapping("/{id}")
    public DetallePrestamo actualizarDetallePrestamo(@PathVariable Long id, @RequestBody DetallePrestamo detalle) {
        return detallePrestamoService.actualizarDetallePrestamo(id, detalle);
    }

    @DeleteMapping("/{id}")
    public void eliminarDetallePrestamo(@PathVariable Long id) {
        detallePrestamoService.eliminarDetallePrestamo(id);
    }
}

