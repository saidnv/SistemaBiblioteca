package com.sistemadebiblioteca.demo.categorias.infraestructure;

import com.sistemadebiblioteca.demo.categorias.domain.Categoria;
import com.sistemadebiblioteca.demo.categorias.domain.CategoriaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaCategoriaRepository extends CategoriaRepository, JpaRepository<Categoria, Long> {
}
