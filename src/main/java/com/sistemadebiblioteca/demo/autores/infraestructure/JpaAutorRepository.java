package com.sistemadebiblioteca.demo.autores.infraestructure;

import com.sistemadebiblioteca.demo.autores.domain.Autor;
import com.sistemadebiblioteca.demo.autores.domain.AutorRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaAutorRepository extends AutorRepository, JpaRepository<Autor, Long> {
}
