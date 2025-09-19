package com.sistemadebiblioteca.demo.categorias.application;

import com.sistemadebiblioteca.demo.categorias.domain.Categoria;
import com.sistemadebiblioteca.demo.categorias.domain.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public Categoria crearCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public Optional<Categoria> obtenerCategoriaPorId(Long id) {
        return categoriaRepository.findById(id);
    }

    public List<Categoria> listarCategorias() {
        return categoriaRepository.findAll();
    }

    public Categoria actualizarCategoria(Long id, Categoria categoriaActualizada) {
        return categoriaRepository.findById(id).map(categoria -> {
            categoria.setNombre(categoriaActualizada.getNombre());
            categoria.setDescripcion(categoriaActualizada.getDescripcion());
            return categoriaRepository.save(categoria);
        }).orElseThrow(() -> new RuntimeException("Categoría no encontrada"));
    }

    public void eliminarCategoria(Long id) {
        categoriaRepository.deleteById(id);
    }
}
