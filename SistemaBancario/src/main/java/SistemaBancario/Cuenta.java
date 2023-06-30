package SistemaBancario;

/**
 *
 * @author Lander Sanchez
 */
public class Cuenta {
    
    protected String nombre;
    protected String cedula;
    protected double saldo;

    public Cuenta(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.saldo = 0;
    }
    public Cuenta(double saldo) {
        this.saldo = saldo;
       
        }
    public void ingresar(double cantidad) {
        saldo += cantidad;
        System.out.println("Se ha ingresado $" + cantidad + " a la cuenta de " + nombre);
    }

    public void retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Se ha retirado $" + cantidad + " de la cuenta de " + nombre);
        } else {
            System.out.println("Saldo insuficiente en la cuenta de " + nombre);
        }
    }

    public void mostrarSaldo() {
        System.out.println("El saldo de la cuenta de " + nombre + " es: $" + saldo);
    }
}
