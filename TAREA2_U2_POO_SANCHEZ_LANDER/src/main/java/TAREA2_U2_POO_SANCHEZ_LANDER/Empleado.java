package TAREA2_U2_POO_SANCHEZ_LANDER;

import java.util.Date;
import java.util.Scanner;

// Clase abstracta que representa un empleado
abstract class Empleado {
    private String nombre; // Nombre del empleado
    private int edad; // Edad del empleado
    private Date fechaIngreso; // Fecha de ingreso del empleado
    private double salario; // Salario del empleado
    protected static final double BONO = 1000.0; // Bono base para incentivos

    // Constructor de la clase Empleado
    public Empleado(String nombre, int edad, Date fechaIngreso, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaIngreso = fechaIngreso;
        this.salario = salario;
    }
    // Métodos get y set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public Date getFechaIngreso() {
        return fechaIngreso;
    }
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    // Método abstracto para incentivar al empleado 
    public abstract void incentivar();
}



