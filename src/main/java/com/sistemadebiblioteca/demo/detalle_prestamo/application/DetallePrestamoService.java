package com.sistemadebiblioteca.demo.detalle_prestamo.application;

import com.sistemadebiblioteca.demo.detalle_prestamo.domain.DetallePrestamo;
import com.sistemadebiblioteca.demo.detalle_prestamo.domain.DetallePrestamoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetallePrestamoService {

    private final DetallePrestamoRepository detallePrestamoRepository;

    public DetallePrestamoService(DetallePrestamoRepository detallePrestamoRepository) {
        this.detallePrestamoRepository = detallePrestamoRepository;
    }

    public DetallePrestamo crearDetallePrestamo(DetallePrestamo detallePrestamo) {
        return detallePrestamoRepository.save(detallePrestamo);
    }

    public Optional<DetallePrestamo> obtenerDetallePrestamoPorId(Long id) {
        return detallePrestamoRepository.findById(id);
    }

    public List<DetallePrestamo> listarDetallePrestamos() {
        return detallePrestamoRepository.findAll();
    }

    public DetallePrestamo actualizarDetallePrestamo(Long id, DetallePrestamo detalleActualizado) {
        return detallePrestamoRepository.findById(id).map(detalle -> {
            detalle.setPrestamo(detalleActualizado.getPrestamo());
            detalle.setEjemplar(detalleActualizado.getEjemplar());
            detalle.setFechaDevolucionReal(detalleActualizado.getFechaDevolucionReal());
            return detallePrestamoRepository.save(detalle);
        }).orElseThrow(() -> new RuntimeException("Detalle de préstamo no encontrado"));
    }

    public void eliminarDetallePrestamo(Long id) {
        detallePrestamoRepository.deleteById(id);
    }
}
