package com.mycompany.poo_p17_u2_mvc;

import control.Control;
import modelo.Modelo;
import vista.Vista;

public class POO_P17_U2_MVC {

    public static void main(String[] args) {
        
        Modelo mod= new Modelo();
        Vista vis=new Vista();
        Control cont= new Control(vis, mod);
        
        cont.iniciar();
        vis.setVisible(true);
        
    }
}
