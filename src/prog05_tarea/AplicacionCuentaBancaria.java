package prog05_tarea;

/**
 *
 * @author Luis Calvo Martin
 * @class AplicacionCuentaBancaria
 */
public class AplicacionCuentaBancaria {

    static Pantalla pide;
    static CuentaBancaria cuenta;
    
    public static void main(String[] args) {

        pide = new Pantalla();
        cuenta = new CuentaBancaria();
        
        pide.pedirTitular();
        pide.pedirCuenta();

        
        
    }

}
