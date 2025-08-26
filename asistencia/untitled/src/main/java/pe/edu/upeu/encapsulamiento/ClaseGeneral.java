package pe.edu.upeu.encapsulamiento;

public class ClaseGeneral {

    public static void main(String[] args) {
        Persona p = new Persona();


        p.setNombre("david");
        p.setEdad(25);
        p.saludo();

        Persona p2 = new Persona("david","Mamani",25);
        p2.saludo();

        trabajador t = new trabajador();
        t.setNombre("david");
        t.setApellido("Mamani");
        t.setEdad(25);
        t.setArea("sistemas");
        t.setGenero('M');
        System.out.println(t);


    }
}
