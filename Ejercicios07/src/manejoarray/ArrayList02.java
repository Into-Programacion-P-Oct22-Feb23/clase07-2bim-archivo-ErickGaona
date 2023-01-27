/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarray;

// import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class ArrayList02 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<String> arreglo2 = obtenerDatos();
        String cadenaFinal = obtenerCadenaFinal(arreglo2);
        System.out.println(cadenaFinal);
    }

    public static ArrayList<String> obtenerDatos() {

        System.out.println("----------------------------------");

        boolean bandera = true;

        ArrayList<String> arreglo2 = new ArrayList<>();
        while (bandera) {

            System.out.println("Ingrese nombre del pais: ");
            String pais = entrada.nextLine();

            arreglo2.add(pais);

            System.out.println("desea ingresar mas paises (s) si (n) no?");
            String opcion = entrada.nextLine();
            if (opcion.equals("s")) {
                bandera = true;
            } else {
                bandera = false;
            }

        }
        return arreglo2;
    }

    public static String obtenerCadenaFinal(ArrayList<String> a) {
         String cadena = "";
        for (int i = 0; i < a.size(); i++) {

           
            cadena = String.format("\n%s%s\n",cadena,a.get(i));

        }return cadena;

    }

}

/*
        ArrayList <String> arreglo2 = new ArrayList<>();
        
  String cadena = "";
        for (int i = 0; i < a.size(); i++) {

           
            cadena = String.format("%s%s\n",cadena,a.get(i));

        }return cadena;





        ArrayList <Boolean> arreglo4 = new ArrayList<>();
 */
