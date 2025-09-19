package com.sistemadebiblioteca.demo.ejemplares.domain;

import com.sistemadebiblioteca.demo.libros.domain.Libro;
import jakarta.persistence.*;

@Entity
@Table(name = "ejemplares")
public class Ejemplar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEjemplar;

    @ManyToOne
    @JoinColumn(name = "id_libro", nullable = false)
    private Libro libro;

    @Column(unique = true, nullable = false, length = 20)
    private String codigoInterno;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstadoEjemplar estado = EstadoEjemplar.Disponible;

    // =====================
    // ENUM para estado
    // =====================
    public enum EstadoEjemplar {
        Disponible,
        Prestado,
        Dañado
    }

    // =====================
    // Getters y Setters
    // =====================
    public Long getIdEjemplar() {
        return idEjemplar;
    }

    public void setIdEjemplar(Long idEjemplar) {
        this.idEjemplar = idEjemplar;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public String getCodigoInterno() {
        return codigoInterno;
    }

    public void setCodigoInterno(String codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public EstadoEjemplar getEstado() {
        return estado;
    }

    public void setEstado(EstadoEjemplar estado) {
        this.estado = estado;
    }
}
