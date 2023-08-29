/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import Control.Conexion;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.DeleteResult;

import org.bson.Document;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Registro extends JFrame {
     private JPanel panel;
    private JTable tabla;
    private DefaultTableModel modeloTabla;
      private MongoClient mongoClient;
    private JTextField campoCodigo;
    private JTextField campoCedula;
    private JTextField campoApellido;
    private JTextField campoNombre;
    private JTextField campoEmail;
    private JTextField campoTelefono;
    private JTextField campoDireccion;
    private JComboBox<String> comboMateria;
    private JRadioButton radioActivo;
    private JRadioButton radioInactivo;
    private ButtonGroup grupoEstado;
    private String generarCodigo() {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
    Date fecha = new Date();
    String codigo = "C" + sdf.format(fecha);
    return codigo;
}
    


 public Registro(boolean autoOpen) {
     this.setSize(1000, 600);
        setTitle("REGISTRO");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        campoCodigo = new JTextField();
        campoCedula = new JTextField();
        campoApellido = new JTextField();
        campoNombre = new JTextField();
        campoEmail = new JTextField();
        campoTelefono = new JTextField();
        campoDireccion = new JTextField();
        comboMateria = new JComboBox<>(new String[]{"", "Materia 1", "Materia 2"});
        radioActivo = new JRadioButton("Activo");
        radioInactivo = new JRadioButton("Inactivo");
        grupoEstado = new ButtonGroup();

        iniciarComponentes();
         if (autoOpen) {
        setVisible(true); // Muestra el formulario automáticamente si se establece autoOpen en true
    }

        
    }

    private void iniciarComponentes() {
        colocarPanel();
        colocarEtiquetas();
        colocarCampos();
        colocarBotones();
        colocarTabla();
    }

    private void colocarPanel() {
        panel = new JPanel();
        panel.setBackground(Color.ORANGE);
        this.getContentPane().add(panel);
        panel.setLayout(null); // Cambio a un layout nulo para controlar la posición exacta de los componentes
    }

    public void colocarEtiquetas() {
        JLabel label = new JLabel("FORMULARIO DE REGISTRO", SwingConstants.CENTER);
        label.setBounds(150, 10, 450, 50);
        label.setForeground(Color.CYAN);
        label.setBackground(Color.BLUE);
        label.setOpaque(true);
        panel.add(label); // Agrego la etiqueta al panel
    }

   public void colocarCampos() {
       
  

    JLabel labelCedula = new JLabel("Cédula");
    labelCedula.setBounds(30, 120, 120, 30);
    panel.add(labelCedula);

    campoCedula = new JTextField();
    campoCedula.setBounds(150, 120, 300, 30);
    panel.add(campoCedula);

    JLabel labelApellido = new JLabel("Apellido");
    labelApellido.setBounds(30, 160, 120, 30);
    panel.add(labelApellido);

    campoApellido = new JTextField();
    campoApellido.setBounds(150, 160, 300, 30);
    panel.add(campoApellido);

    JLabel labelNombre = new JLabel("Nombre");
    labelNombre.setBounds(30, 200, 120, 30);
    panel.add(labelNombre);

    campoNombre = new JTextField();
    campoNombre.setBounds(150, 200, 300, 30);
    panel.add(campoNombre);

    JLabel labelEmail = new JLabel("Email");
    labelEmail.setBounds(30, 240, 120, 30);
    panel.add(labelEmail);

    campoEmail = new JTextField();
    campoEmail.setBounds(150, 240, 300, 30);
    panel.add(campoEmail);

    JLabel labelTelefono = new JLabel("Teléfono");
    labelTelefono.setBounds(30, 280, 120, 30);
    panel.add(labelTelefono);

    campoTelefono = new JTextField();
    campoTelefono.setBounds(150, 280, 300, 30);
    panel.add(campoTelefono);

    JLabel labelDireccion = new JLabel("Dirección");
    labelDireccion.setBounds(30, 320, 120, 30);
    panel.add(labelDireccion);

    campoDireccion = new JTextField();
    campoDireccion.setBounds(150, 320, 300, 30);
    panel.add(campoDireccion);
    //Materia
        JLabel labelMateria = new JLabel("Materia");
        labelMateria.setBounds(30, 360, 120, 30);
        panel.add(labelMateria);

        comboMateria = new JComboBox<>(new String[]{"", "Materia 1", "Materia 2"});
        comboMateria.setBounds(150, 360, 220, 30);
        panel.add(comboMateria);

        JLabel labelEstado = new JLabel("Estado");
        labelEstado.setBounds(30, 400, 120, 30);
        panel.add(labelEstado);

        radioActivo = new JRadioButton("Activo");
        radioActivo.setBounds(150, 400, 100, 30);
        panel.add(radioActivo);

        radioInactivo = new JRadioButton("Inactivo");
        radioInactivo.setBounds(270, 400, 100, 30);
        panel.add(radioInactivo);

        grupoEstado = new ButtonGroup();
        grupoEstado.add(radioActivo);
        grupoEstado.add(radioInactivo);
    

}
   
    private void insertarRegistroMongoDB(String cedula, String apellido, String nombre, String email,
                                        String telefono, String direccion, String materia, String estado) {
        try {
            MongoDatabase database = mongoClient.getDatabase("testdb"); // Cambia "testdb" al nombre de tu base de datos
            MongoCollection<Document> collection = database.getCollection("items"); // Cambia "items" al nombre de tu colección

            Document nuevoRegistro = new Document("cedula", cedula)
                    .append("apellido", apellido)
                    .append("nombre", nombre)
                    .append("email", email)
                    .append("telefono", telefono)
                    .append("direccion", direccion)
                    .append("materia", materia)
                    .append("estado", estado);

            collection.insertOne(nuevoRegistro);
        } catch (Exception e) {
            System.out.println("Error al insertar el registro en MongoDB: " + e.getMessage());
        }
    }
 public void colocarTabla() {
    try {
        modeloTabla = new DefaultTableModel();
        tabla = new JTable(modeloTabla);

        modeloTabla.addColumn("Cédula");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Email");
        modeloTabla.addColumn("Teléfono");
        modeloTabla.addColumn("Dirección");
        modeloTabla.addColumn("Materia");
        modeloTabla.addColumn("Estado");

        // Conexión a la base de datos MongoDB
        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
        MongoDatabase database = mongoClient.getDatabase("testdb"); // Cambia "testdb" al nombre de tu base de datos
        MongoCollection<Document> collection = database.getCollection("items"); // Cambia "items" al nombre de tu colección

        // Obtener todos los documentos de la colección y agregarlos a la tabla
        for (Document document : collection.find()) {
            Object[] fila = {
                document.getString("cedula"),
                document.getString("apellido"),
                document.getString("nombre"),
                document.getString("email"),
                document.getString("telefono"),
                document.getString("direccion"),
                document.getString("materia"),
                document.getString("estado")
            };
            modeloTabla.addRow(fila);
        }

        JScrollPane scrollPane = new JScrollPane(tabla); // Agregar la tabla a un JScrollPane
        scrollPane.setBounds(650, 90, 500, 460); // Establecer posición y tamaño del JScrollPane

        // Configurar barras de desplazamiento verticales y horizontales
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        panel.add(scrollPane); // Agregar el JScrollPane al panel

        // Cerrar la conexión a la base de datos MongoDB
        mongoClient.close();
    } catch (Exception e) {
        System.out.println("Error al obtener los datos desde MongoDB: " + e.getMessage());
    }
}
  
  
    public void colocarBotones() {
        UIManager.put("Button.background", Color.GREEN);
        UIManager.put("Button.foreground", Color.CYAN);
// Boton nuevo 
        // Boton nuevo
JButton botonNuevo = new JButton("Nuevo");
botonNuevo.setBounds(50, 500, 100, 40);
panel.add(botonNuevo);
//Accion de boton nuevo
botonNuevo.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        limpiarCampos();
        String codigo = generarCodigo();
        campoCodigo.setText(codigo);
        comboMateria.setSelectedIndex(0);
    }
});
    //Boton guardar
   // Boton guardar para nuevos registros
