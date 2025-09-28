package com.sistemadebiblioteca.demo.categorias.application;

import com.sistemadebiblioteca.demo.categorias.domain.Categoria;
import com.sistemadebiblioteca.demo.categorias.domain.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Servicio de aplicación encargado de la lógica de negocio relacionada con las Categorías.
 * Contiene los métodos CRUD que permiten gestionar las categorías de libros.
 */

@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    /**
     * Constructor que inyecta el repositorio de categorías.
     * @param categoriaRepository implementación del repositorio de categorías
     */
    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    /**
     * Crea una nueva categoría en el sistema.
     * @param categoria objeto de tipo Categoria a registrar
     * @return la categoría guardada
     */
    public Categoria crearCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    /**
     * Busca una categoría por su ID.
     * @param id identificador único de la categoría
     * @return un Optional que puede contener la categoría encontrada
     */
    public Optional<Categoria> obtenerCategoriaPorId(Long id) {
        return categoriaRepository.findById(id);
    }

     /**
     * Lista todas las categorías registradas en el sistema.
     * @return lista de categorías
     */
    public List<Categoria> listarCategorias() {
        return categoriaRepository.findAll();
    }

     /**
     * Actualiza los datos de una categoría existente.
     * @param id identificador de la categoría a actualizar
     * @param categoriaActualizada datos nuevos de la categoría
     * @return la categoría actualizada
     */
    public Categoria actualizarCategoria(Long id, Categoria categoriaActualizada) {
        return categoriaRepository.findById(id).map(categoria -> {
            categoria.setNombre(categoriaActualizada.getNombre());
            categoria.setDescripcion(categoriaActualizada.getDescripcion());
            return categoriaRepository.save(categoria);
        }).orElseThrow(() -> new RuntimeException("Categoría no encontrada"));
    }

    /**
     * Elimina una categoría por su ID.
     * @param id identificador de la categoría a eliminar
     */
    public void eliminarCategoria(Long id) {
        categoriaRepository.deleteById(id);
    }
}
