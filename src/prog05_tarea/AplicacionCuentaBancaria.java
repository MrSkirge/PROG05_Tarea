package prog05_tarea;

import java.util.*;

/**
 *
 * @author Luis Calvo Martin
 * @class AplicacionCuentaBancaria
 */
public class AplicacionCuentaBancaria {

    static Pantalla salida;
    static CuentaBancaria cuenta;

    public static void main(String[] args) throws MiExcepcion  {
        int opcion = 0;
        Scanner input = new Scanner(System.in);

        salida = new Pantalla();
        cuenta = new CuentaBancaria(salida.pedirTitular(), salida.pedirCuenta());

        while (opcion != 10) {
            try {
                salida.menu();
                opcion = input.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Código Cuenta Cliente:   ");
                        salida.pantallaString(cuenta.verCCC());
                        break;
                    case 2:
                        salida.pantallaString(cuenta.getTitular());
                        break;
                    case 3:
                        salida.pantallaString(cuenta.verCodigoEntidad());
                        break;
                    case 4:
                        salida.pantallaString(cuenta.verCodigoOficina());
                        break;
                    case 5:
                        salida.pantallaString(cuenta.verNumeroCuenta());
                        break;
                    case 6:
                        salida.pantallaString(cuenta.verDigitosControl());
                        break;
                    case 7:

                        cuenta.ingreso(salida.movimiento());
                        break;
                    case 8:
                        try {
                            cuenta.retirada(salida.movimiento());
                            break;
                        } catch (MiExcepcion err) {
                            System.err.println(MiExcepcion.errorSaldo());

                        }

                        break;
                    case 9:
                        System.out.println("Saldo disponible: " + cuenta.getSaldo() + "€");
                        break;
                    case 10:

                        break;
                    default:
                        System.err.println("ERROR: Introduzca un dígito del 0 - 9");

                        break;

                }
                //Llamo al método pulsa, que hace que el programa continue al pulsar enter
                salida.pulsa();
                

            } catch (InputMismatchException e) {
                System.err.println("\nERROR: Introduzca un dígito del 1 - 10\n");
                input.next();
                salida.pulsa();

            }

        }

    }
}
