
package controlador;

import Vista.VistaAdministrativo;
import Vista.VistaAlcaldia;

public class AdministrativoControlador {
    public static VistaAdministrativo ventana=new VistaAdministrativo();
    public static void mostrar(){ventana.setVisible(true);}
    public static void ocultar(){ ventana.setVisible(false);}
    
}
