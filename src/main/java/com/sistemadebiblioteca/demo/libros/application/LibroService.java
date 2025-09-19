package com.sistemadebiblioteca.demo.libros.application;

import com.sistemadebiblioteca.demo.libros.domain.Libro;
import com.sistemadebiblioteca.demo.libros.domain.LibroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService {

    private final LibroRepository libroRepository;

    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    public Libro crearLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    public Optional<Libro> obtenerLibroPorId(Long id) {
        return libroRepository.findById(id);
    }

    public List<Libro> listarLibros() {
        return libroRepository.findAll();
    }

    public Libro actualizarLibro(Long id, Libro libroActualizado) {
        return libroRepository.findById(id).map(libro -> {
            libro.setTitulo(libroActualizado.getTitulo());
            libro.setAnioPublicacion(libroActualizado.getAnioPublicacion());
            libro.setIsbn(libroActualizado.getIsbn());
            libro.setAutor(libroActualizado.getAutor());
            libro.setCategoria(libroActualizado.getCategoria());
            libro.setEditorial(libroActualizado.getEditorial());
            return libroRepository.save(libro);
        }).orElseThrow(() -> new RuntimeException("Libro no encontrado"));
    }

    public void eliminarLibro(Long id) {
        libroRepository.deleteById(id);
    }
}
