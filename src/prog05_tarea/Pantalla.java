package prog05_tarea;

import java.util.*;
import java.util.regex.*; //Para comprobar las cadenas de caracteres, 

/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Clase en la que se solicita por teclado los datos del cliente y comprueba que
 * sean correctos.
 *
 * @author Luis Calvo Martin
 */
public class Pantalla {

    Scanner input = new Scanner(System.in);
    Pattern pat;
    Matcher mat;
    //Patter y Matcher serán utilizados para comprobar cadenas de caracteres
    //

//Método que pide el nombre del titular de la cuenta.
    public String pedirTitular() {

        String titular = "";

        do {
            /* Comprobar si el String cadena está formado por un mínimo de 5 letras 
             * mayúsculas o minúsculas y un máximo de 10 con las clases pattern y 
             * matcher y un bucle do/while 
             */

            System.out.println("Introduza en nombre del titular de la cuenta");
            titular = input.nextLine();
            //Comprobación del nombre
            pat = Pattern.compile("[a-zA-Z ]{5,50}");
            mat = pat.matcher(titular);


            /* Bucle while para mostrar un mensaje de error en casao de que el 
             * nombre no tenga el formato correcto.
             */
            while (mat.matches() == false) {
                System.err.println("ERROR. Introduce un nombre válido");
                break;
            }
        } while (mat.matches() == false);

        return (titular);

    }

    public String pedirCuenta()   {
        String cuenta = "";

        do {

            System.out.println("Introduzca su código de cuenta cliente (CCC 20 Dígitos)");
            cuenta = input.next();
            //Combrobación de que el CCC está formado por enteros y tiene veinte
            //dígitos
            pat = Pattern.compile("[0-9]{20}");
            mat = pat.matcher(cuenta);

            while (mat.matches() == false) {
                System.err.println("ERROR. Introduce un número de cuenta válido");
                break;
            }
        } while (mat.matches() == false);

        return (cuenta);

    }

    //Método que muestra por pantalla el menú de opciones
    public int menu() {
        int option = 0;
        System.out.println("\"Bienvenido, ¿qué operación desdea realizar?");
        System.out.println("");
        System.out.println("(1) Ver Código Cuenta Cliente");
        System.out.println("(2) Ver titular de la cuenta");
        System.out.println("(3) Ver código entidad");
        System.out.println("(4) Ver código oficina");
        System.out.println("(5) Ver número cuenta");
        System.out.println("(6) Ver dígitos de control de cuenta");
        System.out.println("(7) Realizar ingreso");
        System.out.println("(8) Retirar efectivo");
        System.out.println("(9) Consulta saldo");
        System.out.println("(0) Salir ");
        
        option = input.nextInt();

        return option;
    }
}
