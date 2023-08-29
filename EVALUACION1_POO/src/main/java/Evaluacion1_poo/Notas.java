package Evaluacion1_poo;

import java.util.Scanner;

public class Notas {
    Scanner teclado = new Scanner(System.in);
    private String nombre;
    private String apellido;
    private float notales;
    private int notaT;
    private String aprob;

    public String getNombre() { //metodo para el nombre
        System.out.println("Ingrese Nombre: ");
        nombre = teclado.nextLine();
        return nombre;
    }

    public void setNombre(String nombre) { 
        this.nombre = nombre;
    }

    public String getApellido() { //metodo Apellido
        System.out.println("Ingrese apellido: ");
        apellido = teclado.nextLine();
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void getNotas() { //Registro de Notas
        System.out.println("Cuantas notas desea agregar: ");
        notaT = teclado.nextInt();
        float sumaNotas = 0;
        for (int i = 1; i <= notaT; i++) {
            System.out.println("Ingrese la calificacion #" + i);
            float nota = teclado.nextFloat();
            sumaNotas += nota;
        }
        notales = sumaNotas;
        System.out.println("La suma de sus calificaciones es: " + notales);
    }

    public float getProm() { //Calculo del promedio de las notas registradas
        System.out.println("Su promedio es de: " + (notales / notaT));
        return notales / notaT;
    }
    public String getAprob(){ //Verificar si aprobo o Reprobo
        if (notales/notaT >= 14){
            System.out.println("Sr/a " + apellido + " Ha Aprobado");
        }else{
            System.out.println("Sr/a " + apellido + " Ha Reprobado");
        }
        return aprob;
    }
}
