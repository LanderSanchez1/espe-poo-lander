package juegomemoria;

//importamos las librerias necesarias 
import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import javax.swing.*;

public class JuegoMemoria extends JFrame implements ActionListener{
    
    JPanel panel;
    JLabel matriz [][],etiqueta,etique,nombreju,cronometro,lblfecha,lblhora;
    int mat [][] = new int[4][5];
    int mat2 [][] = new int[4][5];
    Random ran;
    int contador,ban,ban1,annum,anposx,anposy,acnum,acposx,acposy;
    Timer espera, espera2,tiempo;
    int consegund,seg,min;
    int hora,minutos,segundos;
    JButton reiniciar;
    //Thread hilo;

    public JuegoMemoria(){
        this.setTitle("JUEGO DE MEMORIA");
        this.setSize(1100, 740);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        
        //tiempo.start();
        
        //se coloca un panel a la ventana
        panel = new JPanel();
        this.getContentPane().add(panel);
        panel.setLayout(null);
        panel = new JPanel() {
    // Sobrescribimos el método paintComponent para dibujar la imagen de fondo
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Cargamos la imagen de fondo y la dibujamos en el panel
        ImageIcon backgroundImage = new ImageIcon("src/imagenes/b.jpg"); // Elegimos la ruta y el nombre de la imagen
        g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
    }
};
panel.setLayout(null); // para posicionar elementos encima de la imagen de fondo
this.getContentPane().add(panel);

        //proposito de mat2, que las cartas aparescan volteadas
        ran = new Random();
        this.numaleatorios();
        
        //matriz de imagenes
        //este hara una matriz de 4filas por 5columnas donde mostrara imagenes 
        matriz = new JLabel[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = new JLabel();
                matriz[i][j].setSize(matriz[i][j].getWidth(), matriz[i][j].getHeight());
                //aqui la demas espacios a la imagenes para que no salgan pegadas 
                matriz[i][j].setBounds(430+(j*125),40+(i*156), 125, 156);
                //declaramos la imagenes que tiene el los nombres de 1 a 10
                matriz[i][j].setIcon(new ImageIcon("src/imagenes/"+mat2[i][j]+".JPG"));
                //colocamos que la matriz se muestre en pantalla
                matriz[i][j].setVisible(true);
                //aqui se añaden junto con la 0
                panel.add(matriz[i][j],0);
                               
            }           
        }
       
        seg = 0;
        min = 0;        
        
        //este lo colocamos para podermo mostrar el tiempo que 
        //transcurre durante el juego
        tiempo = new Timer (1000, new ActionListener()
        {
          
            public void actionPerformed(ActionEvent e) 
            {
                
                seg++;
                if(seg == 60){
                    min++;
                    seg=0;
                }
                
            //declaramos en una variable cronometro el tiempo que transcurre
            cronometro.setText(min+":"+seg); 
            }});
        
        //declaramos en la variable espera la cual es otro tiempo el cual lo utilizamos 
        //para colocar un tiempo a la hora de que las cartas se voltean 
        consegund = 0;
        espera = new Timer (400, new ActionListener()
        {
          
            public void actionPerformed(ActionEvent e) 
            {
                consegund++;
            }});
        espera.start();
        espera.stop();
        consegund = 0;
        ban=0;
        ban1=0;
        
        //evento de clic en la cartas
        contador = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j].addMouseListener(new MouseAdapter(){
                    @Override
                    public void mousePressed(MouseEvent e){
                        for (int k = 0; k < 4; k++) {
                            for (int l = 0; l < 5; l++) {
                                if(e.getSource() == matriz[k][l]){
                                   // System.out.println(k+" "+l);
                                   
                                   //cuando se da click a la carta esta se volteara
                                   if(mat2[k][l] == 0 && contador !=2){
                                       mat2[k][l] = mat[k][l];
                                       matriz[k][l].setIcon(new ImageIcon("src/imagenes/"+mat2[k][l]+".JPG"));
                                       contador++;
                                       acnum = mat[k][l];
                                       acposx = k;
                                       acposy = l;
                                       if(contador == 1){
                                            annum = mat[k][l];
                                            anposx = k;
                                            anposy = l;
                                       }
                                       
                                       //tiempo que se tarda en dar vuelta
                                       espera2 = new Timer (400, new ActionListener()
                                       {
          
                                        public void actionPerformed(ActionEvent e) {

                                           if(contador == 2 && ban1 == 0){
                                               espera.restart();
                                               ban1=1;
                                            }
                                            if(contador == 2 && consegund == 2){
                                                espera.stop();
                                                consegund = 0;
                                                
                                                //Desaparecen las cartas que son iguales y deja las que aun no se encuentran
                                                if(mat2[acposx][acposy]==mat2[anposx][anposy]){
                                                
                                                    mat2[acposx][acposy] = -1;
                                                    mat2[anposx][anposy] = -1;
                                                    matriz[acposx][acposy].setIcon(new ImageIcon("src/imagenes/"+mat2[acposx][acposy]+".JPG"));
                                                    matriz[anposx][anposy].setIcon(new ImageIcon("src/imagenes/"+mat2[anposx][anposy]+".JPG"));
                                                    contador=0;
                                                    //gano si toda la mat2 es -1
                                                    int acum = 0;
                                                    for (int m = 0; m < 4; m++) {
                                                       for (int n = 0; n < 5; n++) {
                                                          if (mat2[m][n] == -1)
                                                              acum++;
                                                          }
                                                    }
                                                    //cuando no se encuentre ninguna para entonces aparecera
                                                    //un mensaje diciendo que gano y ejecutando automaticamente
                                                    //la ventana Recordjugador
                                                       if(acum == 20){
                                                           JOptionPane.showMessageDialog(panel, "FELICIDADES HAS GANDO");
                                                           
                                                            Recordjugador ventana = new Recordjugador();
                                                            ventana.setVisible(true);
                                                            tiempo.stop();
                                                            ventana.lbltiempoju.setText(min+":"+seg);
                                                            ventana.lblnombrejuga.setText(nombreju.getText());
                                                            ventana.lblhorainicio.setText(lblhora.getText());
                                                            ventana.lblfechaju.setText(lblfecha.getText());                                                         
                                                       }
                                                }
                                                for (int m = 0; m < 4; m++) {
                                                    for (int n = 0; n < 5; n++) {
                                                        //se coloca el valor -1 a las cartas pares
                                                        if(mat2[m][n]!=0 && mat2[m][n]!=-1){
                                                            mat2[m][n] = 0;
                                                            matriz[m][n].setIcon(new ImageIcon("src/imagenes/"+mat2[m][n]+".JPG"));
                                                            contador=0;
                                                        }
                                                        System.out.println("salio");
                                                    }
                                                }
                                                espera2.stop();
                                                ban1=0;
                                            }
                                        }});
                                       if(ban == 0)
                                           espera2.start();
                                           ban = 1;
                                       if(contador == 2)
                                               espera2.restart();
                                   }    
                                }                                
                            }                            
                        }
                    }                   
                });               
            }            
        }             
        componentes();
        lblfecha.setText(fecha());
        hora();
        //hilo = new Thread(this);  
    }   
    //este metodo va obtener la hora actual del despositivo
    private void hora(){ 
      Calendar calendario = new GregorianCalendar();
      hora= calendario.get(Calendar.HOUR_OF_DAY);
      minutos = calendario.get(Calendar.MINUTE);
      segundos = calendario.get(Calendar.SECOND);
      lblhora.setText(hora + ":" + minutos + ":" + segundos);   
    } 
    
    // este metodo obtiene la fecha del dia mediante el dispositivo
    private String fecha(){
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);       
    }   
    //este metodo se hace para obtener aleatoriamente las cartas
    //cada vez que se inicie el juego las cartas apareceran en 
    //diferentes lugares.
    //tambien para obtener dos veces la misma carta
    private void numaleatorios(){
        int acumulador = 0;
         for (int i = 0; i < 4; i++) 
            for (int j = 0; j < 5; j++){
                mat[i][j] = 0;
              //  mat2[i][j] = 0;
                
            }           
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                mat[i][j] = ran.nextInt(10)+1;
                
                do{
                    acumulador = 0;
                    for (int k = 0; k < 4; k++) {
                        for (int l = 0; l < 5; l++) {
                             if(mat[i][j]== mat[k][l]){
                                acumulador +=1;
                            }
                        }
                    }
                //esto se coloca para que solo se duplique dos veces la carta
                if(acumulador == 3){
                    mat[i][j] = ran.nextInt(10)+1;
                }
                }while(acumulador == 3); 
            }   
        }                              
    }           
   //estos son los componentes del programa 
    private void componentes(){
 etiqueta = new JLabel("<html><b>NOMBRE DEL JUGADOR:</b></html>");
etiqueta.setBounds(40, 150, 200, 30);
etiqueta.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 15));
panel.add(etiqueta);

