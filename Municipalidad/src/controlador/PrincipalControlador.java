/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Vista.VistaPrincipal;

public class PrincipalControlador {
    public static VistaPrincipal ventana=new VistaPrincipal();
    public static void mostrar(){ventana.setVisible(true);}
    public static void ocultar(){ ventana.setVisible(false);}
    
    public static void botonoSalir(){
        ocultar();
        LoginControlador.mostrar();
    }
    
    public static void botonoAlcaldia(){
        ocultar();
        AlcaldeControlador.mostrar();
    }
    
    public static void botonoCobranzas(){
        ocultar();
        CobranzasControlador.mostrar();
    }
    
    public static void botonoAdministrativos(){
        ocultar();
        CobranzasControlador.mostrar();
    }
}
