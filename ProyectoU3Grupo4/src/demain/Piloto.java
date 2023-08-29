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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Michael Riera/ Lander Sanchez
 */
public class Piloto extends Empleado {
JLabel lblNombre, lblEdad, lblFecha_ingreso, lblSalario_base, lblHoras_vuelo;
     JTable tablapiloto;
    private int horasVuelo;

    public Piloto(String nombre, int edad, String fechaIngreso, double salarioBase, int horasVuelo) {
        super(nombre, edad, fechaIngreso, salarioBase);
        this.horasVuelo = horasVuelo;
    }
private void guardarpilotoEnBD() {
        Conexion con = new Conexion();
        Connection conexion = con.conexion();

        String nombre = lblNombre.getText();
        String edad = lblEdad.getText();
        String Fecha_ingreso = lblFecha_ingreso.getText();
        String Salario_base = lblSalario_base.getText();
        String Categoria = lblHoras_vuelo.getText();

        try {
            String query = "INSERT INTO piloto (nombre, edad, Fecha_ingreso, Salario_base, Categoria) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = conexion.prepareStatement(query);
            statement.setString(1, nombre);
            statement.setString(2, edad);
            statement.setString(3, Fecha_ingreso);
            statement.setString(3, Salario_base);
            statement.setString(3, Categoria);
            statement.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "guardado en la base de datos");
            
            statement.close();
            conexion.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar: " + e.getMessage());
        }
    }
    // Método para mostrar los puntajes en una tabla
    private void mostrarpilotoEnTabla() {
        Conexion con = new Conexion();
        Connection conexion = con.conexion();

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Edad");
        modelo.addColumn("Fecha_ingreso");
        modelo.addColumn("Salario_base");
        modelo.addColumn("Horas_vuelo");

        try {
            String query = "SELECT * FROM piloto";
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
            tablapiloto.setModel(modelo);
            statement.close();
            conexion.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar: " + e.getMessage());
        }
    }
    @Override
    public double calcularSalarioTotal() {
        return salarioBase + (horasVuelo * 100);
    }

    public int getHorasVuelo() {
        return horasVuelo;
    }

    public void setHorasVuelo(int horasVuelo) {
        this.horasVuelo = horasVuelo;
    }

}
