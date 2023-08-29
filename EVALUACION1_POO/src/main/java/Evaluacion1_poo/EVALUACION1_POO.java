package Evaluacion1_poo;


/**
 *
 * @author Lander Sanchez
 */

import java.util.Scanner;

public class EVALUACION1_POO {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int selec = 0;
        Notas nota1 = new Notas();

        while (selec != 4) {
            System.out.println("===Escoja una opcion====");
            System.out.println("1: Agregar nota");
            System.out.println("2: Ver nota media");
            System.out.println("3: Ver aprobados o reprobados");
            System.out.println("4: Salir");
            System.out.println("==============================");
            selec = teclado.nextInt();

            switch (selec) {
                case 1:
                    teclado.nextLine(); // Limpiar el buffer del scanner
                    nota1.getNombre(); //pedir nombre
                    nota1.getApellido(); //pedir apellido
                    nota1.getNotas(); //registro de notas
                    break;
                case 2:
                    nota1.getProm(); //promedio de las notas registradas
                    break;
                case 3:
                    nota1.getAprob(); //Si aprobo o Reprobo su promedio debe ser mayor a 14 para aprobar
                    break;
                case 4:
                    System.out.println("Gracias por usar el programa.");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
    }
}
