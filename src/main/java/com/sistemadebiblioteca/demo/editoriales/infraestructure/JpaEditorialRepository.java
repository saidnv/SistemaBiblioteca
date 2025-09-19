package com.sistemadebiblioteca.demo.editoriales.infraestructure;

import com.sistemadebiblioteca.demo.editoriales.domain.Editorial;
import com.sistemadebiblioteca.demo.editoriales.domain.EditorialRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaEditorialRepository extends EditorialRepository, JpaRepository<Editorial, Long> {
}
