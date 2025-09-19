package com.sistemadebiblioteca.demo.categorias.domain;

import java.util.List;
import java.util.Optional;

public interface CategoriaRepository {
    Categoria save(Categoria categoria);
    Optional<Categoria> findById(Long id);
    List<Categoria> findAll();
    void deleteById(Long id);
}
