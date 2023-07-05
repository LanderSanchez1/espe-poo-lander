package POO_P13_U2_Clase_Abstracta;

public class Cuadrado extends Figura{
    double lado;
    public Cuadrado(){
    }

    public Cuadrado(double lado, double x, double y) {
        super(x, y);
        this.lado=lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }
}
