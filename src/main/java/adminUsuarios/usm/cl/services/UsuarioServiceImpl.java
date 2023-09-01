package adminUsuarios.usm.cl.services;

import adminUsuarios.usm.cl.entities.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioServiceImpl implements  UsuarioService{

    public static List<Usuario> usuarios= new ArrayList<>();
    @Override
    public List<Usuario> getAll() {
        return usuarios;
    }

    @Override
    public Usuario createUsuario(Usuario usuario) {

        usuarios.add(usuario);
        return usuario;
    }

    @Override
    public Usuario findUsuario(String email) {


        return usuarios.stream().filter(usuario -> usuario.getEmail().equalsIgnoreCase(email)).findFirst().orElse(null);
    }
}
