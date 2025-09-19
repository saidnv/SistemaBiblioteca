package com.sistemadebiblioteca.demo.autores.infraestructure;

import com.sistemadebiblioteca.demo.autores.application.AutorService;
import com.sistemadebiblioteca.demo.autores.domain.Autor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/autores")
public class AutorController {

    private final AutorService autorService;

    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }

    @PostMapping
    public Autor crearAutor(@RequestBody Autor autor) {
        return autorService.crearAutor(autor);
    }

    @GetMapping("/{id}")
    public Optional<Autor> obtenerAutor(@PathVariable Long id) {
        return autorService.obtenerAutorPorId(id);
    }

    @GetMapping
    public List<Autor> listarAutores() {
        return autorService.listarAutores();
    }

    @PutMapping("/{id}")
    public Autor actualizarAutor(@PathVariable Long id, @RequestBody Autor autor) {
        return autorService.actualizarAutor(id, autor);
    }

    @DeleteMapping("/{id}")
    public void eliminarAutor(@PathVariable Long id) {
        autorService.eliminarAutor(id);
    }
}
