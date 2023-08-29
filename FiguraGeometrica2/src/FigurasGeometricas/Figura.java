package FigurasGeometricas;
/**
 *
 * @author Lander Sanchez
 */
public class Figura {
    float lado;
    //Metodos de la clase padre
    public void area(){
        System.out.println("El area de la figura es: "+(lado*lado));
    }
    public void perimetro(){
        System.out.println("El perimetro de la figura es: "+(lado*4));
    }
}
