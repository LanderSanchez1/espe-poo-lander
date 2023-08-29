/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Poo_leerficheros;
import java.io.*;

/**
 *
 * @author Lander Sanchez
 */
public class POO_LeerFicheros {

    public static void main(String[] args) {
        try(BufferedReader br=new BufferedReader(new FileReader("C:\\archivos de programacion\\hola.txt"))){
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\archivos de programacion\\hola.txt"));
            
            bw.write("Esto es una palabra usando Buffered");
            bw.newLine();
            bw.write("Seguimos usando Buffered");
            bw.newLine();
            bw.write("Hola a todos");
            
            bw.flush();
            
            
            String linea=br.readLine();
            while(linea!=null){
                System.out.println(linea);
                linea=br.readLine();
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
