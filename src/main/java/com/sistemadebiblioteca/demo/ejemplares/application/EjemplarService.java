package com.sistemadebiblioteca.demo.ejemplares.application;

import com.sistemadebiblioteca.demo.ejemplares.domain.Ejemplar;
import com.sistemadebiblioteca.demo.ejemplares.domain.EjemplarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EjemplarService {

    private final EjemplarRepository ejemplarRepository;

    public EjemplarService(EjemplarRepository ejemplarRepository) {
        this.ejemplarRepository = ejemplarRepository;
    }

    public Ejemplar crearEjemplar(Ejemplar ejemplar) {
        return ejemplarRepository.save(ejemplar);
    }

    public Optional<Ejemplar> obtenerEjemplarPorId(Long id) {
        return ejemplarRepository.findById(id);
    }

    public List<Ejemplar> listarEjemplares() {
        return ejemplarRepository.findAll();
    }

    public Ejemplar actualizarEjemplar(Long id, Ejemplar ejemplarActualizado) {
        return ejemplarRepository.findById(id).map(ejemplar -> {
            ejemplar.setLibro(ejemplarActualizado.getLibro());
            ejemplar.setCodigoInterno(ejemplarActualizado.getCodigoInterno());
            ejemplar.setEstado(ejemplarActualizado.getEstado());
            return ejemplarRepository.save(ejemplar);
        }).orElseThrow(() -> new RuntimeException("Ejemplar no encontrado"));
    }

    public void eliminarEjemplar(Long id) {
        ejemplarRepository.deleteById(id);
    }
}
