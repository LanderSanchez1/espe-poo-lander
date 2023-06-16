package Calculadora;
import java.util.Scanner;

public class Cuadrado {
	
	    private double lado;
	    
	    public void calcularArea() {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Ingresa el lado del cuadrado: ");
	        lado = sc.nextDouble();
	        
	        double area = lado * lado;
	        System.out.println("El area del cuadrado es: " + area);
	        
	        sc.close();
	    }
	}

