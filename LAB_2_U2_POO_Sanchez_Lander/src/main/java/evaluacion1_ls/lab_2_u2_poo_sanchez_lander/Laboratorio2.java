/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacion1_ls.lab_2_u2_poo_sanchez_lander;

import java.util.ArrayList;
import java.util.Scanner;

// Clase hija para el laboratorio de tipo 2
class Laboratorio2 extends Laboratorio {
    private String lugar;
    
// Constructor de la clase Laboratorio2
    public Laboratorio2(String nombre, int capacidad, ArrayList<String> equipos, String lugar) {
        super(nombre, capacidad, equipos);
        this.lugar = lugar;
    }
    
// Método getter para acceder al atributo específico de Laboratorio2
    public String getLugar() {
        return lugar;
    }
    
}