// Clase principal CalculadoraAreas
package Calculadora;

//Lander Sanchez
	import java.util.Scanner;

	public class CalculadoraAreas {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Calculadora de areas y perimetros");
	        System.out.println("1. Cuadrado");
	        System.out.println("2. Triangulo");
	        System.out.println("3. Rectangulo");
	        System.out.println("4. Pentagono");
	        System.out.print("Elige una opcion: ");
	        int opcion = sc.nextInt();
	        
	        switch (opcion) {
	            case 1:
	                System.out.print("Ingresa el lado del cuadrado: ");
	                double ladoCuadrado = sc.nextDouble();
	                
	                Cuadrado cuadrado = new Cuadrado(ladoCuadrado);// Creación de un objeto Cuadrado
	                cuadrado.calcularArea();// Cálculo del área del cuadrado
	                cuadrado.calcularPerimetro();// Cálculo del perímetro del cuadrado
	                break;
	            case 2:
	                System.out.print("Ingresa la base del triangulo: ");
	                double baseTriangulo = sc.nextDouble();
	                
	                System.out.print("Ingresa la altura del triangulo: ");
	                double alturaTriangulo = sc.nextDouble();
	                
	                Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo);// Creación de un objeto Triangulo
	                triangulo.calcularArea();// Cálculo del área del triángulo
	                triangulo.calcularPerimetro(); // Cálculo del perímetro del triángulo
	                break;
	            case 3:
	                System.out.print("Ingresa la base del rectangulo: ");
	                double baseRectangulo = sc.nextDouble();
	                
	                System.out.print("Ingresa la altura del rectangulo: ");
	                double alturaRectangulo = sc.nextDouble();
	                
	                Rectangulo rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);// Creación de un objeto Rectangulo
	                rectangulo.calcularArea();// Cálculo del área del rectángulo
	                rectangulo.calcularPerimetro();// Cálculo del perímetro del rectángulo
	                break;
	            case 4:
	                System.out.print("Ingresa el lado del pentagono: ");
	                double ladoPentagono = sc.nextDouble();
	                
	                System.out.print("Ingresa la apotema del pentagono: ");
	                double apotemaPentagono = sc.nextDouble();
	                
	                Pentagono pentagono = new Pentagono(ladoPentagono, apotemaPentagono);// Creación de un objeto Pentagono
	                pentagono.calcularArea();// Cálculo del área del pentágono
	                pentagono.calcularPerimetro();// Cálculo del perímetro del pentágono
	                break;
	            default:
	                System.out.println("Opcion invalida");
	        }
	        
	        sc.close();
	    }
	}

