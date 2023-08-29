package controlador;

import Vista.VentanaLogin;
import Vista.VistaPrincipal;
import static controlador.PrincipalControlador.ventana;


public class LoginControlador {
    public static VentanaLogin ventana=new VentanaLogin();
    public static void mostrar(){ventana.setVisible(true);}
    public static void ocultar(){ ventana.setVisible(false);}

    public static void eventoBoton1(){
        String usuario=ventana.getjTextField1().getText();
        String clave=ventana.getjTextField2().getText();
        
        if (usuario.contains("kelvin")&& clave.equals("123")){
            ocultar();
            PrincipalControlador.mostrar();
        }else{
            System.out.println("usuario o clave incorrecta");
        }
    }
}
