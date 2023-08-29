
package FigurasGeometricas;
import java.util.Scanner;
/**
 *
 * @author Lander Sanchez
 */
public class Triangulo extends Figura{
    //Definicion de variables y objetos
    Scanner in = new Scanner(System.in);
    float base,altura,a,b;
    int opc;
    
    //Constructor para inicializar las variables
    public Triangulo(float base, float altura, float a, float b){
        this.altura=altura;
        this.base=base;
        this.a=a;
        this.b=b;
    }
    //Menu
    public void menuTriangulo(){
        do{
            System.out.println("==TRIANGULO==");
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
        System.out.println("El area del triangulo es: "+(base*altura/2)+"cm2");
    }
    @Override
    public void perimetro(){
        System.out.println("El perimetro del triangulo es: "+(base+a+b)+"cm");
    }
}