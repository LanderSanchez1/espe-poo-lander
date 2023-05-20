/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_l1_p6_metodos_landersanchez;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class Operaciones {
    //Se declara las variables de los numeros
    int num1;
    int num2;
    //Se declara las variables de las operaciones
    int suma,resta,multiplicacion,division; 
       
    //Declaracion de las metodos
    
    public void capturarnumeros(){
        //Pedimos numeros
        num1=Integer.parseInt(JOptionPane.showInputDialog("Deme su primer numero"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Deme su segundo numero"));
    }
    //metodos suma,resta,multiplicacion y division
    
    //Metodo para sumar 
    public void sumar(){
        suma=num1+num2;
    }
    
    //metodo para restar
    public void restar(){
        resta=num1-num2;
    }
 
    //metodo para multiplicar
    public void multiplicacion(){
        multiplicacion=num1*num2;
    }
    
    //metodo para dividir
    public void division(){
        division=num1/num2;
    }
    
    //muestra los resultado
    public void resultado(){
        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la resta es: "+resta);
        System.out.println("El resultado de la multiplicacion es: "+multiplicacion);
        System.out.println("El resultado de la division es: "+division);
    }
}

