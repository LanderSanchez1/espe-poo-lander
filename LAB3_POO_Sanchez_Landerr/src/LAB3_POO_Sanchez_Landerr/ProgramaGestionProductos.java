package LAB3_POO_Sanchez_Landerr;

//Clase principal
public class ProgramaGestionProductos {

	
	public static void main(String[] args) {
		//Pedidos de producto estandar
	        ProductoEstandar productoEstandar1 = new ProductoEstandar("Producto 1", 10.0, "Sección A");
	        ProductoEstandar productoEstandar2 = new ProductoEstandar("Producto 2", 15.0, "Sección B");

	    //Pedidos de productos ofertados 
	        ProductoOfertado productoOfertado1 = new ProductoOfertado("Producto 3", 20.0, 2);
	        ProductoOfertado productoOfertado2 = new ProductoOfertado("Producto 4", 25.0, 2);
	        ProductoOfertado productoOfertado3 = new ProductoOfertado("Producto 5", 30.0, 2);

	        
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
	


