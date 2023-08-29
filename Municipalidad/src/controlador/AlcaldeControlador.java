
package controlador;

import Vista.VistaAlcaldia;


public class AlcaldeControlador {
    
    private VistaAlcaldia objV;
    private AlcaldeControlador objC;
    
    
    public static VistaAlcaldia ventana=new VistaAlcaldia();
    public static void mostrar(){ventana.setVisible(true);}
    public static void ocultar(){ ventana.setVisible(false);}

}
