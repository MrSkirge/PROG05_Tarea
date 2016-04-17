package prog05_tarea;

import java.util.*;

/**
 *
 * @author Luis Calvo Martin
 * @class AplicacionCuentaBancaria
 */
public class AplicacionCuentaBancaria {

    static Pantalla peticion;
    static CuentaBancaria cuenta;

    public static void main(String[] args) {
        int opcion = 0;
        Scanner input = new Scanner(System.in);

        peticion = new Pantalla();
        cuenta = new CuentaBancaria(peticion.pedirTitular(), peticion.pedirCuenta());
        while (opcion != 10) {
            try {
                peticion.menu();
                opcion = input.nextInt();

                switch (opcion) {
                    case 1:

                        break;
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

                        break;
                    case 10:

                        break;
                    default:
                        System.err.println("ERROR: Introduzca un dígito del 0 - 9");

                        break;
                }

            } catch (InputMismatchException e) {
                System.err.println("\nERROR: Introduzca un dígito del 1 - 10\n");
                input.next();

            }

        }

    }
}
