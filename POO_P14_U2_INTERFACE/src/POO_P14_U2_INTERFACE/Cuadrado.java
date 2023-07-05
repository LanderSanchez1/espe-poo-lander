package POO_P14_U2_INTERFACE;

public class Cuadrado implements Figura, Dibujar{
    double lado;

    public Cuadrado(double lado) {
        this.lado=lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Vas a dibujar");
    }
}