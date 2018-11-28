package PracticaPOO;

import java.util.ArrayList;


public class Libro {

    //Variables de la clase Libro
    private String nombre;
    ArrayList<Hoja> listadehojas = new ArrayList<>();
    private int numhojas;
    private Hoja hojaactiva;
    private boolean vacio;



    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumhojas() {
        return numhojas;
    }

    public void setNumhojas(int numhojas) {
        this.numhojas = numhojas;
    }

    public Hoja getHojaactiva() {
        return hojaactiva;
    }

    public void setHojaactiva(Hoja hojaactiva) {
        this.hojaactiva = hojaactiva;
    }

    public ArrayList<Hoja> getListadehojas() {
        return listadehojas;
    }


    public boolean isVacio() {
        return vacio;
    }

    public void setVacio(boolean vacio) {
        this.vacio = vacio;
    }







    }

