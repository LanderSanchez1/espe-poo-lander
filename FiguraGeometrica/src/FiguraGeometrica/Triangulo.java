/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FiguraGeometrica;
import java.util.Scanner;
/**
 *
 * @author Lander Sanchez
 */
public class Triangulo {
    Scanner in = new Scanner(System.in);
    float base,altura,a,b;
    int opc;
    public Triangulo(float base, float altura, float a, float b){
        this.altura=altura;
        this.base=base;
        this.a=a;
        this.b=b;
    }
    
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
    public void area(){
        System.out.println("El area del triangulo es: "+(base*altura/2)+"cm2");
    }
    public void perimetro(){
        System.out.println("El perimetro del triangulo es: "+(base+a+b)+"cm");
    }
}
