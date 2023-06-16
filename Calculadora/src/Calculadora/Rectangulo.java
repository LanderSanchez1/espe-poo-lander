package Calculadora;
import java.util.Scanner;

public class Rectangulo {
	
	    private double base;
	    private double altura;
	    
	    public void calcularArea() {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Ingresa la base del rectangulo: ");
	        base = sc.nextDouble();
	        
	        System.out.print("Ingresa la altura del rectangulo: ");
	        altura = sc.nextDouble();
	        
	        double area = base * altura;
	        System.out.println("El area del rectangulo es: " + area);
	        
	        sc.close();
	    }
	}

