package Calculadora;
import java.util.Scanner;

public class Pentagono {
	
	    private double lado;
	    private double apotema;
	    
	    public void calcularArea() {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Ingresa el lado del pentagono: ");
	        lado = sc.nextDouble();
	        
	        System.out.print("Ingresa la apotema del pentagono: ");
	        apotema = sc.nextDouble();
	        
	        double area = (5 * lado * apotema) / 2;
	        System.out.println("El area del pentagono es: " + area);
	        
	        sc.close();
	    }
	}

