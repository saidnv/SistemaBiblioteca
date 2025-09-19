package com.sistemadebiblioteca.demo.autores.application;

import com.sistemadebiblioteca.demo.autores.domain.Autor;
import com.sistemadebiblioteca.demo.autores.domain.AutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {

    private final AutorRepository autorRepository;

    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public Autor crearAutor(Autor autor) {
        return autorRepository.save(autor);
    }

    public Optional<Autor> obtenerAutorPorId(Long id) {
        return autorRepository.findById(id);
    }

    public List<Autor> listarAutores() {
        return autorRepository.findAll();
    }

    public Autor actualizarAutor(Long id, Autor autorActualizado) {
        return autorRepository.findById(id).map(autor -> {
            autor.setNombre(autorActualizado.getNombre());
            autor.setApellido(autorActualizado.getApellido());
            autor.setNacionalidad(autorActualizado.getNacionalidad());
            return autorRepository.save(autor);
        }).orElseThrow(() -> new RuntimeException("Autor no encontrado"));
    }

    public void eliminarAutor(Long id) {
        autorRepository.deleteById(id);
    }
}
