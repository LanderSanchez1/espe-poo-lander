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
public class Producto {
    Scanner in = new Scanner(System.in);
    ArrayList<String> productos = new ArrayList<>();
    ArrayList<Float> precio = new ArrayList<>();
    String NombreProducto;
    float precioProducto;
    public void ingresarProducto(){
        System.out.println("Ingrese 4 productos: ");
        for(int i=0;i<4;i++){
            System.out.println("Ingrese el producto "+(i+1));
            NombreProducto=in.nextLine();
            productos.add(NombreProducto);
            
        }
    }
  
    
}
