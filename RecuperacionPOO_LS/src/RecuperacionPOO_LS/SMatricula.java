package RecuperacionPOO_LS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SMatricula {
    private List<Profesor> profesores = new ArrayList<>();
    private List<Alumno> alumnos = new ArrayList<>();
    private List<Materia> materias = new ArrayList<>();
    private List<Matricula> matriculas = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void iniciarSistema() {
        int opcion;

        do {
            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Profesores");
            System.out.println("2. Alumnos");
            System.out.println("3. Materias");
            System.out.println("4. Gestión de Matrículas");
            System.out.println("5. Total Matriculados");
            System.out.println("6. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ingresarProfesores(); // Llama al método para ingresar profesores
                    break;
                case 2:
                    ingresarAlumnos(); // Llama al método para ingresar alumnos 
                    break;
                case 3:
                    ingresarMaterias(); // Llama al método para ingresar materias 
                    break;
                case 4:
                    gestionarMatriculas(); // Llama al método para ingresar matriculas 
                    break;
                case 5:
                    mostrarTotalMatriculados(); // Llama al método para mostrar el total de matriculados 
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente otra vez.");
                    break;
            }
        } while (opcion != 6);
    }

    private void mostrarTotalMatriculados() {
		// TODO Auto-generated method stub
		
	}

	private void gestionarMatriculas() {
		// TODO Auto-generated method stub
		
	}

	private void ingresarMaterias() {
		// TODO Auto-generated method stub
		
	}

	private void ingresarAlumnos() {
		// TODO Auto-generated method stub
		
	}

	public void ingresarProfesores() {
        System.out.println("\n===== Ingreso de Profesores =====");
        for (int i = 0; i < 2; i++) {
                System.out.println("Ingrese los datos del Profesor " + (i + 1) + ":");
                scanner.nextLine(); 
                System.out.print("ID: ");
                String cedula = scanner.nextLine();
                System.out.print("Nombre: ");
                String nombre = scanner.nextLine();
                System.out.print("Dirección: ");
                String direccion = scanner.nextLine();
                System.out.print("Teléfono: ");
                String telefono = scanner.nextLine();
                System.out.print("Celular: ");
                String celular = scanner.nextLine();

                Profesor profesor = new Profesor(cedula, nombre, direccion, telefono, celular);
                profesores.add(profesor);
            }
            System.out.println("Profesores ingresados con exito.");
    }
}