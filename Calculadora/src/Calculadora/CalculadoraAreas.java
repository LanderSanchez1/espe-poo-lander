package Calculadora;


	import java.util.Scanner;

	public class CalculadoraAreas {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Calculadora de areas");
	        System.out.println("1. Cuadrado");
	        System.out.println("2. Triangulo");
	        System.out.println("3. Rectangulo");
	        System.out.println("4. Pentagono");
	        System.out.print("Elige una opcion: ");
	        int opcion = sc.nextInt();
	        
	        switch (opcion) {
	            case 1:
	                Cuadrado cuadrado = new Cuadrado();
	                cuadrado.calcularArea();
	                break;
	            case 2:
	                Triangulo triangulo = new Triangulo();
	                triangulo.calcularArea();
	                break;
	            case 3:
	                Rectangulo rectangulo = new Rectangulo();
	                rectangulo.calcularArea();
	                break;
	            case 4:
	                Pentagono pentagono = new Pentagono();
	                pentagono.calcularArea();
	                break;
	            default:
	                System.out.println("Opcion invalida");
	        }
	        
	        sc.close();
	    }
	}

