package com.sistemadebiblioteca.demo.libros.infraestructure;

import com.sistemadebiblioteca.demo.libros.domain.Libro;
import com.sistemadebiblioteca.demo.libros.domain.LibroRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaLibroRepository extends LibroRepository, JpaRepository<Libro, Long> {
}
