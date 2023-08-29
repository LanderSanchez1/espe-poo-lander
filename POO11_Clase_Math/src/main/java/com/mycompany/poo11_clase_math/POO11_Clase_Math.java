/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo11_clase_math;

/**
 *
 * @author Lander Sanchez
 */
public class POO11_Clase_Math {

    public static void main(String[] args) {
        int generados=0;
        int [] nums=new int[6];
        Funciones funcion = new Funciones();
        int n;
        
        do{
            //generamos un numero aleatorio del 1 al 49
            n=(int)(Math.random()*49+1);
            //si no esta repetido lo guardamos en el array
            if (!funcion.repetido(n, nums, generados)){
                nums[generados]=n;
                generados++;
            }
        }while(generados<6);// TODO code application logic here
        funcion.ordenar(nums);
        funcion.mostrar(nums); 
    }
    
}
