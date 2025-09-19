package com.sistemadebiblioteca.demo.libros.domain;

import com.sistemadebiblioteca.demo.autores.domain.Autor;
import com.sistemadebiblioteca.demo.categorias.domain.Categoria;
import com.sistemadebiblioteca.demo.editoriales.domain.Editorial;
import jakarta.persistence.*;

@Entity
@Table(name = "libros")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLibro;

    @Column(nullable = false, length = 200)
    private String titulo;

    @Column(name = "anio_publicacion")
    private Integer anioPublicacion;

    @Column(unique = true, length = 20)
    private String isbn;

    // Relaciones
    @ManyToOne
    @JoinColumn(name = "id_autor", nullable = false)
    private Autor autor;

    @ManyToOne
    @JoinColumn(name = "id_categoria", nullable = false)
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "id_editorial", nullable = false)
    private Editorial editorial;

    // =====================
    // Getters y Setters
    // =====================
    public Long getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Long idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(Integer anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
}
