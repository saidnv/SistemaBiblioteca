package com.sistemadebiblioteca.demo.editoriales.infraestructure;

import com.sistemadebiblioteca.demo.editoriales.application.EditorialService;
import com.sistemadebiblioteca.demo.editoriales.domain.Editorial;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/editoriales")
@Tag(name = "Editoriales", description = "Operaciones CRUD para gestionar editoriales de libros")
public class EditorialController {

    private final EditorialService editorialService;

    public EditorialController(EditorialService editorialService) {
        this.editorialService = editorialService;
    }

    @Operation(summary = "Crear nueva editorial")
    @PostMapping
    public Editorial crearEditorial(@RequestBody Editorial editorial) {
        return editorialService.crearEditorial(editorial);
    }

    @Operation(summary = "Obtener editorial por ID")
    @GetMapping("/{id}")
    public Optional<Editorial> obtenerEditorial(@PathVariable Long id) {
        return editorialService.obtenerEditorialPorId(id);
    }
    @Operation(summary = "Listar editoriales")
    @GetMapping
    public List<Editorial> listarEditoriales() {
        return editorialService.listarEditoriales();
    }

    @Operation(summary = "Actualizar editorial")
    @PutMapping("/{id}")
    public Editorial actualizarEditorial(@PathVariable Long id, @RequestBody Editorial editorial) {
        return editorialService.actualizarEditorial(id, editorial);
    }

    @Operation(summary = "Eliminar editorial")
    @DeleteMapping("/{id}")
    public void eliminarEditorial(@PathVariable Long id) {
        editorialService.eliminarEditorial(id);
    }
}
