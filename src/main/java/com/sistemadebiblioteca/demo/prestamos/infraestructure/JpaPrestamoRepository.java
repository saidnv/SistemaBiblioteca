package com.sistemadebiblioteca.demo.prestamos.infraestructure;

import com.sistemadebiblioteca.demo.prestamos.domain.Prestamo;
import com.sistemadebiblioteca.demo.prestamos.domain.PrestamoRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaPrestamoRepository extends PrestamoRepository, JpaRepository<Prestamo, Long> {
}
