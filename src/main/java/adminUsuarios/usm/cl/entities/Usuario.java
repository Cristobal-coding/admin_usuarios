package adminUsuarios.usm.cl.entities;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Usuario {
    private String name;
    private String email;
    private String apellido;
    private String clave;
}
