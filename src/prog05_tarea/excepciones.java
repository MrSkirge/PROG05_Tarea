/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog05_tarea;

/**
 *
 * @author UsuarioUsal
 */
public class MyException extends Exception {

    //Construcor
    public MyException() {
    }

    //Excepción error CCC
    public String excErrorCCC() {
        
        String error = "Error, CCC no válido";
        return error;
    }

    public double excSaldoInsufieciente(){
        String error = "Error, saldo insuficiente";
        return error;
    }
}
