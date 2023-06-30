package SistemaBancario;
import java.util.Scanner;
/**
 *
 * @author Lander Sanchez
 */
public class SistemaBancario {

    public static void main(String[] args) {
     
   
        Scanner scanner = new Scanner(System.in);
        Cuenta cuenta1 = new Cuenta("Lander", "2350337636");
        CuentaLimitada cuenta2 = new CuentaLimitada("Joan", "1253977316", 500);

        int opcion;
        double cantidad;

        do {
             // Mostrar el menú de opciones
            System.out.println("----- MENU -----");
            System.out.println("1. Ingresar dinero a una cuenta");
            System.out.println("2. Retirar dinero de una cuenta");
            System.out.println("3. Mostrar saldo de una cuenta");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Opción 1: Ingresar dinero a una cuenta
                    System.out.print("Ingresa la cantidad a ingresar: ");
                    cantidad = scanner.nextDouble();
                    cuenta1.ingresar(cantidad);
                    break;
                case 2:
                    // Opción 2: Retirar dinero de una cuenta
                    System.out.print("Ingresa la cantidad a retirar: ");
                    cantidad = scanner.nextDouble();
                    cuenta1.retirar(cantidad);
                    break;
                case 3:
                    // Opción 3: Mostrar saldo de una cuenta
                    cuenta1.mostrarSaldo();
                    break;
                case 4:
                    // Opción 4: Salir del programa
                    System.out.println("¡Saliendo del programa...!");
                    break;
                default:
                    // Opción inválida4
                    System.out.println("Opcion invalida.");
                    break;
            }
        } while (opcion != 4);
    }
}