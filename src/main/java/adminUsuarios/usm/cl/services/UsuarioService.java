package adminUsuarios.usm.cl.services;

import adminUsuarios.usm.cl.entities.Usuario;

import java.util.List;

public interface UsuarioService {
    List<Usuario> getAll();
    Usuario createUsuario(Usuario usuario);
    Usuario findUsuario(String email);
}
