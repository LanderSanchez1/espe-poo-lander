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
public class Menu {
    Scanner in = new Scanner(System.in);
    int opc;
    float lado1,lado2,lado3,lado4;
    public void menu(){
        do{
            System.out.println("==MENU FIGURAS GEOMETRICAS==");
            System.out.println("1. Cuadrado");
            System.out.println("2. Triangulo");
            System.out.println("3. Rectangulo");
            System.out.println("4. Pentagono");
            System.out.println("5. Salir");
            opc=in.nextInt();
            in.nextLine();
            switch(opc){
                case 1:
                    cuadrado();
                    break;
                case 2:
                    triangulo();
                    break;
                case 3:
                    rectangulo();
                    break;
                case 4:
                    pentagono();
                    break;
            }
        }while(opc!=5);
        
    }
    public void cuadrado(){
        System.out.println("Ingresa la longitud en cm del cuadrado: ");
        lado1=in.nextFloat();
        Cuadrado cuadrado = new Cuadrado(lado1);
        cuadrado.menuCuadrado();
    }
    public void triangulo(){
        System.out.println("Ingrese el lado A en cm del triangulo");
        lado2=in.nextFloat();
        System.out.println("Ingrese el lado B en cm del triangulo");
        lado4=in.nextFloat();
        System.out.println("Ingresa la longitud de la base en cm del triangulo: ");
        lado1=in.nextFloat();
        System.out.println("Ingresa la longitud de la altura en cm del triangulo");
        lado2=in.nextFloat();
        Triangulo triangulo  = new Triangulo(lado1,lado2,lado3,lado4);
        triangulo.menuTriangulo();
    }
    public void rectangulo(){
        System.out.println("Ingrese el lado A en cm del rectangulo");
        lado1=in.nextFloat();
        System.out.println("Ingrese el lado B en cm del rectangulo");
        lado2=in.nextFloat();
        Rectangulo rectangulo = new Rectangulo(lado1,lado2);
        rectangulo.menuRectangulo();
    }
    public void pentagono(){
        System.out.println("Ingrese la apotema en cm del pentagono");
        lado1=in.nextFloat();
        System.out.println("Ingrese un lado en cm del pentagono");
        lado2=in.nextFloat();
        Pentagono pentagono = new Pentagono(lado1,lado2);
        pentagono.menuPentagono();
    }
}
