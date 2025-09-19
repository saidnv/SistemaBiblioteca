package com.sistemadebiblioteca.demo.libros.domain;

import java.util.List;
import java.util.Optional;

public interface LibroRepository {
    Libro save(Libro libro);
    Optional<Libro> findById(Long id);
    List<Libro> findAll();
    void deleteById(Long id);
}
