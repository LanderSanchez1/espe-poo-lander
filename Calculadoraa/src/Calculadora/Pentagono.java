package Calculadora;
import java.util.Scanner;

//Lander Sanchez
class Pentagono extends Figura {
    private double lado;// Lado del pentágono
    private double apotema;// Apotema del pentágono
    
 // Constructor de Pentagono que recibe el lado y la apotema como parámetros
    public Pentagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }
    // Implementación del método calcularArea() para Pentagono
    @Override
    public void calcularArea() {
        double area = (5 * lado * apotema) / 2;// Cálculo del área del pentágono
        System.out.println("El area del pentagono es: " + area);
    }
 // Implementación del método calcularPerimetro() para Pentagono
    @Override
    public void calcularPerimetro() {
        double perimetro = 5 * lado;// Cálculo del perímetro del pentágono
        System.out.println("El perimetro del pentagono es: " + perimetro);
    }
}

