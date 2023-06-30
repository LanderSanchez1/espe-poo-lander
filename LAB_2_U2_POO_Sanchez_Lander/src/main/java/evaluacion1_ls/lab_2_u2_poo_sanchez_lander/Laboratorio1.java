/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacion1_ls.lab_2_u2_poo_sanchez_lander;

import java.util.ArrayList;
import java.util.Scanner;

// Clase hija para el laboratorio de tipo 1
class Laboratorio1 extends Laboratorio {
    private String espacio;
    
// Constructor de la clase Laboratorio1
    public Laboratorio1(String nombre, int capacidad, ArrayList<String> equipos, String espacio) {
        super(nombre, capacidad, equipos);
        this.espacio = espacio;
    }
    
// Método getter para acceder al atributo específico de Laboratorio1
    public String getEspacio() {
        return espacio;
    }
    
}
