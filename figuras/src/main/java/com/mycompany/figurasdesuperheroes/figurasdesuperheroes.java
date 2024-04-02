
package com.mycompany.figuras;

import com.mycompany.figuras.coleccion.Coleccion;
import com.mycompany.figuras.dimension.Dimension;
import com.mycompany.figuras.figura.figura;
import com.mycompany.figuras.java.awt.dimension;
import com.mycompany.figuras.superheroe.Superheroe;

public class figurasdesuperheroes {
    public static void main(String[] args) {
        superheroe volador = new superheroe("Volador");
        superheroe armadura = new superheroe("Armadura");
        superheroe acuatico = new superheroe("Acuatico");
        
        volador.setDescription("Vuela");
        armadura.setDescription("Resistente");
        acuatico.setDescription("Viaja en el agua");
        
        dimension small = new dimension(10,10,10);
        dimension medium = new dimension(15,15,15);
        dimension big = new dimension(22,22,22);
        
        figura superman = new Figura("20", 28000, medium, volador);
        figura ironman = new Figura("21", 30000, big, armadura);
        figura aquaman = new Figura("22", 18000, medium, acuatico);
        
        System.out.println(aquaman.toString());
        System.out.println(aquaman.getPrice());
        coleccion collecion1 = new coleccion("DC");
        collecion1.addFigura(superman);
        collecion1.addFigura(ironman);
        collecion1.addFigura(aquaman);
        collecion1.subirPrecio(21000,"22");
        System.out.println(aquaman.getPrice());
        volador.setCape(true);
        
        System.out.println(collecion1.toString());
        System.out.println(collecion1.masValioso());
        System.out.println(collecion1.getValorColeccion());
        System.out.println(collecion1.getVolumenColeccion());
        
    }
}



    