JButton botonGuardar = new JButton("Guardar");
botonGuardar.setBounds(160, 500, 100, 40);
panel.add(botonGuardar);

botonGuardar.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Obtener los valores de los campos de edición
        String cedula = campoCedula.getText();
        String apellido = campoApellido.getText();
        String nombre = campoNombre.getText();
        String email = campoEmail.getText();
        String telefono = campoTelefono.getText();
        String direccion = campoDireccion.getText();
        String materia = (String) comboMateria.getSelectedItem();
        String estado = radioActivo.isSelected() ? "Activo" : "Inactivo";

        // Crear un documento MongoDB con los valores
        Document documento = new Document("cedula", cedula)
            .append("apellido", apellido)
            .append("nombre", nombre)
            .append("email", email)
            .append("telefono", telefono)
            .append("direccion", direccion)
            .append("materia", materia)
            .append("estado", estado);

        // Insertar el documento en la base de datos
        Conexion conexionBD = new Conexion();
        conexionBD.insertarRegistro(documento);
        conexionBD.cerrarConexion();

        JOptionPane.showMessageDialog(null, "Registro insertado con éxito.");
        actualizarTabla();
    }
});
// Boton editar
JButton botonEditar = new JButton("Editar");
botonEditar.setBounds(270, 500, 100, 40);
panel.add(botonEditar);

