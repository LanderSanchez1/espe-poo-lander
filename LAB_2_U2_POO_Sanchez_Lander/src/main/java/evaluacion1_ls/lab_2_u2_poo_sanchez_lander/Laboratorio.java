/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacion1_ls.lab_2_u2_poo_sanchez_lander;


import java.util.ArrayList;
import java.util.Scanner;

// Clase base para los laboratorios
class Laboratorio {
    protected String nombre;
    protected int capacidad;
    protected ArrayList<String> equipos;

    // Constructor de la clase Laboratorio
    public Laboratorio(String nombre, int capacidad, ArrayList<String> equipos) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.equipos = equipos;
    }
    // Métodos getter para acceder a los atributos
    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public ArrayList<String> getEquipos() {
        return equipos;
    }

    public boolean verificarDisponibilidad(String horario) {
        // verificar la disponibilidad del horario en el laboratorio
        
        return true;
    }
}