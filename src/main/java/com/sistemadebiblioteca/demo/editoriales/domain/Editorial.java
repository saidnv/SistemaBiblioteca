package com.sistemadebiblioteca.demo.editoriales.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "editoriales")
public class Editorial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEditorial;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(length = 50)
    private String pais;

    // =====================
    // Getters y Setters
    // =====================

    public Long getIdEditorial() {
        return idEditorial;
    }

    public void setIdEditorial(Long idEditorial) {
        this.idEditorial = idEditorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
