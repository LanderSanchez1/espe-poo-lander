/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demain;
import Control.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Michael Riera/ Lander Sanchez
 */
public class Azafata extends Empleado {
    private String categoria;
JLabel lblNombre, lblEdad, lblFecha_ingreso, lblSalario_base, lblCategoria;
     JTable tablaazafata;
    public Azafata(String nombre, int edad, String fechaIngreso, double salarioBase, String categoria) {
        super(nombre, edad, fechaIngreso, salarioBase);
        this.categoria = categoria;
    }
private void guardarazafataEnBD() {
    
        Conexion con = new Conexion();
        Connection conexion = con.conexion();

        String nombre = lblNombre.getText();
        String edad = lblEdad.getText();
        String Fecha_ingreso = lblFecha_ingreso.getText();
        String Salario_base = lblSalario_base.getText();
        String Categoria = lblCategoria.getText();

        try {
            String query = "INSERT INTO azafata (Nombre, Edad, Fecha_ingreso, Salario_base, Categoria) VALUES (?, ?, ?,?, ?)";
            PreparedStatement statement = conexion.prepareStatement(query);
            statement.setString(1, nombre);
            statement.setString(2, edad);
            statement.setString(3, Fecha_ingreso);
            statement.setString(3, Salario_base);
            statement.setString(3, Categoria);
            statement.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Guardado en la base de datos");
            
            statement.close();
            conexion.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar : " + e.getMessage());
        }
    }
    // Método para mostrar los puntajes en una tabla
    private void mostrarazafataTabla() {
        Conexion con = new Conexion();
        Connection conexion = con.conexion();

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Edad");
        modelo.addColumn("Fecha_ingreso");
        modelo.addColumn("Salario_base");
        modelo.addColumn("Categoria");   
        try {
            String query = "SELECT * FROM azafata";
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                Object[] fila = {
                    resultSet.getInt("id"),
                    resultSet.getString("nombre"),
                    resultSet.getString("Edad"),
                    resultSet.getString("Fecha_ingreso"),
                    resultSet.getString("Salario_base"),
                    resultSet.getString("Categoria")
                };
                modelo.addRow(fila);
            }          
            tablaazafata.setModel(modelo);
            statement.close();
            conexion.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar: " + e.getMessage());
        }
    }
    @Override
    public double calcularSalarioTotal() {
        // Calcula el salario total de la azafata basado en el salario base y la
        // categoría de azafata
        if (categoria.equals("Primera clase")) {
            return salarioBase * 2;
        } else {
            return salarioBase;
        }
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
