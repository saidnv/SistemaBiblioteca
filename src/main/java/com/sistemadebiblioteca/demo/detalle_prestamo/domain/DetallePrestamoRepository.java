package com.sistemadebiblioteca.demo.detalle_prestamo.domain;

import java.util.List;
import java.util.Optional;

public interface DetallePrestamoRepository {
    DetallePrestamo save(DetallePrestamo detallePrestamo);
    Optional<DetallePrestamo> findById(Long id);
    List<DetallePrestamo> findAll();
    void deleteById(Long id);
}
