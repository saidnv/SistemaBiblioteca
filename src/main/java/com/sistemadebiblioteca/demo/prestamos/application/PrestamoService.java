package com.sistemadebiblioteca.demo.prestamos.application;

import com.sistemadebiblioteca.demo.prestamos.domain.Prestamo;
import com.sistemadebiblioteca.demo.prestamos.domain.PrestamoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrestamoService {

    private final PrestamoRepository prestamoRepository;

    public PrestamoService(PrestamoRepository prestamoRepository) {
        this.prestamoRepository = prestamoRepository;
    }

    public Prestamo crearPrestamo(Prestamo prestamo) {
        return prestamoRepository.save(prestamo);
    }

    public Optional<Prestamo> obtenerPrestamoPorId(Long id) {
        return prestamoRepository.findById(id);
    }

    public List<Prestamo> listarPrestamos() {
        return prestamoRepository.findAll();
    }

    public Prestamo actualizarPrestamo(Long id, Prestamo prestamoActualizado) {
        return prestamoRepository.findById(id).map(prestamo -> {
            prestamo.setUsuario(prestamoActualizado.getUsuario());
            prestamo.setFechaPrestamo(prestamoActualizado.getFechaPrestamo());
            prestamo.setFechaDevolucion(prestamoActualizado.getFechaDevolucion());
            prestamo.setEstado(prestamoActualizado.getEstado());
            return prestamoRepository.save(prestamo);
        }).orElseThrow(() -> new RuntimeException("Préstamo no encontrado"));
    }

    public void eliminarPrestamo(Long id) {
        prestamoRepository.deleteById(id);
    }
}
