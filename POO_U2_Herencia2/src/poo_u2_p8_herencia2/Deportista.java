/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_u2_p8_herencia2;

/**
 *
 * @author Lander Sanchez
 */
public class Deportista extends Persona{
    String deporte;
    public Deportista(String nom){
        super(nom);
    }
    public void cambiarNombre(String nom){
        super.setNombre(nom);
    }
}
