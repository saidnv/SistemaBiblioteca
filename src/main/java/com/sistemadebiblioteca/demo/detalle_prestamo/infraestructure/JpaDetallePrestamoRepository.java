package com.sistemadebiblioteca.demo.detalle_prestamo.infraestructure;

import com.sistemadebiblioteca.demo.detalle_prestamo.domain.DetallePrestamo;
import com.sistemadebiblioteca.demo.detalle_prestamo.domain.DetallePrestamoRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaDetallePrestamoRepository extends DetallePrestamoRepository, JpaRepository<DetallePrestamo, Long> {
}
