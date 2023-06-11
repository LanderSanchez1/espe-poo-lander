package poo_09_menu_met_get_set;
//Lander Sanchez
import java.util.Scanner;
public class POO_09_MENU_MET_GET_SET {

  
    public static void main(String[] args) {   
        
      //Este programa permite solicitar al usuario datos personales
      //los coloca en objetos de la clase persona y muestra en pantalla
      
      Scanner teclado=new Scanner(System.in);
      //el objeto teclado de la clase Scanner permite el usuario ingresar
      //informacion desde el teclado
      //creamos 3 variables auxiliares que recibiran los datos 
      //ingresados por el usuario via teclado
      String nombre, apellido;
      int edad;
      System.out.print("Ingrese su nombre:");
      nombre=teclado.nextLine();//se almacena en la variable nombre lo que 
                               //el usuario ha digitado
      System.out.println("Ingrese su apellido");
      apellido=teclado.nextLine();//nextLine()recupera la informacion ingresada
                                  //por teclado en formato String
      System.out.println("Ingrese su edad");
      edad=teclado.nextInt();//nextInt() recupera la informacion ingresada
                             //por teclado en formato int
                             
      //creamos un objeto de la clase Persona y asignamos 
      //a sus atributos los valores que se han recogido por teclado
      Persona persona= new Persona(); 
      persona.setNombre(nombre);
      persona.setApellido(apellido);
      persona.setEdad(edad);
      
      //mostrar los valores almacenados en cada atributo
      
      System.out.println("Datos de la persona");
      System.out.println("Nombre:"+persona.getNombre());
      System.out.println("Apellido: "+persona.getApellido());
      System.out.println("Edad: "+persona.getEdad());
      
    
    }
    
}
