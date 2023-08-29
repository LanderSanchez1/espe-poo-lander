/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Poo_herencia;

/**
 *
 * @author Lander Sanchez
 */
public class Motocicleta extends Vehiculo{
    
    @Override
        public void encendido(){
            encendido=true;
            estado="Motocicleta encendido";
        }
    @Override
        public void apagado(){
            encendido=false;
            estado="Motocicleta apagada";
        }
}
