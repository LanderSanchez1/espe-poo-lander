// CLASE PRODUCTO OFERTADO
package LAB3_POO_Sanchez_Landerr;

// Esta clase hereda de la clase Producto
public class ProductoOfertado extends Producto {
	private int días;
	
	// Constructor
    public ProductoOfertado(String nombre, double precio, int días) {
        super(nombre, precio);
        this.días = días;
    }
    
    // Método getter para días
    public int getDías() {
        return días;
    }
    
    // Método setter para días
    public void setDías(int días) {
        this.días = días;
    }

    // Sobrescritura del método obtenerPrecioPedido
    @Override
    public double obtenerPrecioPedido(int unidadesPedidas) {
        double precioTotal = super.obtenerPrecioPedido(unidadesPedidas);
        if (días == 1) {
            precioTotal *= 0.8; // 20% de descuento
        } else if (días == 2 || días == 3) {
            precioTotal *= 0.85; // 15% de descuento
        } else if (días > 3) {
            precioTotal *= 0.9; // 10% de descuento
        }
        return precioTotal;
    }
}
