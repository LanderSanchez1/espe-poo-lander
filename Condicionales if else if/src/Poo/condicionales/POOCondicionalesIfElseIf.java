/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Poo.condicionales;

/**
 *
 * @author Lander Sanchez
 */
public class POOCondicionalesIfElseIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int hora=13;
        if (hora>=0 && hora<=12)
        {
            System.out.println("Buenos dias");
        } else if (hora>12 && hora <=18){
            System.out.println("Buenas Tardes");
        } else if (hora>18 && hora<=0){
            System.out.println("Buenas noches");
        }
    }
    
}
