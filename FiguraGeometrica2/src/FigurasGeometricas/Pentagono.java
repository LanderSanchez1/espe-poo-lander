package FigurasGeometricas;
import java.util.Scanner;
/**
 *
 * @author Lander Sanchez
 */
public class Pentagono extends Figura{
    //Definicion de variables y objetos
    float apotema,A;
    int opc;
    Scanner in=new Scanner(System.in);
    
    //Constructor para inicializar las variables
    public Pentagono(float apotema, float A){
        this.apotema=apotema;
        this.A=A;
    }
    //Menu
    public void menuPentagono(){
        do{
            System.out.println("==PENTAGONO==");
            System.out.println("1. Calcular el area");
            System.out.println("2. Calcular el perimetro");
            System.out.println("3. Salir");
        
            opc = in.nextInt();
            in.nextLine();
            switch(opc){
                case 1:
                    area();
                    break;
                case 2:
                    perimetro();
                    break;
                case 3:
                    break;
            }
        }while(opc!=3);
    }
    //Redifinicion de los metodos heredados de Figura
    @Override
    public void area(){
        System.out.println("El area del pentagono es: "+((5*A*apotema)/2));
    }    
    @Override
    public void perimetro(){
        System.out.println("El perimetro del rectangulo es: "+(A*5));
    }
}