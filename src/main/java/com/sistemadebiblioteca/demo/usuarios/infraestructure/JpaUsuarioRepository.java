package com.sistemadebiblioteca.demo.usuarios.infraestructure;

import com.sistemadebiblioteca.demo.usuarios.domain.Usuario;
import com.sistemadebiblioteca.demo.usuarios.domain.UsuarioRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaUsuarioRepository extends UsuarioRepository, JpaRepository<Usuario, Long> {
}
