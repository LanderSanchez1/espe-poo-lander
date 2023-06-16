package Calculadora;
import java.util.Scanner;

public class Triangulo {
	
	    private double base;
	    private double altura;
	    
	    public void calcularArea() {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Ingresa la base del triangulo: ");
	        base = sc.nextDouble();
	        
	        System.out.print("Ingresa la altura del triangulo: ");
	        altura = sc.nextDouble();
	        
	        double area = (base * altura) / 2;
	        System.out.println("El area del triangulo es: " + area);
	        
	        sc.close();
	    }
	}

