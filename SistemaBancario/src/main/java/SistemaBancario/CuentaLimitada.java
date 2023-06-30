package SistemaBancario;

/**
 *
 * @author Lander Sanchez
 */
    public class CuentaLimitada extends Cuenta {
    private double limite;

    public CuentaLimitada(String nombre, String cedula, double limite) {
        super(nombre, cedula);
        this.limite = limite;
    }

    @Override
    public void retirar(double cantidad) {
        if (saldo + limite >= cantidad) {
            saldo -= cantidad;
            System.out.println("Se ha retirado $" + cantidad + " de la cuenta de " + nombre);
        } else {
            System.out.println("Saldo insuficiente en la cuenta de " + nombre);
        }
    }
    
        }
    



