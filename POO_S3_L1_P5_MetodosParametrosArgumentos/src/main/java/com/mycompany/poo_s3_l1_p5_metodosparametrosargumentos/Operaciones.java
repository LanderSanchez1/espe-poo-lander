/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_s3_l1_p5_metodosparametrosargumentos;


public class Operaciones {
    //Declaracion varibles
    int suma,resta,multiplicacion,division;
    
    //Metodo sumar
    public void sumar(int num1,int num2){
        suma =num1+num2;
    }
    
    //Metodo restar
    public void restar(int num1,int num2){
        resta =num1-num2;
    }
    
    //Metodo multiplicar
    public void multiplicar(int num1,int num2){
        multiplicacion=num1*num2;
    }
    
    //Metodo dividir
    public void dividir(int num1,int num2){
        division=num1/num2;
    }
    
    //Resultado
    public void resultado(){
        System.out.println("Resultado de la suma es: "+suma);
        System.out.println("Resultado de la resta es: "+resta);
        System.out.println("Resultado de la multiplicacion: "+multiplicacion);
        System.out.println("Resultado de la division: "+division);
}
