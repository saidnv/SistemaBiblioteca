package com.sistemadebiblioteca.demo.editoriales.domain;

import java.util.List;
import java.util.Optional;

public interface EditorialRepository {
    Editorial save(Editorial editorial);
    Optional<Editorial> findById(Long id);
    List<Editorial> findAll();
    void deleteById(Long id);
}
