package controlador;
import Modelo.Cobranzas;
import Vista.VentanaLogin;
import Vista.VistaCobranzas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CobranzasControlador  implements ActionListener{
    public static VistaCobranzas ventana=new VistaCobranzas();
    public static void mostrar(){ventana.setVisible(true);}
    private Cobranzas objeModelo;
    private VistaCobranzas objCobranzas;
    public CobranzasControlador() {
        this.objeModelo = objeModelo;
        this.objCobranzas = objCobranzas;
        objCobranzas.getBtnCalcular().addActionListener(this); 
    }
    public void iniciar(){
       objCobranzas.setTitle("USTED VA A SUMAR POR MEDELO DE VISTA CONTROLADOR");
       objCobranzas.setLocationRelativeTo(null);
       objCobranzas.getTxtC1().setText(String.valueOf(objeModelo.getIngresos()));
       objCobranzas.getTxtC2().setText(String.valueOf(objeModelo.getEgresos()));
       objCobranzas.getTxtC3().setText(String.valueOf(objeModelo.calcularBalance()));
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    //codigo de la ejecucion
    objeModelo.setIngresos(Integer.valueOf(objCobranzas.getTxtC1().getText()));
    objeModelo.setEgresos(Integer.valueOf(objCobranzas.getTxtC2().getText()));
    
    if (e.getSource()==objCobranzas.getBtnCalcular()){
        objeModelo.calcularBalance();  
    }
    objCobranzas.getTxtC3().setText(String.valueOf(objeModelo.calcularBalance()));
    }
}
