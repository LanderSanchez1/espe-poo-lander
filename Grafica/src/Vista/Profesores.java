/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import Control.Conexion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Profesores extends JFrame {
      private JPanel panel;
    private JTextField campoCodigo;
    private JTextField campoNombre;
    private JTextField campoApellido;
    private JTextField campoCelular;
    private JTextField campoMail;
    private JComboBox<String> comboTitulo;
    private JRadioButton radioActivo;
    private JRadioButton radioInactivo;
    private ButtonGroup grupoEstado;
    private JTable tabla;
    private DefaultTableModel modeloTabla;
    private JLabel labelImagen;
    private DefaultTableModel modeloTablaProfesores;
    
    public Profesores() {
        this.setSize(800, 500);
        setTitle("PROFESORES");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        iniciarComponentes();
    }
 private void crearModeloTabla() {
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Código");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Celular");
        modeloTabla.addColumn("Mail");
        modeloTabla.addColumn("Título");
        modeloTabla.addColumn("Estado");
    }

     private void iniciarComponentes() {
    colocarPanel();
    colocarEtiquetaTitulo();
    colocarCampos();
    modeloTablaProfesores = new DefaultTableModel(); // Agrega esta línea
    colocarTabla();
    colocarBotones();
}
     
    private void colocarPanel() {
        panel = new JPanel();
        panel.setBackground(Color.MAGENTA);
        this.getContentPane().add(panel);
        panel.setLayout(null);
    }

    private void colocarEtiquetaTitulo() {
        JLabel label = new JLabel("FORMULARIO DE PROFESORES", SwingConstants.CENTER);
        label.setBounds(150, 10, 450, 50);
        label.setForeground(Color.WHITE);
        label.setBackground(Color.BLUE);
        label.setOpaque(true);
        panel.add(label);
    }

    private void colocarTabla() {
    Conexion conexionBD = new Conexion();
    ResultSet resultSet = conexionBD.obtenerDatosProfesores();

    try {
        modeloTabla = new DefaultTableModel();
        tabla = new JTable(modeloTabla);

        modeloTabla.addColumn("Código");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Celular");
        modeloTabla.addColumn("Mail");
        modeloTabla.addColumn("Título");
        modeloTabla.addColumn("Estado");

        while (resultSet.next()) {
            Object[] fila = {
                resultSet.getString("profe_codigo"),
                resultSet.getString("profe_nombre"),
                resultSet.getString("profe_apellido"),
                resultSet.getString("profe_celular"),
                resultSet.getString("profe_mail"),
                resultSet.getString("profe_titulo"),
                resultSet.getString("profe_estado")
            };
            modeloTabla.addRow(fila);
        }
    } catch (SQLException ex) {
        System.out.println("Error al obtener los datos: " + ex.getMessage());
    } finally {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (SQLException ex) {
            System.out.println("Error al cerrar el ResultSet: " + ex.getMessage());
            }
        }

    JScrollPane scrollPane = new JScrollPane(tabla);
    scrollPane.setBounds(650, 90, 500, 460); // Establecer posición y tamaño del JScrollPane
    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    panel.add(scrollPane);

    }

   private void colocarCampos() {
    JLabel labelNombre = new JLabel("Nombre");
    labelNombre.setBounds(30, 80, 120, 30);
    panel.add(labelNombre);

    campoNombre = new JTextField();
    campoNombre.setBounds(150, 80, 300, 30);
    panel.add(campoNombre);

    JLabel labelApellido = new JLabel("Apellido");
    labelApellido.setBounds(30, 120, 120, 30);
    panel.add(labelApellido);

    campoApellido = new JTextField();
    campoApellido.setBounds(150, 120, 300, 30);
    panel.add(campoApellido);

    JLabel labelCelular = new JLabel("Celular");
    labelCelular.setBounds(30, 160, 120, 30);
    panel.add(labelCelular);

    campoCelular = new JTextField();
    campoCelular.setBounds(150, 160, 300, 30);
    panel.add(campoCelular);

    JLabel labelMail = new JLabel("Mail");
    labelMail.setBounds(30, 200, 120, 30);
    panel.add(labelMail);

    campoMail = new JTextField();
    campoMail.setBounds(150, 200, 300, 30);
    panel.add(campoMail);

    JLabel labelTitulo = new JLabel("Título");
    labelTitulo.setBounds(30, 240, 120, 30);
    panel.add(labelTitulo);

    comboTitulo = new JComboBox<>(new String[]{"", "Licenciado", "Ingeniero", "Máster", "Doctor"});
    comboTitulo.setBounds(150, 240, 220, 30);
    panel.add(comboTitulo);

    JLabel labelEstado = new JLabel("Estado");
    labelEstado.setBounds(30, 280, 120, 30);
    panel.add(labelEstado);

    radioActivo = new JRadioButton("Activo");
    radioActivo.setBounds(150, 280, 100, 30);
    panel.add(radioActivo);

    radioInactivo = new JRadioButton("Inactivo");
    radioInactivo.setBounds(270, 280, 100, 30);
    panel.add(radioInactivo);

    grupoEstado = new ButtonGroup();
    grupoEstado.add(radioActivo);
    grupoEstado.add(radioInactivo);
}

    private void colocarBotones() {
      
          // Boton nuevo
    JButton botonNuevo = new JButton("Nuevo");
    botonNuevo.setBounds(50, 400, 100, 40);
    panel.add(botonNuevo);
    botonNuevo.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            limpiarCampos(); // Limpia los campos al presionar el botón Nuevo
        }
    });
    
    // Configurar imagen para el botón Nuevo
    ImageIcon iconoNuevo = new ImageIcon("src/resources/nuevo.png"); // Ajusta la ruta de la imagen
    botonNuevo.setIcon(iconoNuevo);



       JButton botonGuardar = new JButton("Guardar");
