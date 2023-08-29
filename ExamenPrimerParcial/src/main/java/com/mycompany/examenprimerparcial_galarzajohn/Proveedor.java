/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenprimerparcial_galarzajohn;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author johng
 */
public class Proveedor {
    Scanner in = new Scanner(System.in);
    ArrayList<String> proveedor = new ArrayList<>();
    String NombreProveedor;
    public void ingresarProveedor(){
        System.out.println("Ingrese 2 proveedores: ");
        for(int i=0;i<2;i++){
            System.out.println("Ingrese el proveedor "+(i+1));
            NombreProveedor=in.nextLine();
            proveedor.add(NombreProveedor);
            System.out.println(proveedor.get(i));
        }
    }
}
