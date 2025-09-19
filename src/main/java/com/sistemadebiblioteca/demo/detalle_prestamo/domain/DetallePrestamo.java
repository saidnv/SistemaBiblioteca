package com.sistemadebiblioteca.demo.detalle_prestamo.domain;

import com.sistemadebiblioteca.demo.prestamos.domain.Prestamo;
import com.sistemadebiblioteca.demo.ejemplares.domain.Ejemplar;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "detalle_prestamo")
public class DetallePrestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetalle;

    @ManyToOne
    @JoinColumn(name = "id_prestamo", nullable = false)
    private Prestamo prestamo;

    @ManyToOne
    @JoinColumn(name = "id_ejemplar", nullable = false)
    private Ejemplar ejemplar;

    private LocalDate fechaDevolucionReal;

    // =====================
    // Getters y Setters
    // =====================

    public Long getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(Long idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    public LocalDate getFechaDevolucionReal() {
        return fechaDevolucionReal;
    }

    public void setFechaDevolucionReal(LocalDate fechaDevolucionReal) {
        this.fechaDevolucionReal = fechaDevolucionReal;
    }
}
