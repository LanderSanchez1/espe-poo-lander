/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examenprimerparcial_galarzajohn;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author johng
 */
public class ExamenPrimerParcial_GalarzaJohn {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Producto producto1 = new Producto();
        Proveedor proveedor = new Proveedor();
        ArrayList<String> pedidoProducto = new ArrayList<>();
        ArrayList<Float> pedidoPrecio = new ArrayList<>();
        ArrayList<String> pedidoProveedor = new ArrayList<>();
        ArrayList<Float> pedidoUnidades = new ArrayList<>();
        int opc,indice;
        float precioUni,unidades;
        String producto,proveedores;
        do{
            System.out.println("=====Menu=====");
            System.out.println("1. Productos");
            System.out.println("2. Proveedores");
            System.out.println("3. Nuevos pedidos");
            System.out.println("4. Pedido mayor");
            System.out.println("5. Total facturado");
            System.out.println("6. Salir");
            opc = in.nextInt();
            in.nextLine();
            switch(opc){
                case 1:
                   producto1.ingresarProducto();
                   break;
                case 2:
                    proveedor.ingresarProveedor();
                    break;
                case 3:
                    for (int i=0;i<2;i++){
                    System.out.println("Ingrese el nombre del producto a pedir "+(i+1));
                    producto=in.nextLine();
                    indice=producto1.productos.indexOf(producto);
                    if(indice!=-1){
                        pedidoProducto.add(producto);
                        System.out.println("Producto "+(i+1)+" registrado");
                        System.out.println("Ingrese el nombre del proveedor: ");
                        proveedores=in.nextLine();
                        indice=proveedor.proveedor.indexOf(proveedores);
                        if (indice!=-1){
                            pedidoProveedor.add(proveedores);
                            System.out.println("Proveedor "+(i+1)+" registrado");
                            System.out.println("Ingresa el precio unitario de "+producto);
                            precioUni=in.nextFloat();
                            pedidoPrecio.add(precioUni);

                            System.out.println("Ingrese las unidades ");
                            unidades=in.nextInt();
                            pedidoUnidades.add(unidades);
                        }else{
                            System.out.println("Proveedor no encontrado");
                        }
                    }else{
                        System.out.println("Producto no encontrado");
                    }
                    in.nextLine();
                }
                    break;
                case 4:
                    System.out.println("El pedido con mas unidades es: ");
                    if(pedidoUnidades.get(0)>=pedidoUnidades.get(1)){
                        System.out.println("Primer pedido");
                        System.out.println("Producto: "+pedidoProducto.get(0));
                        System.out.println("Proveedor: "+pedidoProveedor.get(0));
                        System.out.println("Precio unitario: "+pedidoPrecio.get(0));
                        System.out.println("Unidades: "+pedidoUnidades.get(0));
                    }else{
                        System.out.println("Segundo pedido");
                        System.out.println("Producto: "+pedidoProducto.get(1));
                        System.out.println("Proveedor: "+pedidoProveedor.get(1));
                        System.out.println("Precio unitario: "+pedidoPrecio.get(1));
                        System.out.println("Unidades: "+pedidoUnidades.get(1));
                    }
                    break;
                case 5:
                    System.out.println("======Facturacion======");
                    System.out.println("Descripcion:");
                    for (String e : pedidoProducto) {
                        indice = pedidoProducto.indexOf(e);
                        System.out.println("Producto: "+ e + "     PrecioUni: " + pedidoPrecio.get(indice) + "    Unidades: " + pedidoUnidades.get(indice));
                    }
                    System.out.println("Precio total: "+(pedidoPrecio.get(0)*pedidoUnidades.get(0)+pedidoPrecio.get(1)*pedidoUnidades.get(1))+"$");
            }

        }while(opc!=6);
    }
}
