package com.sistemadebiblioteca.demo.ejemplares.domain;

import java.util.List;
import java.util.Optional;

public interface EjemplarRepository {
    Ejemplar save(Ejemplar ejemplar);
    Optional<Ejemplar> findById(Long id);
    List<Ejemplar> findAll();
    void deleteById(Long id);
}
