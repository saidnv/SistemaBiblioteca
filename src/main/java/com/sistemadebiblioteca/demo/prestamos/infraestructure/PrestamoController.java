package com.sistemadebiblioteca.demo.prestamos.infraestructure;

import com.sistemadebiblioteca.demo.prestamos.application.PrestamoService;
import com.sistemadebiblioteca.demo.prestamos.domain.Prestamo;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/prestamos")
public class PrestamoController {

    private final PrestamoService prestamoService;

    public PrestamoController(PrestamoService prestamoService) {
        this.prestamoService = prestamoService;
    }

    @PostMapping
    public Prestamo crearPrestamo(@RequestBody Prestamo prestamo) {
        return prestamoService.crearPrestamo(prestamo);
    }

    @GetMapping("/{id}")
    public Optional<Prestamo> obtenerPrestamo(@PathVariable Long id) {
        return prestamoService.obtenerPrestamoPorId(id);
    }

    @GetMapping
    public List<Prestamo> listarPrestamos() {
        return prestamoService.listarPrestamos();
    }

    @PutMapping("/{id}")
    public Prestamo actualizarPrestamo(@PathVariable Long id, @RequestBody Prestamo prestamo) {
        return prestamoService.actualizarPrestamo(id, prestamo);
    }

    @DeleteMapping("/{id}")
    public void eliminarPrestamo(@PathVariable Long id) {
        prestamoService.eliminarPrestamo(id);
    }
}
