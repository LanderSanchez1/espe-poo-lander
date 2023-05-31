package Evaluacion1_LS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaPedidos {
    private List<Pedido> pedidos;

    public SistemaPedidos() {
        pedidos = new ArrayList<>();
    }

    public void agregarProducto(String producto, String proveedor, double precioUnitario, int unidades) {
    	// Crear un objeto Pedido 
        Pedido pedido = new Pedido(producto, proveedor, precioUnitario, unidades);
        // Agregar el pedido a la lista de pedidos
        pedidos.add(pedido);
        System.out.println("Pedido agregado exitosamente.");
    }

    public void agregarProveedor(String proveedor) {
    	
        
        System.out.println("Proveedor agregado exitosamente.");
    }

    public Pedido obtenerPedidoMayor() {
        Pedido pedidoMayor = null;
        int maxUnidades = 0;

        for (Pedido pedido : pedidos) {
        	// Verificar si el número de unidades del pedido actual es mayor al máximo registrado
            if (pedido.getUnidades() > maxUnidades) {
                maxUnidades = pedido.getUnidades();
                pedidoMayor = pedido;
            }
        }

        return pedidoMayor;
    }

    public double calcularTotalFacturado() {
        double totalFacturado = 0;

        for (Pedido pedido : pedidos) {
        	// Calcular el monto facturado para cada pedido y sumarlo al total
            totalFacturado += pedido.getPrecioUnitario() * pedido.getUnidades();
        }

        return totalFacturado;
    }

    public static void main(String[] args) {
        SistemaPedidos sistemaPedidos = new SistemaPedidos();
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Productos");
            System.out.println("2. Proveedores");
            System.out.println("3. Nuevo pedido");
            System.out.println("4. Pedido mayor");
            System.out.println("5. Total facturado");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                   
                    break;
                case 2:
                   
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del producto: ");
                    String producto = scanner.next();
                    System.out.print("Ingrese el proveedor: ");
                    String proveedor = scanner.next();
                    System.out.print("Ingrese el precio unitario: ");
                    double precioUnitario = scanner.nextDouble();
                    System.out.print("Ingrese la cantidad de unidades: ");
                    int unidades = scanner.nextInt();

                    sistemaPedidos.agregarProducto(producto, proveedor, precioUnitario, unidades);
                    		break;
	                case 4:
	                    Pedido pedidoMayor = sistemaPedidos.obtenerPedidoMayor();
	                    if (pedidoMayor != null) {
	                    System.out.println("Pedido con más unidades:");
	                    System.out.println("Producto: " + pedidoMayor.getProducto());
	                    System.out.println("Proveedor: " + pedidoMayor.getProveedor());
	                    System.out.println("Precio unitario: " + pedidoMayor.getPrecioUnitario());
	                    System.out.println("Unidades: " + pedidoMayor.getUnidades());
	                    } else {
	                    System.out.println("No se encontraron pedidos.");
	                    }
	                    break;
	                    case 5:
	                    double totalFacturado = sistemaPedidos.calcularTotalFacturado();
	                    System.out.println("Total facturado: $" + totalFacturado);
	                    break;
	                    case 6:
	                    System.out.println("Saliendo del programa...");
	                    break;
	                    default:
	                    System.out.println("Opción inválida. Seleccione una opción válida.");
	                    break;
	                    }
	                    } while (opcion != 6);
    
	    scanner.close();
	}
}