botonEditar.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        int filaSeleccionada = tabla.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione el registro que desea editar.", "Editar Registro", JOptionPane.WARNING_MESSAGE);
        } else {
            // Obtener el código del registro seleccionado
            String codigo = (String) modeloTabla.getValueAt(filaSeleccionada, 0);

            // Consultar el documento en MongoDB por su código
            Conexion conexionBD = new Conexion();
            MongoCollection<Document> collection = conexionBD.getMongoCollection();
            
            BasicDBObject filtro = new BasicDBObject("codigo", codigo);
            Document documento = collection.find(filtro).first();

            if (documento != null) {
                // Obtener los valores del documento
                String cedula = documento.getString("cedula");
                String apellido = documento.getString("apellido");
                String nombre = documento.getString("nombre");
                String email = documento.getString("email");
                String telefono = documento.getString("telefono");
                String direccion = documento.getString("direccion");
                String materia = documento.getString("materia");
                String estado = documento.getString("estado");

                // Asignar los valores a los campos de edición
                campoCedula.setText(cedula);
                campoApellido.setText(apellido);
                campoNombre.setText(nombre);
                campoEmail.setText(email);
                campoTelefono.setText(telefono);
                campoDireccion.setText(direccion);

                // Marcar el RadioButton correspondiente al estado
                if (estado.equals("Activo")) {
                    radioActivo.setSelected(true);
                } else {
                    radioInactivo.setSelected(true);
                }

                // Seleccionar el valor del JComboBox de materia
                comboMateria.setSelectedItem(materia);
            } else {
                JOptionPane.showMessageDialog(null, "Registro no encontrado en la base de datos.");
            }
        }
    }
});



        
//Boton eliminar
     JButton botonEliminar = new JButton("Eliminar");
botonEliminar.setBounds(380, 500, 100, 40);
panel.add(botonEliminar);
botonEliminar.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        int filaSeleccionada = tabla.getSelectedRow();
        if (filaSeleccionada != -1) {
            String codigo = (String) modeloTabla.getValueAt(filaSeleccionada, 0);

            Conexion conexionBD = new Conexion();
            MongoCollection<Document> collection = conexionBD.getMongoCollection();

            if (collection != null) {
                BasicDBObject filtro = new BasicDBObject("codigo", codigo);

                DeleteResult deleteResult = collection.deleteOne(filtro);

                if (deleteResult.getDeletedCount() > 0) {
                    JOptionPane.showMessageDialog(null, "Registro eliminado con éxito.");
                    actualizarTabla();
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el registro a eliminar.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error al obtener la colección de MongoDB.");
            }
        }
    }
});
        
    
//Boton Salir
        JButton botonSalir = new JButton("Salir");
    botonSalir.setBounds(490, 500, 100, 40);
    panel.add(botonSalir);

    // Acción para el botón "Salir"
    botonSalir.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0); // Cerrar la aplicación
        }
    });
}
    
private void actualizarTabla() {
    Conexion conexionBD = new Conexion();
    MongoCollection<Document> collection = conexionBD.getMongoCollection();

    if (collection != null) {
        modeloTabla.setRowCount(0); // Limpiar los datos actuales en la tabla

        FindIterable<Document> documentos = collection.find();

        for (Document documento : documentos) {
            Object[] fila = {
                documento.getString("codigo"),
                documento.getString("cedula"),
                documento.getString("apellido"),
                documento.getString("nombre"),
                documento.getString("email"),
                documento.getString("telefono"),
                documento.getString("direccion"),
                documento.getString("materia"),
                documento.getString("estado")
            };
            modeloTabla.addRow(fila);
        }
    } else {
        System.out.println("Error al obtener la colección de MongoDB.");
    }
}

   private void limpiarCampos() {
    campoCodigo.setText("");
    campoCedula.setText("");
    campoApellido.setText("");
    campoNombre.setText("");
    campoEmail.setText("");
    campoTelefono.setText("");
    campoDireccion.setText("");
}


}