package POO_P13_U2_Clase_Abstracta;

public abstract class Figura {
    double x;
    double y;
    public Figura (){
    }
    public Figura (double x,double y){
        this.x=x;
        this.y=y;
    }
    public abstract double calcularArea();
}