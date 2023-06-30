/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacion1_ls.lab_2_u2_poo_sanchez_lander;

import java.util.ArrayList;
import java.util.Scanner;
public class LAB_2_U2_POO_Sanchez_Lander     {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la cantidad de laboratorios a ingresar
        System.out.print("Ingrese la cantidad de laboratorios: ");
        int cantidadLaboratorios = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        ArrayList<Laboratorio> laboratorios = new ArrayList<>();

        // Llenar la información de cada laboratorio
        for (int i = 0; i < cantidadLaboratorios; i++) {
            System.out.println("Laboratorio #" + (i + 1));
            
            // Pedir el nombre del laboratorio
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            
             // Pedir la capacidad del laboratorio
            System.out.print("Capacidad: ");
            int capacidad = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            // Pedir la cantidad de equipos del laboratorio
            System.out.print("Ingrese la cantidad de equipos: ");
            int cantidadEquipos = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            ArrayList<String> equipos = new ArrayList<>();
            for (int j = 0; j < cantidadEquipos; j++) {
                // Pedir cada equipo del laboratorio
                System.out.print("Equipo #" + (j + 1) + ": ");
                String equipo = scanner.nextLine();
                equipos.add(equipo);
            }
            
            // Pedir el tipo de laboratorio
            System.out.println("Tipo de laboratorio (1 o 2): ");
            int tipoLaboratorio = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            if (tipoLaboratorio == 1) {
                // Si es tipo Laboratorio1, pedir el espacio del laboratorio
                System.out.print("Espacio: ");
                String espacio = scanner.nextLine();
                Laboratorio1 laboratorio = new Laboratorio1(nombre, capacidad, equipos, espacio);
                laboratorios.add(laboratorio);
            } else if (tipoLaboratorio == 2) {
                // Si es tipo Laboratorio2, pedir el lugar del laboratorio
                System.out.print("Lugar: ");
                String lugar = scanner.nextLine();
                Laboratorio2 laboratorio = new Laboratorio2(nombre, capacidad, equipos, lugar);
                laboratorios.add(laboratorio);
            }
        }

        
        
        // Pedir la cantidad de asignaturas a ingresar
        System.out.print("Ingrese la cantidad de asignaturas: ");
        int cantidadAsignaturas = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        ArrayList<Asignatura> asignaturas = new ArrayList<>();

        // Llenar la información de cada asignatura
        for (int i = 0; i < cantidadAsignaturas; i++) {
            System.out.println("Asignatura #" + (i + 1));
            
            // Pedir el nombre de la asignatura
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            
            // Pedir el horario de la asignatura
            System.out.print("Horario: ");
            String horario = scanner.nextLine();

            // Asignar laboratorio a la asignatura
            System.out.println("Laboratorios disponibles:");
            for (int j = 0; j < laboratorios.size(); j++) {
                System.out.println((j + 1) + ". " + laboratorios.get(j).getNombre());
            }
            System.out.print("Seleccione el número del laboratorio asignado: ");
            int numeroLaboratorio = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            Laboratorio laboratorio = laboratorios.get(numeroLaboratorio - 1);
            Asignatura asignatura = new Asignatura(nombre, horario, laboratorio);
            asignaturas.add(asignatura);
        }

        // Mostrar información de los laboratorios
        System.out.println("Informacion de los laboratorios:");
        for (Laboratorio laboratorio : laboratorios) {
            System.out.println("Nombre: " + laboratorio.getNombre());
            System.out.println("Capacidad: " + laboratorio.getCapacidad());
            System.out.println("Equipos: " + laboratorio.getEquipos());
            if (laboratorio instanceof Laboratorio1) {
                Laboratorio1 lab1 = (Laboratorio1) laboratorio;
                System.out.println("Espacio: " + lab1.getEspacio());
            } else if (laboratorio instanceof Laboratorio2) {
                Laboratorio2 lab2 = (Laboratorio2) laboratorio;
                System.out.println("Lugar: " + lab2.getLugar());
            }
            System.out.println();
        }

        
        
        // Mostrar información de las asignaturas
        System.out.println("Informacion de las asignaturas:");
        for (Asignatura asignatura : asignaturas) {
            System.out.println("Nombre: " + asignatura.getNombre());
            System.out.println("Horario: " + asignatura.getHorario());
            System.out.println("Laboratorio asignado: " + asignatura.getLaboratorio().getNombre());
            System.out.println();
        }
    }
}