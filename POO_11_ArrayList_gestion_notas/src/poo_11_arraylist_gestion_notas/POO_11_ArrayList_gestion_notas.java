
package poo_11_arraylist_gestion_notas;

import java.util.Scanner;

/**
 *
 * @author Lander Sanchez
 */

public class POO_11_ArrayList_gestion_notas {

    
    public static void main(String[] args) {
        // instanciamos el objeto 
        GestionNotas gnotas=new GestionNotas();
        int op; // opcione elegida por el usuario
        Scanner sc=new Scanner(System.in);
        double nota;// variable para ir guardando la nota
        //generamos el menu
        // 
        do{
            // presentamos menu
            System.out.println("1.- Añadir Nota");
            System.out.println("2.- Ver Media");
            System.out.println("3.- Ver Aprobados");
            System.out.println("4.- Salir");
            op=Integer.parseInt(sc.nextLine());
            switch(op){
                case 1:
                    System.out.println("Introduce nota");
                    nota=Double.parseDouble(sc.nextLine());
                    gnotas.guardarNota(nota);
                    break;
                case 2:
                    System.out.println("Media actual"+gnotas.media());
                    break;
                case 3:
                    System.out.println("Aprobados"+gnotas.aprobados());
                    break;
                    
            }
            
        }while(op!=4);
        
    }
    
}
