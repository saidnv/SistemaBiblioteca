package com.sistemadebiblioteca.demo.editoriales.infraestructure;

import com.sistemadebiblioteca.demo.editoriales.application.EditorialService;
import com.sistemadebiblioteca.demo.editoriales.domain.Editorial;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/editoriales")
public class EditorialController {

    private final EditorialService editorialService;

    public EditorialController(EditorialService editorialService) {
        this.editorialService = editorialService;
    }

    @PostMapping
    public Editorial crearEditorial(@RequestBody Editorial editorial) {
        return editorialService.crearEditorial(editorial);
    }

    @GetMapping("/{id}")
    public Optional<Editorial> obtenerEditorial(@PathVariable Long id) {
        return editorialService.obtenerEditorialPorId(id);
    }

    @GetMapping
    public List<Editorial> listarEditoriales() {
        return editorialService.listarEditoriales();
    }

    @PutMapping("/{id}")
    public Editorial actualizarEditorial(@PathVariable Long id, @RequestBody Editorial editorial) {
        return editorialService.actualizarEditorial(id, editorial);
    }

    @DeleteMapping("/{id}")
    public void eliminarEditorial(@PathVariable Long id) {
        editorialService.eliminarEditorial(id);
    }
}
