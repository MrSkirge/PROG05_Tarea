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
    private double saldo;
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
    
    public String verCuenta() {
    String cuenta;
    cuenta = "El número de cuenta es: ";
    cuenta += this.cuenta.substring(0, 4)+"-";
    cuenta += this.cuenta.substring(4, 8)+"-";
    cuenta += this.cuenta.substring(8-10)+"-";
    cuenta += this.cuenta.substring(10, 20);
    return cuenta;
  }
}
