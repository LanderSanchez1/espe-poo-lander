package poo_u2_tutoria_polimorfismo;

import java.util.Scanner;

public class POO_U2_TUTORIA_POLIMORFISMO {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opc,edad;
        String nombre,disiplina,sexo,prueba;
        System.out.println("ESCOJA UNA OPCION"
            +"/n1. Aletismo"
            +"/n2. Natacion");
        opc=in.nextInt();
        in.nextLine();
        switch(opc){
            case 1:
                System.out.println("INGRESE DATOS");
                System.out.println("NOMBRE: ");
                nombre = in.nextLine();
                System.out.println("EDAD: ");
                edad = in.nextInt();
                 in.nextLine();
                System.out.println("Disiplina: ");
                disiplina = in.nextLine();
                System.out.println("Sexo: ");
                sexo = in.nextLine();
                System.out.println("Prueba: ");
                prueba = in.nextLine();
                Atletismo atle=new Atletismo(nombre,edad,disiplina,sexo,prueba);
                atle.entrenamiento();
                atle.mostrarDatos();
                break;
            case 2:
                System.out.println("INGRESE DATOS");
                System.out.println("NOMBRE: ");
                nombre = in.nextLine();
                System.out.println("EDAD: ");
                edad = in.nextInt();
                System.out.println("Disiplina: ");
                disiplina = in.nextLine();
                System.out.println("Sexo: ");
                sexo = in.nextLine();
                System.out.println("Estilo: ");
                prueba = in.nextLine();
                Natacion nata=new Natacion(nombre,edad,disiplina,sexo,prueba);
                nata.entrenamiento();
                nata.mostrarDatos();
                break;                
        }
        
    }
    
}
