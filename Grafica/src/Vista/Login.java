/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JPanel panel;
    private JTextField campoUsuario;
    private JPasswordField campoContraseña;
    private MongoClient mongoClient;

    public Login() {
        this.setSize(400, 250);
        setTitle("Inicio de Sesión");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Conexión a la base de datos MongoDB
        mongoClient = MongoClients.create("mongodb://localhost:27017");

        iniciarComponentes();
    }

    private void iniciarComponentes() {
        colocarPanel();
        colocarCampos();
        colocarBotones();
    }

    private void colocarPanel() {
        panel = new JPanel();
        panel.setBackground(Color.GRAY);
        this.getContentPane().add(panel);
        panel.setLayout(null);
    }

    private void colocarCampos() {
        JLabel labelUsuario = new JLabel("Usuario");
        labelUsuario.setBounds(50, 50, 100, 30);
        panel.add(labelUsuario);

        campoUsuario = new JTextField();
        campoUsuario.setBounds(150, 50, 180, 30);
        panel.add(campoUsuario);

        JLabel labelContraseña = new JLabel("Contraseña");
        labelContraseña.setBounds(50, 100, 100, 30);
        panel.add(labelContraseña);

        campoContraseña = new JPasswordField();
        campoContraseña.setBounds(150, 100, 180, 30);
        panel.add(campoContraseña);
    }

    private void colocarBotones() {
        JButton botonIngresar = new JButton("Ingresar");
        botonIngresar.setBounds(150, 150, 100, 40);
        panel.add(botonIngresar);

        botonIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirFormularioRegistro(false);
            }
        });

        JButton botonRegistrar = new JButton("Registrar");
        botonRegistrar.setBounds(260, 150, 100, 40);
        panel.add(botonRegistrar);

        botonRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarUsuario();
            }
        });
    }

    private void abrirFormularioRegistro(boolean isRegistro) {
        String usuario = campoUsuario.getText();
        String contraseña = new String(campoContraseña.getPassword());

        if (validarCredenciales(usuario, contraseña)) {
            JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso.");
            Registro ventanaRegistro = new Registro(true);
            ventanaRegistro.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Credenciales inválidas. Intente nuevamente.");
        }
    }

    private void registrarUsuario() {
        String usuario = campoUsuario.getText();
        String contraseña = new String(campoContraseña.getPassword());

        if (usuario.isEmpty() || contraseña.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un usuario y una contraseña válidos.");
            return;
        }

        MongoDatabase database = mongoClient.getDatabase("testdb"); 
        MongoCollection<Document> collection = database.getCollection("items"); 

        Document query = new Document("User", usuario);
        if (collection.countDocuments(query) > 0) {
            JOptionPane.showMessageDialog(null, "El usuario ya está registrado.");
            return;
        }

        Document nuevoUsuario = new Document("User", usuario)
            .append("Pass", contraseña);

        collection.insertOne(nuevoUsuario);

        JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente.");
        abrirFormularioRegistro(true);
    }

    private boolean validarCredenciales(String usuario, String contraseña) {
        try {
            MongoDatabase database = mongoClient.getDatabase("testdb"); 
            MongoCollection<Document> collection = database.getCollection("items"); 
            
            Document query = new Document("User", usuario).append("Pass", contraseña);
            return collection.countDocuments(query) > 0;
        } catch (Exception e) {
            System.out.println("Error al validar las credenciales: " + e.getMessage());
            return false;
        }
    }

  
       
    }