nombreju = new JLabel();
nombreju.setBounds(240, 150, 150, 30);
nombreju.setFont(new Font("Times New Roman", Font.BOLD, 20));
panel.add(nombreju);

etiqueta = new JLabel("<html><b>TIEMPO:</b></html>");
etiqueta.setBounds(40, 210, 200, 30);
etiqueta.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 15));
panel.add(etiqueta);

cronometro = new JLabel();
cronometro.setBounds(240, 210, 150, 30);
cronometro.setFont(new Font("Times New Roman", Font.BOLD, 20));
panel.add(cronometro);

etiqueta = new JLabel("<html><b>HORA DE INICIO:</b></html>");
etiqueta.setBounds(40, 250, 200, 30);
etiqueta.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 15));
panel.add(etiqueta);

lblhora = new JLabel();
lblhora.setBounds(240, 250, 150, 30);
lblhora.setFont(new Font("Times New Roman", Font.BOLD, 20));
panel.add(lblhora);

etiqueta = new JLabel("<html><b>FECHA:</b></html>");
etiqueta.setBounds(40, 290, 200, 30);
etiqueta.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 15));
panel.add(etiqueta);

lblfecha = new JLabel();
lblfecha.setBounds(240, 290, 150, 30);
lblfecha.setFont(new Font("Times New Roman", Font.BOLD, 20));
panel.add(lblfecha);

// Este boton reiniciara el juego
reiniciar = new JButton("REINICIAR");
reiniciar.setBounds(120, 520, 120, 40); // Ajuste para que esté más abajo
reiniciar.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 15));
reiniciar.addActionListener(this);
panel.add(reiniciar);
    }       
    //estos son los eventos de accion
    @Override
    public void actionPerformed(ActionEvent e) {
        
        //se coloca que el boton reinicia mostrara un mensaje preguntando si esta segurdo de querea hacerlo
        //si es si, se reiniciara desde el inicio y sino pues seguira en la partida
         if(e.getSource() == reiniciar){
              if (JOptionPane.showConfirmDialog(rootPane, "¿Seguro deseas reiniciar el juego?\n Al hacerlo, serás redirigido al menú inicial y cualquier progreso actual se perderá.",
                "Reinicio de Juego", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE) == JOptionPane.YES_OPTION)
        {
            menuinicio ventana = new menuinicio();
            ventana.setVisible(true);
            this.setVisible(false);
        }
        else{
                setDefaultCloseOperation(0);
        } } } }
