package com.sistemadebiblioteca.demo.prestamos.domain;

import java.util.List;
import java.util.Optional;

public interface PrestamoRepository {
    Prestamo save(Prestamo prestamo);
    Optional<Prestamo> findById(Long id);
    List<Prestamo> findAll();
    void deleteById(Long id);
}
