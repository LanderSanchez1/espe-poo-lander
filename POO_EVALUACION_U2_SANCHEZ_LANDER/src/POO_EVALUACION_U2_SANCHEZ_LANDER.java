import java.util.Scanner;
public class POO_EVALUACION_U2_SANCHEZ_LANDER {
		Scanner scanner =new Scanner (System.in);
		
			public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Bienvenido al Sistema Administrativo de Personal");

		        while (true) {
		            System.out.println("\n----------- Menu ------------");
		            System.out.println("1. Pagar salario a Docente");
		            System.out.println("2. Pagar salario a Tecnico");
		            System.out.println("3. Pagar salario a Administrativo");
		            System.out.println("3. Pagar salario a Limpieza");
		            System.out.println("4. Salir");
		            System.out.print("Ingrese una opcion: ");

		            int opcion = scanner.nextInt();
		            scanner.nextLine(); 

		            switch (opcion) {
		                case 1:
		                    pagarDocente(scanner);
		                    break;
		                case 2:
		                    pagarTecnico(scanner);
		                    break;
		                case 3:
		                    pagarAdministrativo(scanner);
		                    break;
		             
		                case 4:
		                    System.out.println("Saliendo del programa.");
		                    scanner.close();
		                    return;
		                default:
		                    System.out.println("Opcion invalida. Por favor, elija una opcion valida del menu.");
		            }
		        }
		    }
		    public static void pagarDocente(Scanner scanner) {
		        System.out.print("Ingrese el nombre del docente: ");
		        String nombre = scanner.nextLine();
		        System.out.print("Ingrese la edad del docente: ");
		        int edad = scanner.nextInt();
		        scanner.nextLine(); 
		        System.out.print("Ingrese el puesto del docente: ");
		        String puesto = scanner.nextLine();
		        System.out.print("Ingrese el salario base del docente: ");
		        double salarioBase = scanner.nextDouble();
		        System.out.print("Ingrese el sueldo por hora del docente: ");
		        double sueldoHora = scanner.nextDouble();

		        Docente docente = new Docente(nombre, edad, puesto, salarioBase, sueldoHora);

		        System.out.print("Ingrese las horas trabajadas del docente: ");
		        double horasTrabajadas = scanner.nextDouble();

		        System.out.println("El salario a pagar al docente es: " + docente.pagar());
		        System.out.println("La comision del docente es: " + docente.calcularComision(horasTrabajadas));
		    }

		    public static void pagarTecnico(Scanner scanner) {
		        System.out.print("Ingrese el nombre del tecnico: ");
		        String nombre = scanner.nextLine();
		        System.out.print("Ingrese la edad del tecnico: ");
		        int edad = scanner.nextInt();
		        scanner.nextLine(); 
		        System.out.print("Ingrese el puesto del tecnico: ");
		        String puesto = scanner.nextLine();
		        System.out.print("Ingrese el salario base del tecnico: ");
		        double salarioBase = scanner.nextDouble();
		        System.out.print("Ingrese el sueldo por hora del tecnico: ");
		        double sueldoHoraTecnico = scanner.nextDouble();

		        Tecnico tecnico = new Tecnico(nombre, edad, puesto, salarioBase, sueldoHoraTecnico);

		        System.out.print("Ingrese las horas trabajadas del tecnico: ");
		        double horasTrabajadas = scanner.nextDouble();

		        System.out.println("El salario a pagar al tecnico es: " + tecnico.pagar());
		        System.out.println("La comisión del tecnico es: " + tecnico.calcularComision(horasTrabajadas));
		    }
		    public static void pagarAdministrativo(Scanner scanner) {
		        System.out.print("Ingrese el nombre del administrativo: ");
		        String nombre = scanner.nextLine();
		        System.out.print("Ingrese la edad del administrativo: ");
		        int edad = scanner.nextInt();
		        scanner.nextLine(); 
		        System.out.print("Ingrese el puesto del administrativo: ");
		        String puesto = scanner.nextLine();
		        System.out.print("Ingrese el salario base del administrativo: ");
		        double salarioBase = scanner.nextDouble();
		        System.out.print("Ingrese las horas extra del administrativo: ");
		        double horasExtra = scanner.nextDouble();

		        Administrativo administrativo = new Administrativo(nombre, edad, puesto, salarioBase, horasExtra);

		        System.out.print("Ingrese las horas trabajadas del administrativo: ");
		        double horasTrabajadas = scanner.nextDouble();

		        System.out.println("El salario a pagar al administrativo es: " + administrativo.pagar());
		        System.out.println("La comision del administrativo es: " + administrativo.calcularComision(horasTrabajadas));
		    }
		    
	}

