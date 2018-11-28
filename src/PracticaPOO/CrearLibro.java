package PracticaPOO;

import java.util.HashMap;

public class CrearLibro extends Libro{


    public void crearLibro() {


        //Crea 3 hojas nuevas llamadas Hoja1, Hoja2 y Hoja3
        CrearHoja nuevas = new CrearHoja();
        nuevas.crear3hojas();

        //Borra todas las hojas que haya en el libro
        BorrarHoja adios = new BorrarHoja();
        adios.borrarhojas();



    }

}
