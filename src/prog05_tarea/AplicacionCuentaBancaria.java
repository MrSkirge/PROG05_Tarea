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

    public static void main(String[] args) throws SaldoExcepcion {
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
                        cuenta.verCCC();
                        break;
                    case 2:
                        cuenta.getTitular();
                        break;
                    case 3:
                        cuenta.verCodigoEntidad();
                        break;
                    case 4:
                        cuenta.verCodigoOficina();
                        break;
                    case 5:
                        cuenta.verNumeroCuenta();
                        break;
                    case 6:
                        cuenta.verDigitosControl();
                        break;
                    case 7:

                        break;
                    case 8:
                        try {
                            peticion.movimiento();
                            cuenta.retirada(peticion.movimiento());
                            break;
                        } catch (SaldoExcepcion err) {
                            System.err.println(+err.error()+);
                            break;
                        }

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
