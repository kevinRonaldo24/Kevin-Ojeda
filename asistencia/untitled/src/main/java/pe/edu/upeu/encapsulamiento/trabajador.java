package pe.edu.upeu.encapsulamiento;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class trabajador {
    private String nombre;
    private int edad;
    private String apellido;
    private String area;
    private char genero;

    @Override
    public String toString() {
        return "tiene las siguientes caracteristicas:\n"+
               "Nombre:"+nombre+"\n"+
               "Apellido:"+apellido+"\n";
    }
}
