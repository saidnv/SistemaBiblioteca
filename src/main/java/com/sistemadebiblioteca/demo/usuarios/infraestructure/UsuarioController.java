package com.sistemadebiblioteca.demo.usuarios.infraestructure;

import com.sistemadebiblioteca.demo.usuarios.application.UsuarioService;
import com.sistemadebiblioteca.demo.usuarios.domain.Usuario;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuarios")
@Tag(name = "Usuarios", description = "Operaciones CRUD para gestionar usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

     @Operation(summary = "Crear un nuevo usuario", description = "Registra un nuevo usuario en el sistema de biblioteca")
    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario usuario) {
        return usuarioService.crearUsuario(usuario);
    }

    @Operation(summary = "Obtener usuario por ID", description = "Busca un usuario registrado mediante su identificador único")
    @GetMapping("/{id}")
    public Optional<Usuario> obtenerUsuario(@PathVariable Long id) {
        return usuarioService.obtenerUsuarioPorId(id);
    }

     @Operation(summary = "Listar usuarios", description = "Muestra todos los usuarios registrados en el sistema")
    @GetMapping
    public List<Usuario> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }
    @Operation(summary = "Actualizar usuario", description = "Actualiza los datos de un usuario existente")
    @PutMapping("/{id}")
    public Usuario actualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {
        return usuarioService.actualizarUsuario(id, usuario);
    }

    @Operation(summary = "Eliminar usuario", description = "Elimina un usuario del sistema por su ID")
    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable Long id) {
        usuarioService.eliminarUsuario(id);
    }
}
