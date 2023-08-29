/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demain;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Michael Riera/ Lander Sanchez
 */
public final class creditos extends JFrame implements ActionListener{
     JButton creditos; 
   
         public creditos(){
        this.setTitle("Menu");
        this.setSize(1010, 730);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        
        componentes();
    }
    
    //metodo que contiene todos los compoenentes de la ventana
    
    public void componentes(){
        JPanel panel = new JPanel();
       //  panel.setBackground(Color.CYAN);
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        
        //este boton va a mostrar los datos del creador de la aplicación
        creditos = new JButton("INFORMACION");
        creditos.setBounds(370,480,250,40);
        creditos.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 15));
        creditos.addActionListener(this);
        panel.add(creditos);
            
    
      
              
    }
    
    //eventos de acción

   @Override
public void actionPerformed(ActionEvent e) {
    // Este es el evento del botón "Información"
    if (e.getSource() == creditos) {
        Icon g = new ImageIcon(getClass().getResource("/img/espe.jpg"));

        // Crear el mensaje que se mostrará en el cuadro de diálogo
        String mensaje = "Universidad de las fuerzas armadas Espe\n"
                       + "Integrantes:\n"
                       + "Lánder Sánchez / Michael Riera\n"
                       + "Carrera:\n"
                       + "Ingeniería en Tecnologías de la información\n"
                       + "Segundo semestre\n"
                       + "\n"
                       + "Proyecto Final.\n"
                       + "Periodo: Abril 2023 - Septiembre 2023\n"
                       + "Docente:\n"
                       + "Ing. Cevallos Farias Javier Moyota\n"
                       + "\n"
                       + "En el presente proyecto se desarrollaro un programa sobre la\n"
                       + "gestion de roles de pagos de azafatas y pilotos. \n"          
                       + "Para el desarrollo del presente trabajo se aplicaron todos los\n"
                       + "conocimientos aprendidos en Programación orientada a objetos.";

        // Mostrar el cuadro de diálogo con el mensaje y la imagen
        JOptionPane.showMessageDialog(
            this, mensaje, "Información del Estudiante", JOptionPane.INFORMATION_MESSAGE, g);
    }
}

}
