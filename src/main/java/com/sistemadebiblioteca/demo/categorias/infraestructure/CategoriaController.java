package com.sistemadebiblioteca.demo.categorias.infraestructure;

import com.sistemadebiblioteca.demo.categorias.application.CategoriaService;
import com.sistemadebiblioteca.demo.categorias.domain.Categoria;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {

    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @PostMapping
    public Categoria crearCategoria(@RequestBody Categoria categoria) {
        return categoriaService.crearCategoria(categoria);
    }

    @GetMapping("/{id}")
    public Optional<Categoria> obtenerCategoria(@PathVariable Long id) {
        return categoriaService.obtenerCategoriaPorId(id);
    }

    @GetMapping
    public List<Categoria> listarCategorias() {
        return categoriaService.listarCategorias();
    }

    @PutMapping("/{id}")
    public Categoria actualizarCategoria(@PathVariable Long id, @RequestBody Categoria categoria) {
        return categoriaService.actualizarCategoria(id, categoria);
    }

    @DeleteMapping("/{id}")
    public void eliminarCategoria(@PathVariable Long id) {
        categoriaService.eliminarCategoria(id);
    }
}
