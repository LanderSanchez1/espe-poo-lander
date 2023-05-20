/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica_clases_laboratorio_landersanchez;

/**
 *
 * @author User
 */
public class Practica_Clases_Laboratorio_LanderSanchez {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Gato gato1 = new Gato();
        gato1.Nombre="Garfield";
        gato1.Color="Naranja";
        gato1.Edad="5";
        gato1.Sexo="Macho";
        gato1.Peso="5kg";

        Gato gato2 = new Gato();
        gato2.Nombre="Tom";
        gato2.Color="Blanco";
        gato2.Edad="4";
        gato2.Sexo="Macho";
        gato2.Peso="5kg";
        
        Carro carro1 = new Carro();
        carro1.Marca="Hyundai";
        carro1.Color="Negro";
        carro1.Precio="30000";
        carro1.Calidad="Buena";
        carro1.Tamaño="Grande";
        
        Carro carro2 = new Carro();
        carro2.Marca="Toyota";
        carro2.Color="Gris";
        carro2.Precio="25000";
        carro2.Calidad="Buena";
        carro2.Tamaño="Mediano";
        
        Laptop laptop1 = new Laptop();
        laptop1.Marca="Acer";
        laptop1.Peso="2kg";
        laptop1.Precio="1100";
        laptop1.Color="Negro";
        laptop1.Estado="Nueva";
        
        Laptop laptop2 = new Laptop();
        laptop2.Marca="Acer";
        laptop2.Peso="2kg";
        laptop2.Precio="1100";
        laptop2.Color="Negro";
        laptop2.Estado="Nueva";
        
        System.out.println("Gato 1: ");
        System.out.println(gato1.Nombre);
        System.out.println(gato1.Color);
        System.out.println(gato1.Edad);
        System.out.println(gato1.Sexo);
        System.out.println(gato1.Peso);
        System.out.println("");
        System.out.println("Gato 2: ");
        System.out.println(gato2.Nombre);
        System.out.println(gato2.Color);
        System.out.println(gato2.Edad);
        System.out.println(gato2.Sexo);
        System.out.println(gato2.Peso);
        System.out.println("");
        System.out.println("Carro 1: ");
        System.out.println(carro1.Marca);
        System.out.println(carro1.Color);
        System.out.println(carro1.Precio);
        System.out.println(carro1.Calidad);
        System.out.println(carro1.Tamaño);
        System.out.println("");
        System.out.println("Carro 2: ");
        System.out.println(carro2.Marca);
        System.out.println(carro2.Color);
        System.out.println(carro2.Precio);
        System.out.println(carro2.Calidad);
        System.out.println(carro2.Tamaño);
        System.out.println("");
        System.out.println("Laptop 1: ");
        System.out.println(laptop1.Marca);
        System.out.println(laptop1.Peso);
        System.out.println(laptop1.Precio);
        System.out.println(laptop1.Color);
        System.out.println(laptop1.Estado);
        System.out.println("");
        System.out.println("Laptop 2: ");
        System.out.println(laptop2.Marca);
        System.out.println(laptop2.Peso);
        System.out.println(laptop2.Precio);
        System.out.println(laptop2.Color);
        System.out.println(laptop2.Estado);                                     
    }
}
