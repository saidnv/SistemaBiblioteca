package com.sistemadebiblioteca.demo.editoriales.application;

import com.sistemadebiblioteca.demo.editoriales.domain.Editorial;
import com.sistemadebiblioteca.demo.editoriales.domain.EditorialRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EditorialService {

    private final EditorialRepository editorialRepository;

    public EditorialService(EditorialRepository editorialRepository) {
        this.editorialRepository = editorialRepository;
    }

    public Editorial crearEditorial(Editorial editorial) {
        return editorialRepository.save(editorial);
    }

    public Optional<Editorial> obtenerEditorialPorId(Long id) {
        return editorialRepository.findById(id);
    }

    public List<Editorial> listarEditoriales() {
        return editorialRepository.findAll();
    }

    public Editorial actualizarEditorial(Long id, Editorial editorialActualizada) {
        return editorialRepository.findById(id).map(editorial -> {
            editorial.setNombre(editorialActualizada.getNombre());
            editorial.setPais(editorialActualizada.getPais());
            return editorialRepository.save(editorial);
        }).orElseThrow(() -> new RuntimeException("Editorial no encontrada"));
    }

    public void eliminarEditorial(Long id) {
        editorialRepository.deleteById(id);
    }
}
