/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Poo_herencia;

/**
 *
 * @author Lander Sanchez
 */
public class Automovil  extends Vehiculo{
    
    boolean parabrisas;
    
    @Override
    public void encendido(){
        encendido=true;
        estado="Vehiculo encendido";
    }
    public void apagado(){
        encendido=false;
        estado="Vehiculo apagado";
    }
}
