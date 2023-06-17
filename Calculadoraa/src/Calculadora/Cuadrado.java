package Calculadora;
import java.util.Scanner;

//Lander Sanchez
class Cuadrado extends Figura {
    private double lado;// Lado del cuadrado
 // Constructor de Cuadrado que recibe el lado como parámetro
    public Cuadrado(double lado) {
        this.lado = lado;
    }
    // Implementación del método calcularArea() para Cuadrado
    @Override
    public void calcularArea() {
        double area = lado * lado;// Cálculo del área del cuadrado
        System.out.println("El area del cuadrado es: " + area);
    }
 // Implementación del método calcularPerimetro() para Cuadrado
    @Override
    public void calcularPerimetro() {
        double perimetro = 4 * lado;// Cálculo del perímetro del cuadrado
        System.out.println("El perimetro del cuadrado es: " + perimetro);
    }
}

