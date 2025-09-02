package pe.edu.upeu.asistencia.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter

public enum Carrera {
    SISTEMAS(Facultad.FIA, "Ing. Sistemas"),
    CIVIL(Facultad.FIA, "Ing. Civil"),
    AMBIENTAL(Facultad.FIA, "Ing. Ambiental"),

    ADMINISTRACION(Facultad.FIA, "Ing. Sistemas"),
    NUTRICION(Facultad.FCS, "Ing. Sistemas"),
    EDUCACION(Facultad.FACIHED, "Ing. Sistemas");




    private Facultad facultad;
    private String descripcion;
}
