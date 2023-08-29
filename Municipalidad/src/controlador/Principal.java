package controlador;
import Modelo.Administrativos;
import Modelo.Cobranzas;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        LoginControlador.mostrar();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los datos del Alcalde:");
        System.out.print("Nombre: ");
        String nombreAlcalde = leer.nextLine();
        System.out.print("Partido Politico: ");
        String partidoPolitico = leer.nextLine();
        System.out.print("Años en Cargo: ");
        int anosEnCargo = leer.nextInt();
        System.out.print("Salario: ");
        double salario = leer.nextDouble();
        leer.nextLine(); // Consumir el salto de línea después de leer el double
        Cobranzas cobranzas;
        System.out.println("\nIngrese los datos de Cobranzas:");
        System.out.print("Ingresos: ");
        double ingresos = leer.nextDouble();
        System.out.print("Egresos: ");
        double egresos = leer.nextDouble();
        leer.nextLine(); // Consumir el salto de línea después de leer el double
        cobranzas = new Cobranzas(nombreAlcalde, partidoPolitico, anosEnCargo, salario, ingresos, egresos);
        System.out.println("\nIngrese los datos del Area Administrativa:");
        System.out.print("Nombre del Encargado: ");
        String nombreEncargado = leer.nextLine();
        System.out.print("Edad del Encargado: ");
        int edadEncargado = leer.nextInt();
        leer.nextLine(); // Consumir el salto de línea después de leer el int
        System.out.print("Area Encargada: ");
        String areaEncargada = leer.nextLine();
        Administrativos administrativo = new Administrativos(nombreAlcalde, partidoPolitico, anosEnCargo, salario, nombreEncargado, edadEncargado, areaEncargada);

        leer.close(); // Cerrar el Scanner

        // Mostramos los datos ingresados
        System.out.println("\nDatos del Alcalde:");
        System.out.println("Nombre: " + cobranzas.getNombreAlcalde());
        System.out.println("Partido Político: " + cobranzas.getPartidoPolitico());
        System.out.println("Años en Cargo: " + cobranzas.getAnosEnCargo());
        System.out.println("Salario: " + cobranzas.getSalario());

        System.out.println("\nRegistro de Cobranzas:");
        System.out.println("Ingresos: " + cobranzas.getIngresos());
        System.out.println("Egresos: " + cobranzas.getEgresos());
        System.out.println("Balance: " + cobranzas.calcularBalance());

        System.out.println("\nDatos del Area Administrativa:");
        System.out.println("Nombre: " + administrativo.getNombre());
        System.out.println("Edad: " + administrativo.getEdad());
        System.out.println("Area Encargada: " + administrativo.getAreaEncargada());
    }
}

  