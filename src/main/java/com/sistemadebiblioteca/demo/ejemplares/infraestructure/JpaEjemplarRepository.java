package com.sistemadebiblioteca.demo.ejemplares.infraestructure;

import com.sistemadebiblioteca.demo.ejemplares.domain.Ejemplar;
import com.sistemadebiblioteca.demo.ejemplares.domain.EjemplarRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaEjemplarRepository extends EjemplarRepository, JpaRepository<Ejemplar, Long> {
}
