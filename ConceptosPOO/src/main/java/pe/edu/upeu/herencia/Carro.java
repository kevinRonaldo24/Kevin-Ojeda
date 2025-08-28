package pe.edu.upeu.herencia;

import java.util.concurrent.Callable;

public class Carro extends vehiculo{

    public static void main(String[] args) {
      Carro c = new Carro();
      System.out.println("caracteristicas");
      c.marca="toyota";
      System.out.println("marca"+c.marca);


      c.sonido();

    }
}


