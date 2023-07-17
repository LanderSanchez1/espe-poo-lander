package TAREA2_U2_POO_SANCHEZ_LANDER;
import java.util.Date;
import java.util.Scanner;
public class TAREA2_U2_POO_SANCHEZ_LANDER {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos del empleado:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Fecha de ingreso (dd/mm/aaaa): ");
        String fechaIngresoStr = scanner.nextLine();
        System.out.print("Salario anual: ");
        double salario = scanner.nextDouble();

        Date fechaIngreso = parseFecha(fechaIngresoStr);

        System.out.print("¿Es director o operario? (D/O): ");
        String tipoEmpleado = scanner.next();

        Empleado empleado;

        if (tipoEmpleado.equalsIgnoreCase("D")) {
            System.out.print("Departamento: ");
            String departamento = scanner.next();
            System.out.print("Numero de personas a cargo: ");
            int personal = scanner.nextInt();
            empleado = new Director(nombre, edad, fechaIngreso, salario, departamento, personal);
        } else if (tipoEmpleado.equalsIgnoreCase("O")) {
            System.out.print("Nivel de seguridad (1-5): ");
            int nivel = scanner.nextInt();
            empleado = new Operario(nombre, edad, fechaIngreso, salario, nivel);
        } else {
            System.out.println("Tipo de empleado no valido.");
            return;
        }

        empleado.incentivar();

        System.out.println("El nuevo salario del empleado " + empleado.getNombre() + " es: " + empleado.getSalario());
    }

    // Método para convertir una cadena de fecha en formato "dd/mm/aaaa" en una instancia de la clase Date
    private static Date parseFecha(String fechaStr) {
        String[] partes = fechaStr.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]) - 1; 
        int anio = Integer.parseInt(partes[2]) - 1900; 

        return new Date(anio, mes, dia);
    }
}