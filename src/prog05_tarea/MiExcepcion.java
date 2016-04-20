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
class MiExcepcion extends Exception {

    public static String errorSaldo()
            {
            String error = "Error, saldo insuficiente";
            return error;
    
}
    
      public static String errorCCC()
            {
            String error = "Error, número CCC incorrecto, revise";
            return error; 

}
}


