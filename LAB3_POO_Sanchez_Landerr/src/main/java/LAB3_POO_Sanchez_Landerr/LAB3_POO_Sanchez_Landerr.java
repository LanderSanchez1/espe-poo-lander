package LAB3_POO_Sanchez_Landerr;
import java.util.Scanner;

public class LAB3_POO_Sanchez_Landerr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedidos de producto estandar
        System.out.println("Ingrese los datos del Producto Estandar 1:");
        System.out.print("Nombre: ");
        String nombreProductoEstandar1 = scanner.nextLine();
        System.out.print("Precio: ");
        double precioProductoEstandar1 = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Seccion: ");
        String seccionProductoEstandar1 = scanner.nextLine();
        ProductoEstandar productoEstandar1 = new ProductoEstandar(nombreProductoEstandar1, precioProductoEstandar1, seccionProductoEstandar1);

        System.out.println("Ingrese los datos del Producto Estandar 2:");
        System.out.print("Nombre: ");
        String nombreProductoEstandar2 = scanner.nextLine();
        System.out.print("Precio: ");
        double precioProductoEstandar2 = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Sección: ");
        String seccionProductoEstandar2 = scanner.nextLine();
        ProductoEstandar productoEstandar2 = new ProductoEstandar(nombreProductoEstandar2, precioProductoEstandar2, seccionProductoEstandar2);

        // Pedidos de productos ofertados
        System.out.println("Ingrese los datos del Producto Ofertado 1:");
        System.out.print("Nombre: ");
        String nombreProductoOfertado1 = scanner.nextLine();
        System.out.print("Precio: ");
        double precioProductoOfertado1 = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Días: ");
        int diasProductoOfertado1 = scanner.nextInt();
        scanner.nextLine(); 
        ProductoOfertado productoOfertado1 = new ProductoOfertado(nombreProductoOfertado1, precioProductoOfertado1, diasProductoOfertado1);

        System.out.println("Ingrese los datos del Producto Ofertado 2:");
        System.out.print("Nombre: ");
        String nombreProductoOfertado2 = scanner.nextLine();
        System.out.print("Precio: ");
        double precioProductoOfertado2 = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Días: ");
        int diasProductoOfertado2 = scanner.nextInt();
        scanner.nextLine(); 
        ProductoOfertado productoOfertado2 = new ProductoOfertado(nombreProductoOfertado2, precioProductoOfertado2, diasProductoOfertado2);

        System.out.println("Ingrese los datos del Producto Ofertado 3:");
        System.out.print("Nombre: ");
        String nombreProductoOfertado3 = scanner.nextLine();
        System.out.print("Precio: ");
        double precioProductoOfertado3 = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Días: ");
        int diasProductoOfertado3 = scanner.nextInt();
        scanner.nextLine(); 
        ProductoOfertado productoOfertado3 = new ProductoOfertado(nombreProductoOfertado3, precioProductoOfertado3, diasProductoOfertado3);

        int unidadesPedidas = 5;
        double totalPedido = 0.0;

        totalPedido += productoEstandar1.obtenerPrecioPedido(unidadesPedidas);
        totalPedido += productoEstandar2.obtenerPrecioPedido(unidadesPedidas);
        totalPedido += productoEstandar1.obtenerPrecioPedido(unidadesPedidas);
        totalPedido += productoEstandar2.obtenerPrecioPedido(unidadesPedidas);
        totalPedido += productoEstandar1.obtenerPrecioPedido(unidadesPedidas);

        totalPedido += productoOfertado1.obtenerPrecioPedido(unidadesPedidas);
        totalPedido += productoOfertado2.obtenerPrecioPedido(unidadesPedidas);
        totalPedido += productoOfertado3.obtenerPrecioPedido(unidadesPedidas);
        totalPedido += productoOfertado3.obtenerPrecioPedido(unidadesPedidas);
        totalPedido += productoOfertado1.obtenerPrecioPedido(unidadesPedidas);

        System.out.println("El total del pedido es: $" + totalPedido);
    }
}


