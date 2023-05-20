/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_l1_p7_metodosretornovalores_landersanchez;

/**
 *
 * @author User
 */
public class Operaciones {
    //Metodo para sumar por retorno ed valores
    public int sumar(int num1,int num2){
        int suma=num1+num2;
        
        //Retorna el valor de la suma
        return suma;
    }
        
    //creamos un metodo para restar
    public int restar(int num1,int num2){
        int resta=num1-num2;
        
        //retorna el valor de la resta
        return resta;
    }
 
    //metodo que multiplica
    public int multiplicar(int num1,int num2){
        int multiplicacion=num1*num2;
        
        //retorna el valor de la multiplicacion
        return multiplicacion;
    }
    
    //metodo que divide
    public int dividir(int num1,int num2){
        int division=num1/num2;
        
        //retorna valor de la division;
        return division;
    }
    
    public void resultados(int suma,int resta,int multiplicacion,int division){
        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la resta es: "+resta);
        System.out.println("El resultado de la multiplicacion es: "+multiplicacion);
        System.out.println("El resultado de la division es: "+division);
    }
}

