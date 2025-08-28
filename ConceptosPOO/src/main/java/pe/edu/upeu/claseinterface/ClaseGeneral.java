package pe.edu.upeu.claseinterface;

public class ClaseGeneral {
    public static void main(String[] args) {
        Animal a=new Loro();
        a.emitirsonido();
        a.dormir();

        a=new gato();

    }
}
