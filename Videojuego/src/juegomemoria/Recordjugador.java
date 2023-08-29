package juegomemoria;

//importamos las librerias necesarias 
import Control.Conexion;
import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Recordjugador extends JFrame implements ActionListener{
    
    JLabel lblnombrejuga, lbltiempoju, lblhorainicio, lblfechaju,etiqueta;
    JButton regresar, puntajes;
     JTable tablaPuntajes;
    public Recordjugador(){
        this.setTitle("RECORD DEL JUGADOR");
        this.setSize(1100, 720);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        
        //agregamos panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.ORANGE);
        this.getContentPane().add(panel);
        panel = new JPanel() {
    // Sobrescribimos el método paintComponent para dibujar la imagen de fondo
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Cargamos la imagen de fondo y la dibujamos en el panel
        ImageIcon backgroundImage = new ImageIcon("src/imagenes/c.jpg"); // elegimos la ruta y el nombre de la imagen
        g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
    }
};
panel.setLayout(null); //  para posicionar elementos encima de la imagen de fondo
this.getContentPane().add(panel);
      etiqueta = new JLabel("TU NUEVO RECORD");
etiqueta.setBounds(320, 60, 350, 40);
etiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 35));
panel.add(etiqueta);

//este label obtendra el nombre del jugador colocado anteriormente
etiqueta = new JLabel("NOMBRE:");
etiqueta.setBounds(250, 150, 200, 30);
etiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
panel.add(etiqueta);

lblnombrejuga = new JLabel("NOMBRE:");
lblnombrejuga.setBounds(470, 150, 150, 30);
lblnombrejuga.setFont(new Font("Times New Roman", Font.BOLD, 20));
lblnombrejuga.getText();
panel.add(lblnombrejuga);

etiqueta = new JLabel("TIEMPO FINAL:");
etiqueta.setBounds(250, 210, 200, 30);
etiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
panel.add(etiqueta);

//este label obtendra el tiempo final que obtuvo, mejor dicho en cuanto tiempo
// se tardo el jugador en terminar el juego
lbltiempoju = new JLabel("TIEMPO");
lbltiempoju.setBounds(470, 210, 150, 30);
lbltiempoju.setFont(new Font("Times New Roman", Font.BOLD, 20));
panel.add(lbltiempoju);

etiqueta = new JLabel("HORA INICIAL:");
etiqueta.setBounds(250, 270, 200, 30);
etiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
panel.add(etiqueta);

// este label mostrara la hora de inicio
lblhorainicio = new JLabel("HORA");
lblhorainicio.setBounds(470, 270, 150, 30);
lblhorainicio.setFont(new Font("Times New Roman", Font.BOLD, 20));
panel.add(lblhorainicio);

etiqueta = new JLabel("FECHA:");
etiqueta.setBounds(250, 330, 200, 30);
etiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
panel.add(etiqueta);

//en este label se mostrara la fecha
lblfechaju = new JLabel("FECHA");
lblfechaju.setBounds(470, 330, 150, 30);
lblfechaju.setFont(new Font("Times New Roman", Font.BOLD, 20));
panel.add(lblfechaju);

puntajes = new JButton("ACTUALIZAR TABLA DE PUNTAJES  ");
puntajes.setBounds(340, 490, 250, 40);
puntajes.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 16));
puntajes.addActionListener(this);
panel.add(puntajes);

puntajes.addActionListener(new ActionListener (){
    @Override
    public void actionPerformed(ActionEvent e) {
            if (e.getSource() == puntajes) {
            guardarPuntajeEnBD();
            mostrarPuntajesEnTabla();
        }
    }
});

regresar = new JButton("VOLVER AL MENU");
regresar.setBounds(340, 560, 250, 40);
regresar.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 16));
regresar.addActionListener(this);
panel.add(regresar);


 String[] columNames = {"nombre","tiempo","fecha"};
        DefaultTableModel tableModel = new DefaultTableModel(columNames,0);
        //tabla de datos
       tablaPuntajes = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(tablaPuntajes);
        scrollPane.setBounds(600,100,390,400);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        panel.add(scrollPane);
    }
 private void guardarPuntajeEnBD() {
        Conexion con = new Conexion();
        Connection conexion = con.conexion();

        String nombre = lblnombrejuga.getText();
        String tiempo = lbltiempoju.getText();
        String horaInicio = lblhorainicio.getText();
        String fecha = lblfechaju.getText();

        try {
            String query = "INSERT INTO puntajes (nombre, puntaje, fecha_registro) VALUES (?, ?, ?)";
            PreparedStatement statement = conexion.prepareStatement(query);
            statement.setString(1, nombre);
            statement.setString(2, tiempo);
            statement.setString(3, fecha);
            statement.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Puntaje guardado en la base de datos");
            
            statement.close();
            conexion.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el puntaje: " + e.getMessage());
        }
    }
    // Método para mostrar los puntajes en una tabla
    private void mostrarPuntajesEnTabla() {
        Conexion con = new Conexion();
        Connection conexion = con.conexion();

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("tiempo");
        modelo.addColumn("Fecha");

        try {
            String query = "SELECT * FROM puntajes";
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                Object[] fila = {
                    resultSet.getInt("id"),
                    resultSet.getString("nombre"),
                    resultSet.getString("puntaje"),
                    resultSet.getString("fecha_registro")
                };
                modelo.addRow(fila);
            }          
            tablaPuntajes.setModel(modelo);
            statement.close();
            conexion.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar los puntajes: " + e.getMessage());
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        //el boton regresar hara que regresemos a la ventana de menu
        if(e.getSource() == regresar){
            menuinicio ventana = new menuinicio();
            JuegoMemoria ventana2 = new JuegoMemoria();
            ventana2.setVisible(false);
            ventana.setVisible(true);
            this.setVisible(false);
        
        }
    }
}