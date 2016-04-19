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

    private String titular;
    private String cuenta;
    private double saldo = 0;
    private boolean control;


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

        oficina = this.cuenta.substring(0, 4);

        return oficina;
    }

    public String verNumeroCuenta() {
        String numerocuenta;

        numerocuenta = this.cuenta.substring(0, 4);

        return numerocuenta;

    }

    public String verDigitosControl() {
        String digitoscontrol = this.cuenta.substring(8, 10);
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

    public void retirada(double retirada) throws SaldoExcepcion {

        if (this.saldo < retirada) {
            throw new SaldoExcepcion();
        } else {
            this.saldo = this.saldo - retirada;
        }
    }
}
