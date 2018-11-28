package PracticaPOO;

import java.util.HashMap;

public class Hoja extends Libro{

    //Variables de la clase Hoja
    private int id;
    HashMap<Celda, String> variable;
    private String nombre;
    private int x;
    private int y;


    public Hoja (){
        HashMap<Celda, String> hoja = new HashMap<>();
        this.nombre = nombre;

    }


    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



}
