package juegomemoria;

//importamos las librerias necesarias 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class menuinicio extends JFrame implements ActionListener {
    JLabel nomjudador,etiqueta;
    JButton creditos,iniciarjuego,salir;
    JTextField txtnomjugador;
   
    public menuinicio(){
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
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        // Después de crear el panel
    panel = new JPanel() {
    // Sobrescribimos el método paintComponent para dibujar la imagen de fondo
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Cargamos la imagen de fondo y la dibujamos en el panel
        ImageIcon backgroundImage = new ImageIcon("src/imagenes/a.jpg"); // Elegimos la ruta y el nombre de la imagen
        g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
    }
};
panel.setLayout(null);
this.getContentPane().add(panel);

        etiqueta = new JLabel("JUEGO DE MEMORIA ");
        etiqueta.setBounds(290,70,500,60);
        etiqueta.setFont(new Font("Berlin Sans FB", Font.PLAIN, 50));
        panel.add(etiqueta);
        
        etiqueta = new JLabel("NOMBRE DEL JUGADOR:");
        etiqueta.setBounds(400,230,250,40);
        Font fontNegrita = new Font("Lucida Sans Unicode", Font.BOLD, 20);
        etiqueta.setFont(fontNegrita);
        panel.add(etiqueta);
        
        //texto donde se coloca el nombre de jugador
        txtnomjugador = new JTextField();
        txtnomjugador.setBounds(300,300,400,40);
        txtnomjugador.setHorizontalAlignment(JTextField.CENTER);
        txtnomjugador.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 20));
        panel.add(txtnomjugador);
        
        //boton iniciar juego, este mandara directamente a iniciar el juego 
        iniciarjuego = new JButton("JUGAR");
        iniciarjuego.setBounds(370,400,250,40);
        iniciarjuego.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 15));
        iniciarjuego.addActionListener(this);
        panel.add(iniciarjuego);
               
        //este boton va a mostrar los datos del creador de la aplicación
        creditos = new JButton("INFORMACION");
        creditos.setBounds(370,480,250,40);
        creditos.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 15));
        creditos.addActionListener(this);
        panel.add(creditos);
            
        //Boton salir
        salir = new JButton("SALIR");
        salir.setBounds(370,560,250,40);
        salir.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 15));
        salir.addActionListener(this);
        panel.add(salir);             
    }
    
    //eventos de acción
    @Override
    public void actionPerformed(ActionEvent e) {
        
        //este evento realiza la acción del boton iniciar juego
       if(e.getSource() == iniciarjuego){
           
           //se coloca un if para colocar una excepcion a la hora de iniciar el juego 
             if(txtnomjugador.getText().equals("")){
                 //si en el txtnomjugador no se encuentra ningun valor
             JOptionPane.showMessageDialog(null, "Coloca nombre de jugador");
             //mandara un mensaje diciendo que tiene que colocar algun nombre
            }else{
                 //de lo contrario, se inicializara el juego de memoria
                 //se manda a llamar la clase JuegoMemoria
                 JuegoMemoria ventana = new JuegoMemoria();
                 //decimos que nombreju de la clase JuegoMemoria 
                 //va a obtener el valor que se coloco en el txtnomjugador
                 ventana.nombreju.setText(txtnomjugador.getText());
                 //esto se coloca para inicializar el tiempo de la clase JuegoMemoria
                 ventana.tiempo.start();
                 //mostramos la ventana de la clase JuegoMemoria
                 ventana.setVisible(true);
                 //ocultamos la ventana de menuinicial
                 this.setVisible(false);                                
             }
        }    
       //este es el evento de el boton creditos
       if(e.getSource() == creditos){
           //se manda a llamar una imagen 
            Icon g=new ImageIcon(getClass().getResource("/imagenes/espe.jpg"));
            //se implementa que a la hora de apachar el boton creditos este mostrara una ventana
            //donde se mostraran algun datos del creador del programa
         JOptionPane.showMessageDialog(null," Universidad de las fuerzas armadas Espe\n"
                 + "Integrantes:\n Lánder Sánchez / Michael Riera\n "
                 + "Carrera:\n Ingenieria en Tecnologías de la información      "
                 + "\n Segundo semestre"
                 + "\n "
                 + "\n "
                 + "\n Juego de Memoria."
                 + "\n Periodo: Abril 2023 - Septiembre 2023 "
                 + "\n Docente:\n Ing.  Cevallos Farias Javier Moyota"
                 + "\n "
                 + "\n "
                 + "\n El juego de memoria desarrollado se basa en el famoso juego"
                 + "\n de encontrar parejas de cartas. Los jugadores deben voltear"
                 + "\n las cartas en busca de coincidencias entre las diferentes"
                 + "\n imágenes, con el objetivo de entrenar la memoria y concentración."
                 + "\n Para el desarrollo del presente trabajo se aplicaron todos los"
                 + "\n conocimientos aprendidos en Programación orientada a objetos."                
                 //al final mandamos a llamar a la imagen para que se coloque en la ventana
                , "Informacion del Estudiante",JOptionPane.INFORMATION_MESSAGE, g);        
       }      
       //este es el evento del boton salir 
       if(e.getSource() == salir){
           //se mostrara una ventana donde hace una pregunta y tiene las opciones de salir o no
           if (JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro de querer salir de la aplicacion?",
                "Salir del juego", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE) == JOptionPane.YES_OPTION)
                System.exit(0);
       } 
    }
}
