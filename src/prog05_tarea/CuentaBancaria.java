/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog05_tarea;

/**
 *
 * @author Luis Calvo Martin
 */
public class CuentaBancaria {

    private static String titular;
    private static String cuenta;
    private double saldo = 0;


    /* Constructor para el set de las variables titular y codigo cuenta
     / @Param titular es titular cuenta
     / @cuenta es el CCC
     / Los dos los introducimos por pantalla en la clase pantalla
     */
    public CuentaBancaria(String titular, String cuenta) {

        this.titular = titular;
        this.cuenta = cuenta;
    }

    //Métodos get para obtener tanto el nombre del titular como el numero de 
    //cuenta
    public String getTitular() {
        return titular;

    }

    public String getCuenta() {
        return cuenta;
    }

    /*Esta es otra opcion que he barajado para mostrar la cuenta
    /* public String verCCCC() {
        String cuenta;
        cuenta = "El número de cuenta es: ";
        cuenta += this.cuenta.substring(0,4) + "-";
        cuenta += this.cuenta.substring(4,8) + "-";
        cuenta += this.cuenta.substring(8,10) + "-";
        cuenta += this.cuenta.substring(10,20);
        return cuenta;
    }
     */
    public String verCodigoEntidad() {
        String entidad;

        entidad = this.cuenta.substring(0, 4);

        return entidad;
    }

    public String verCodigoOficina() {
        String oficina;

        oficina = this.cuenta.substring(4, 8);

        return oficina;
    }

    public String verNumeroCuenta() {
        String numerocuenta;

        numerocuenta = this.cuenta.substring(10, 20);

        return numerocuenta;

    }

    /*public String verDigitosControl() {
        String digitosirol = this.cuenta.substring(8, 10);
        return digitosirol;
    }*/
    public String verDigitosControl() {
        String digitoscontrol = CuentaBancaria.obtenerDigitosControl();
        return digitoscontrol;
    }

    public String verCCC() {
        String ccc = "";
        ccc = this.verCodigoEntidad() + "-" + this.verCodigoOficina() + "-" + this.verDigitosControl() + "-" + this.verNumeroCuenta();
        return ccc;
    }

    public void ingreso(double dinero) {

        this.saldo = this.saldo + dinero;

    }

    public void retirada(double retirada) throws MiExcepcion {

        if (retirada > this.saldo) {
            throw new MiExcepcion();
        } else {
            this.saldo = this.saldo - retirada;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public static int digitosControl() {
        // Inicializo las variables para las operaciones
        int c1 = 0;
        int c2 = 0;
        int control1 = 0;
        int control2 = 0;
        int control;

        int i;
        // Guardamos en un array los multiplicadores
        int[] multiplicadores = {1, 2, 4, 8, 5, 10, 9, 7, 3, 6};
        // Sumamos cada dígito de entidad y oficina (c1), 
        // por la misma posición del array multiplicadores
        //Como las dos primeras posiciones en una cuenta son siempre 00, salto 
        //las dos primersas del multiplicador
        for (i = 0; i < 8; i++) {
            c1 += multiplicadores[i + 2] * Integer.parseInt(cuenta.substring(i, i + 1));
        }
        // Sumamos cada digito del nº cta. por 
        // la misma posición del array multiplicadores
        for (i = 0; i < 10; i++) {
            c2 = c2 + multiplicadores[i] * Integer.parseInt(cuenta.substring(i + 10, i + 10 + 1));
        }
        // Restamos a 11 el resto de la división entre el valor obtenido y el número 11
        c1 = 11 - (c1 % 11);
        c2 = 11 - (c2 % 11);

        if (c1 == 10) {
            control1 = 1;
        } else {
            control1 = c1;
        }

        if (c2 == 10) {
            control2 = 1;
        } else {
            control2 = c2;

            control = Integer.parseInt(String.valueOf(control1)
                    + String.valueOf(control2));
            return control;
        }
