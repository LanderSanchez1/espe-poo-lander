
package Vista;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

public class Registro extends JFrame {
//creamos una venana grafica con JFrame    
    
    public JPanel panel;
    public Registro(){
    this.setSize(500,500);
    setTitle("REGISTRO");
   
    //Para que cierre el sistema
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    
    //Centrar la ventana
    //setBounds(500, 200, 500, 500);
    
    //centrar pantalla
    setLocationRelativeTo(null);
    iniciarComponentes();
    
    }  
    
    private void iniciarComponentes(){
        colocarPanel();
        colocarEtiquetas();
        colocarBotones();
        colocarCajatexto();
        colocarAreaTexto();
    }
    private void colocarPanel(){
        panel=new JPanel();
    
        
        //damos color al panel
         panel.setBackground(Color.GREEN);     
         
        //poner el panel sobre la ventana registro
         this.getContentPane().add(panel);
    }
    //crear etiquetas
    public void colocarEtiquetas(){
        JLabel label=new JLabel("REGISTRAR", SwingConstants.CENTER);
        panel.add(label);
        panel.setLayout(null);
        label.setBounds(100,10, 350, 50);
        label.setForeground(Color.BLUE);
        label.setBackground(Color.ORANGE);
        label.setOpaque(true);
        
        //creamos objeto
                JLabel label1=new JLabel();
                label.setText("Nombre");
                
                //Agregamos la etiqueta al panel
                panel.add(label1);
                
                //Ubicar
                label1.setHorizontalAlignment(HEIGHT);
                
                //Fuente
                label1.setForeground(Color.red);
                label1.setFont(new Font("arial", Font.PLAIN, 20));
                label1.setBounds(80,70, 350, 50);
                
                //poner imagen
                JLabel labelimagen=new JLabel();
                ImageIcon imagen = new ImageIcon("registro.png");
                labelimagen.setBounds(30,110, 100, 50);
                panel.add(labelimagen);
                
                labelimagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(labelimagen.getWidth(), labelimagen.getHeight(), Image.SCALE_SMOOTH)));
                      
    }
    public void colocarBotones(){
        JButton boton1=new JButton("CLICK");
        boton1.setBounds(30, 310,100 ,50);
        panel.add(boton1);
        boton1.setEnabled(true);
        boton1.setMnemonic('a');
        
        boton1.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 20, true));
        JButton boton2=new JButton("imagen");
        ImageIcon imagen1=new ImageIcon("boton.png");
        
        boton2.setBounds(210,310, 100, 50);
        panel.add(boton2);
        boton2.setEnabled(true);
        boton2.setMnemonic('b');
        
        boton1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(boton1.getWidth(),boton1.getHeight(),Image.SCALE_SMOOTH)));
                
                
    }
    public void colocarCajatexto(){
        JTextField cajaTexto1=new JTextField();
        cajaTexto1.setBounds(130, 80, 250, 30);
        panel.add(cajaTexto1);
        cajaTexto1.setText("POO");
        System.out.println("el texto de la caja es: " +cajaTexto1.getText());
        
    }
    public void colocarAreaTexto(){
        JTextArea textarea1=new JTextArea();
        textarea1.setBounds(130, 130, 250, 150);
        panel.add(textarea1);
        textarea1.setText("POO");
        textarea1.append("\n Escribir aqui....");
        
        JScrollPane barra=new JScrollPane(textarea1);
        barra.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        
        barra.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barra.setBounds(130, 130, 250, 150);
        panel.add(barra);
        
    }
}
