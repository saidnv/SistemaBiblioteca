package com.sistemadebiblioteca.demo.categorias.infraestructure;

import com.sistemadebiblioteca.demo.categorias.application.CategoriaService;
import com.sistemadebiblioteca.demo.categorias.domain.Categoria;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/categorias")
@Tag(name = "Categorías", description = "Operaciones CRUD para gestionar categorías de libros")
public class CategoriaController {

    private final CategoriaService categoriaService;

    /**
     * Constructor que inyecta el servicio de Categorías.
     * @param categoriaService servicio encargado de la lógica de negocio
     */

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    /**
     * Endpoint para crear una nueva categoría.
     * @param categoria objeto JSON con los datos de la categoría
     * @return categoría registrada
     */

    @Operation(summary = "Crear nueva categoría")
    @PostMapping
    public Categoria crearCategoria(@RequestBody Categoria categoria) {
        return categoriaService.crearCategoria(categoria);
    }


   /**
     * Endpoint para obtener una categoría por ID.
     * @param id identificador de la categoría
     * @return categoría encontrada si existe
     */
    @Operation(summary = "Obtener categoría por ID")
    @GetMapping("/{id}")
    public Optional<Categoria> obtenerCategoria(@PathVariable Long id) {
        return categoriaService.obtenerCategoriaPorId(id);
    }

    /**
     * Endpoint para listar todas las categorías.
     * @return lista de categorías
     */
    @Operation(summary = "Listar categorías")
    @GetMapping
    public List<Categoria> listarCategorias() {
        return categoriaService.listarCategorias();
    }
    /**
     * Endpoint para actualizar una categoría existente.
     * @param id identificador de la categoría a actualizar
     * @param categoria objeto con los nuevos datos
     * @return categoría actualizada
     */
    @Operation(summary = "Actualizar categoría")
    @PutMapping("/{id}")
    public Categoria actualizarCategoria(@PathVariable Long id, @RequestBody Categoria categoria) {
        return categoriaService.actualizarCategoria(id, categoria);
    }

    /**
     * Endpoint para eliminar una categoría por ID.
     * @param id identificador de la categoría
     */
    @Operation(summary = "Eliminar categoría")
    @DeleteMapping("/{id}")
    public void eliminarCategoria(@PathVariable Long id) {
        categoriaService.eliminarCategoria(id);
    }
}
