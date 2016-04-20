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
                System.err.println("ERROR. Introduce un nombre válido\n");
                break;
            }
        } while (mat.matches() == false);

        return (titular);

    }

    public String pedirCuenta() {
        String cuenta = "";
        boolean aux = false;

        do {

            System.out.println("Introduzca su código de cuenta cliente (CCC 20 Dígitos)");
            cuenta = input.nextLine();
            //Combrobación de que el CCC está formado por enteros y tiene veinte
            //dígitos
            pat = Pattern.compile("[0-9]{20}");
            mat = pat.matcher(cuenta);
            aux = mat.matches();
            //Compruebo tambien los digitos de control para el try/catch
            while (aux == false) {
                System.err.println("ERROR. Introduzca un número de cuenta válido\n");
                break;
            }
        } while (aux == false);

        return (cuenta);

    }

    public double movimiento() {

        double movimiento;

        System.out.println("Indique el valor del movimiento: \n");
        movimiento = input.nextDouble();
        System.out.print(" €");
        return movimiento;

    }

    //Método que muestra por pantalla el menú de opciones
    public void menu() {

        System.out.println("\"Escoja una opción\n");
        System.out.println("++++++++++++++++++++++++++++++++++++++\n");
        System.out.println("(1) Ver Código Cuenta Cliente\n");
        System.out.println("(2) Ver titular de la cuenta\n");
        System.out.println("(3) Ver código entidad\n");
        System.out.println("(4) Ver código oficina\n");
        System.out.println("(5) Ver número cuenta\n");
        System.out.println("(6) Ver dígitos de control de cuenta\n");
        System.out.println("(7) Realizar ingreso\n");
        System.out.println("(8) Retirar efectivo\n");
        System.out.println("(9) Consulta saldo\n");
        System.out.println("(10) Salir \n");

    }

    public void pantallaString(String texto) {

        System.out.println(texto + "\n");

    }

    public void pantallaNumero(double numero) {
        System.out.println(numero);

    }

    void pulsa() {
        System.out.println("Pulsa ENTER para continuar");
        input.nextLine();
    }
}
