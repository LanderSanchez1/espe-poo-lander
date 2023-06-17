package Calculadora;
import java.util.Scanner;

//Lander Sanchez
class Rectangulo extends Figura {
    private double base;// Clase Rectangulo que hereda de Figura
    private double altura;// Altura del rectángulo
    
 // Constructor de Rectangulo que recibe la base y la altura como parámetros
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
 // Implementación del método calcularArea() para Rectangulo
    @Override
    public void calcularArea() {
        double area = base * altura;// Cálculo del área del rectángulo
        System.out.println("El area del rectangulo es: " + area);
    }
 // Implementación del método calcularPerimetro() para Rectangulo
    @Override
    public void calcularPerimetro() {
        double perimetro = 2 * (base + altura);// Cálculo del perímetro del rectángulo
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    }
}