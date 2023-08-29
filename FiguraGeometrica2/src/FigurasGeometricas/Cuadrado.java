package FigurasGeometricas;
import java.util.Scanner;
/**
 *
 * @author Lander Sanchez
 */
public class Cuadrado extends Figura{
    //Definicion de variables y objetos
    Scanner in =  new Scanner(System.in);
    float lado;
    
    //Constructor para inicializar las variables
    public Cuadrado(float lado){
        this.lado=lado;
    }
    int opc;
    
    //Menu
    public void menuCuadrado(int num){
        do{
            System.out.println("==CUADRADO "+num+"==");
            System.out.println("1. Calcular area");
            System.out.println("2. Calcular perimetro");
            System.out.println("3. Salir");
            opc=in.nextInt();
            in.nextLine();
            switch(opc){
                case 1:
                    area();
                    break;
                case 2:
                    perimetro();
                    break;
            }            
        }while(opc!=3);

    }
    //Redifinicion de los metodos heredados de Figura
    @Override
    public void area(){
        System.out.println("El area del cuadrado es: "+(lado*lado)+"cm");
    }
    @Override
    public void perimetro(){
        System.out.println("El perimetro del cuadrado es "+(lado*4)+"cm");
    }
}