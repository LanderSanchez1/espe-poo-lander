package POO_P14_U2_INTERFACE;

public class Rectangulo implements Figura, Dibujar {
    double base, altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public void dibujar() {
        System.out.println("Vas a dibujar");
    }
}