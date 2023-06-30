package com.mycompany.poo_u2_p10_sobrecarga_landers;

/**
 *
 * @author Lander Sanchez 
 */
public class Persona {
    
    String nombre;
    int edad;
    int cedu;
    
    
    public Persona (String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
        
    }
    public Persona (int cedu){
        this.cedu=cedu;
   
    }
    //Sobrecarga de metodos
    public void jugar(){
        System.out.println("Mi nombre es:" +nombre + "voy a jugar");
    }
    public void jugar(String juego){
        System.out.println("Voy a jugar:" +juego + "me gusta mucho");
}
}