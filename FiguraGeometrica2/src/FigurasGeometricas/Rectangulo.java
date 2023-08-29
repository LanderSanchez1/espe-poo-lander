/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FigurasGeometricas;
import java.util.Scanner;
/**
 *
 * @author Lander Sanchez
 */
public class Rectangulo extends Figura{
    //Definicion de variables y objetos
    float A,B;
    int opc;
    Scanner in=new Scanner(System.in);
    //Constructor para inicializar las variables
    public Rectangulo(float A, float B){
        this.A=A;
        this.B=B;
    }
    //Menu
    public void menuRectangulo(){
        do{
            System.out.println("==RECTANGULO==");
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
        System.out.println("El area del rectangulo es: "+(A*B));
    }    
    @Override
    public void perimetro(){
        System.out.println("El perimetro del rectangulo es: "+(A*2+B*2));
    }
}
