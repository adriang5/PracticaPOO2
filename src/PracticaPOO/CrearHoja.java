package PracticaPOO;

import java.util.HashMap;

public class CrearHoja extends Hoja {


    //metodo para el comando CrearLibro, que no recibe nada y crea 3 hojas llamadas Hoja1, Hoja2 y Hoja3
    public void crear3hojas(){

        Hoja Hoja1 = new Hoja();
        Hoja1.setNombre("Hoja 1");


        Hoja Hoja2 = new Hoja();
        Hoja2.setNombre("Hoja 2");


        Hoja Hoja3 = new Hoja();
        Hoja3.setNombre("Hoja 3");



        System.out.println("Se han creado 3 hojas llamadas " + Hoja1.getNombre() +", "+ Hoja2.getNombre()+ " y " + Hoja3.getNombre());


    }

}
