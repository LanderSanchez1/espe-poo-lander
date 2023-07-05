package POO_P14_U2_INTERFACE;

public class POO_P14_U2_INTERFACE {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Cuadrado cuadrado = new Cuadrado(4);
        Rectangulo rectangulo = new Rectangulo(3, 6);

        System.out.println("Area del circulo: " + circulo.calcularArea());
        System.out.println("Area del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Area del rectangulo: " + rectangulo.calcularArea());

        circulo.dibujar();
        cuadrado.dibujar();
        rectangulo.dibujar();
    }
}