package com.sistemadebiblioteca.demo.autores.domain;

import java.util.List;
import java.util.Optional;

public interface AutorRepository {
    Autor save(Autor autor);
    Optional<Autor> findById(Long id);
    List<Autor> findAll();
    void deleteById(Long id);
}
