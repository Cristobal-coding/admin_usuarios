package adminUsuarios.usm.cl.controllers;
import java.util.List;
import adminUsuarios.usm.cl.entities.Usuario;
import adminUsuarios.usm.cl.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuarios")
    public ResponseEntity<List<Usuario>> getAllUsers(){
        try{
            List<Usuario> usuarios = usuarioService.getAll();
            return ResponseEntity.ok(usuarios);
        }catch (Exception ex){
            return ResponseEntity.internalServerError().body(null);
        }
    };

    @PostMapping("/usuarios")
    public ResponseEntity<Usuario> createUsuario(@RequestBody Usuario usuario){
        try{
            Usuario newUsuario = usuarioService.createUsuario(usuario);
            return ResponseEntity.ok(newUsuario);
        }catch (Exception ex){
            return ResponseEntity.internalServerError().body(null);
        }
    };

    @GetMapping("/usuarios/{email}")
    public ResponseEntity<Usuario> findUsuario(@PathVariable String email){
        try{
            Usuario usuario = usuarioService.findUsuario(email);
            return ResponseEntity.ok(usuario);
        }catch (Exception ex){
            return ResponseEntity.internalServerError().body(null);
        }
    };
}
