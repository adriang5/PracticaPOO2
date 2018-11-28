package PracticaPOO;

import java.util.Scanner;

public class Menu {

    public  void eleccion(){

        System.out.println("1. Crear Libro");
        System.out.println("2. Ver lista de hojas");
        System.out.println("189. Crear Hoja");
        System.out.println("3. Elige hoja actual");
        System.out.println("4. Borrar hoja");
        System.out.println("5. Asignar valor a una celda");
        System.out.println("6. Mostrar contenido de una celda");
        System.out.println("7. Cargar libro");
        System.out.println("8. Guardar libro");
        System.out.println("9. Salir");

        Scanner menu = new Scanner(System.in);
        int opcion = menu.nextInt();

        switch (opcion) {
            case 1:
                CrearLibro libro = new CrearLibro();
                libro.crearLibro();
                eleccion();

            case 2:

                break;

            case 3:
                break;

            case 4:
                break;

            case 5:
                break;

            case 6:
                break;

            case 7:
                break;

            case 8:
                break;

            case 9:
                System.out.println("Has salido");
                break;

            case 10:
                System.out.println("ERROR");
                break;


        }

    }
}