botonGuardar.setBounds(160, 400, 100, 40);
panel.add(botonGuardar);

botonGuardar.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String nombre = campoNombre.getText();
        String apellido = campoApellido.getText();
        String celular = campoCelular.getText();
        String mail = campoMail.getText();
        String titulo = (String) comboTitulo.getSelectedItem();
        String estado = radioActivo.isSelected() ? "Activo" : "Inactivo";

        Conexion conexionBD = new Conexion();
        Connection conexion = conexionBD.conexion();

        String insertQuery = "INSERT INTO profesor (profe_nombre, profe_apellido, profe_celular, profe_mail, profe_titulo, profe_estado) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement preparedStatement = conexion.prepareStatement(insertQuery);
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, apellido);
            preparedStatement.setString(3, celular);
            preparedStatement.setString(4, mail);
            preparedStatement.setString(5, titulo);
            preparedStatement.setString(6, estado);

            preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Registro de profesor insertado con éxito.");
          
            actualizarTablaProfesores();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar el registro del profesor: " + ex.getMessage());
        } finally {
            conexionBD.cerrarConexion(conexion);
        }
    }
});

        JButton botonEliminar = new JButton("Eliminar");
        botonEliminar.setBounds(270, 400, 100, 40);
        panel.add(botonEliminar);
        botonEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para eliminar un profesor
            }
        });

       JButton botonSalir = new JButton("Salir");
botonSalir.setBounds(380, 400, 100, 40);
panel.add(botonSalir);
botonSalir.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
            }
        });
    }
 
    private void guardarProfesor() {
        String nombre = campoNombre.getText();
        String apellido = campoApellido.getText();
        String celular = campoCelular.getText();
        String mail = campoMail.getText();
        String titulo = (String) comboTitulo.getSelectedItem();
        String estado = radioActivo.isSelected() ? "Activo" : "Inactivo";

        // Insertar los datos en la base de datos
        Conexion conexionBD = new Conexion();
        Connection conexion = conexionBD.conexion();

        String insertQuery = "INSERT INTO `profesor` (profe_nombre, profe_apellido, profe_celular, profe_mail, profe_titulo, profe_estado) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = conexion.prepareStatement(insertQuery);
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, apellido);
            preparedStatement.setString(3, celular);
            preparedStatement.setString(4, mail);
            preparedStatement.setString(5, titulo);
            preparedStatement.setString(6, estado);

            preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Registro de profesor insertado con éxito.");
            actualizarTabla();
            limpiarCampos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar el registro del profesor: " + ex.getMessage());
        } finally {
            conexionBD.cerrarConexion(conexion);
        }
    }

     private void actualizarTabla() {
        Conexion conexionBD = new Conexion();
        ResultSet resultSet = conexionBD.obtenerDatosProfesores();

        try {
            modeloTabla.setRowCount(0); // Limpiar los datos actuales en la tabla

            while (resultSet.next()) {
                Object[] fila = {
                    resultSet.getString("profe_codigo"),
                    resultSet.getString("profe_nombre"),
                    resultSet.getString("profe_apellido"),
                    resultSet.getString("profe_celular"),
                    resultSet.getString("profe_mail"),
                    resultSet.getString("profe_titulo"),
                    resultSet.getString("profe_estado")
                };
                modeloTabla.addRow(fila);
            }
        } catch (SQLException ex) {
            System.out.println("Error al obtener los datos de profesores: " + ex.getMessage());
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error al cerrar el ResultSet de profesores: " + ex.getMessage());
            }
        }
    }

     private void limpiarCampos() {
    campoNombre.setText("");
    campoApellido.setText("");
    campoCelular.setText("");
    campoMail.setText("");
    comboTitulo.setSelectedIndex(0);
    radioActivo.setSelected(true);
}
    private void actualizarTablaProfesores() {
    Conexion conexionBD = new Conexion();
    ResultSet resultSet = conexionBD.obtenerDatosProfesores();

    try {
        modeloTablaProfesores.setRowCount(0); // Limpiar los datos actuales en la tabla

        while (resultSet.next()) {
            Object[] fila = {
                resultSet.getString("profe_codigo"),
                resultSet.getString("profe_nombre"),
                resultSet.getString("profe_apellido"),
                resultSet.getString("profe_celular"),
                resultSet.getString("profe_mail"),
                resultSet.getString("profe_titulo"),
                resultSet.getString("profe_estado")
            };
            modeloTablaProfesores.addRow(fila);
        }
    } catch (SQLException ex) {
        System.out.println("Error al obtener los datos de profesores: " + ex.getMessage());
    } finally {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            // Cierra el Statement y la Connection si los usas
        } catch (SQLException ex) {
            System.out.println("Error al cerrar el ResultSet de profesores: " + ex.getMessage());
            }
        }
    }

        }
    
