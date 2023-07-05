package POO_P13_U2_Clase_Abstracta;

public class Circulo extends Figura{
    double r, pi=3.1416;
    public Circulo(){
    }
    public Circulo(double r, double x, double y){
        super(x,y);
        this.r=r;
    }
    @Override
    public double calcularArea() {
        return pi*r*r;
    }
}