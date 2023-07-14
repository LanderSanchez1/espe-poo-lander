package poo_u2_p16_polimorfismo;
import java.util.Scanner;
public class POO_U2_P16_POLIMORFISMO {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int opcion;
                
                
        do {
            System.out.println("----- Menu de Figuras -----");
            System.out.println("1. Mostrar Triangulo");
            System.out.println("2. Mostrar Circulo");
            System.out.println("3. Mostrar Rectangulo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    mostrarDatosFiguras(new Triangulo(4, 5, "amarillo"));
                    break;
                case 2:
                    mostrarDatosFiguras(new Circulo(5, "verde"));
                    break;
                case 3:
                    mostrarDatosFiguras(new Rectangulo(4, 6, "rojo"));
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor, seleccione una opcion valida.");
                    break;
            }
            
            System.out.println();
        } while (opcion != 0);
        
        scanner.close();
    }
    
    private static void mostrarDatosFiguras(Figura f) {
        System.out.println("Color: " + f.getColor());
        System.out.println("Superficie: " + f.superficie());
    }
}