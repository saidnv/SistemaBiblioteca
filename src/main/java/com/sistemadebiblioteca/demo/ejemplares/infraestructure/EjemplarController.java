package com.sistemadebiblioteca.demo.ejemplares.infraestructure;

import com.sistemadebiblioteca.demo.ejemplares.application.EjemplarService;
import com.sistemadebiblioteca.demo.ejemplares.domain.Ejemplar;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/ejemplares")
public class EjemplarController {

    private final EjemplarService ejemplarService;

    public EjemplarController(EjemplarService ejemplarService) {
        this.ejemplarService = ejemplarService;
    }

    @PostMapping
    public Ejemplar crearEjemplar(@RequestBody Ejemplar ejemplar) {
        return ejemplarService.crearEjemplar(ejemplar);
    }

    @GetMapping("/{id}")
    public Optional<Ejemplar> obtenerEjemplar(@PathVariable Long id) {
        return ejemplarService.obtenerEjemplarPorId(id);
    }

    @GetMapping
    public List<Ejemplar> listarEjemplares() {
        return ejemplarService.listarEjemplares();
    }

    @PutMapping("/{id}")
    public Ejemplar actualizarEjemplar(@PathVariable Long id, @RequestBody Ejemplar ejemplar) {
        return ejemplarService.actualizarEjemplar(id, ejemplar);
    }

    @DeleteMapping("/{id}")
    public void eliminarEjemplar(@PathVariable Long id) {
        ejemplarService.eliminarEjemplar(id);
    }
}
