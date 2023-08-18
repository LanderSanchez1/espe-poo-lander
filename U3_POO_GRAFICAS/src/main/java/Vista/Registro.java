package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class Registro extends JFrame {

    public JPanel panel;
    private ButtonGroup estadoGroup;

    public Registro() {
        this.setSize(600, 600);
        setTitle("REGISTRO");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        colocarPanel();
        colocarEtiquetas();
        colocarBotones();
        colocarCajatexto();
        colocarTabla();
    }

    private void colocarPanel() {
        panel = new JPanel();
        panel.setBackground(Color.GREEN);
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    public void colocarEtiquetas() {
        JLabel labelEstudiante = new JLabel("Estudiante:");
        labelEstudiante.setBounds(30, 10, 100, 30);
        panel.add(labelEstudiante);

        JLabel[] etiquetas = {
            new JLabel("Código:"),
            new JLabel("Cedula:"),
            new JLabel("Apellido:"),
            new JLabel("Nombre:"),
            new JLabel("Mail:"),
            new JLabel("Teléfono:"),
            new JLabel("Dirección:"),
            new JLabel("Materia:")
        };

        for (int i = 0; i < etiquetas.length; i++) {
            etiquetas[i].setBounds(30, 50 + i * 40, 100, 30);
            panel.add(etiquetas[i]);
        }

        JLabel labelEstado = new JLabel("Estado:");
        labelEstado.setBounds(30, 410, 100, 30);
        panel.add(labelEstado);

        estadoGroup = new ButtonGroup();
        JRadioButton radioButtonActivo = new JRadioButton("Activo");
        radioButtonActivo.setBounds(140, 410, 80, 30);
        panel.add(radioButtonActivo);
        estadoGroup.add(radioButtonActivo);

        JRadioButton radioButtonInactivo = new JRadioButton("Inactivo");
        radioButtonInactivo.setBounds(220, 410, 80, 30);
        panel.add(radioButtonInactivo);
        estadoGroup.add(radioButtonInactivo);
    }

    public void colocarBotones() {
        String[] botonesText = {"Nuevo", "Guardar", "Editar", "Eliminar", "Salir"};
        for (int i = 0; i < botonesText.length; i++) {
            JButton boton = new JButton(botonesText[i]);
            boton.setBounds(30 + i * 100, 460, 90, 30);
            panel.add(boton);
        }
    }

    public void colocarCajatexto() {
        JTextField cajaTextoCodigo = new JTextField();
        cajaTextoCodigo.setBounds(140, 50, 200, 30);
        panel.add(cajaTextoCodigo);

        JTextField[] cajasTexto = new JTextField[5];
        for (int i = 0; i < cajasTexto.length; i++) {
            cajasTexto[i] = new JTextField();
            cajasTexto[i].setBounds(140, 90 + i * 40, 200, 30);
            panel.add(cajasTexto[i]);
        }

        String[] opcionesMateria = {"POO", "Computacion digital", "Edo", "ingles"};
        JComboBox<String> comboBoxMateria = new JComboBox<>(opcionesMateria);
        comboBoxMateria.setBounds(140, 330, 200, 30);
        panel.add(comboBoxMateria);
    }

    public void colocarAreaTexto() {
        JTextArea textarea1 = new JTextArea();
        textarea1.setBounds(140, 450, 200, 60);
        panel.add(textarea1);

        JScrollPane barra = new JScrollPane(textarea1);
        barra.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        barra.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barra.setBounds(140, 450, 200, 60);
        panel.add(barra);
    }

    private void colocarTabla() {
        String[] columnNames = {"Codigo", "Cedula", "Apellido", "Nombre", "Mail", "Telefono", "Direccion", "Materia", "Estado"};

        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        JTable tabla = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(tabla);
        scrollPane.setBounds(400, 200, 500, 150);
        panel.add(scrollPane);
    }
}


