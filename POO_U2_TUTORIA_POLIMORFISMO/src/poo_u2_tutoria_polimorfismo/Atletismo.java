/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_u2_tutoria_polimorfismo;

/**
 *
 * @author Lander Sanchez
 */
public class Atletismo extends Deportista{
    private String prueba;
    
    public Atletismo(String nombre, int edad, String disiplina, String sexo, String prueba) {
        super(nombre, edad, disiplina, sexo);
        this.prueba=prueba;
    }

    public String getPrueba() {
        return prueba;
    }

    public void setPrueba(String prueba) {
        this.prueba = prueba;
    }

    @Override
    public void entrenamiento() {
        System.out.println("EL ATLETISMO ES BUENO PARA TI");
    }
    
    public void mostrarDatos(){
        System.out.println("NOMBRE: "+getNombre());
        System.out.println("EDAD: "+getEdad());
        System.out.println("DISIPLINA: "+getDisiplina());
        System.out.println("SEXO: "+getSexo());
        System.out.println("PRUEBA: "+getPrueba());
    }
    
}
