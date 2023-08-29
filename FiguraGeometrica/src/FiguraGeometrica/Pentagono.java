package FiguraGeometrica;
import java.util.Scanner;
/**
 *
 * @author Lander Sanchez
 */
public class Pentagono {
    float apotema,A;
    int opc;
    Scanner in=new Scanner(System.in);
    public Pentagono(float apotema, float A){
        this.apotema=apotema;
        this.A=A;
    }
    
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
    
    public void area(){
        System.out.println("El area del pentagono es: "+((5*A*apotema)/2));
    }    
    public void perimetro(){
        System.out.println("El perimetro del rectangulo es: "+(A*5));
    }
}