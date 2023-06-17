package Calculadora;
import java.util.Scanner;

//Lander Sanchez
class Triangulo extends Figura {
    private double base;// Base del triángulo
    private double altura;// Altura del triángulo
    
 // Constructor de Triangulo que recibe la base y la altura como parámetros
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
 // Implementación del método calcularArea() para Triangulo
    @Override
    public void calcularArea() {
        double area = (base * altura) / 2;// Cálculo del área del triángulo
        System.out.println("El area del triangulo es: " + area);
    }
 // Implementación del método calcularPerimetro() para Triangulo
    @Override
    public void calcularPerimetro() {
        // Cálculo del perímetro del triángulo
        double lado1 = base;
        double lado2 = Math.sqrt((base/2)*(base/2) + altura*altura);
        double perimetro = base + (2 * lado2);
        System.out.println("El perimetro del triangulo es: " + perimetro);
    }
}

