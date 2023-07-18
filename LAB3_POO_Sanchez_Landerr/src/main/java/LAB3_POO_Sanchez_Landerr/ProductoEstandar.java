// CLASE PRODUCTO ESTANDAR
package LAB3_POO_Sanchez_Landerr;

// Esta clase hereda de la clase Producto
public class ProductoEstandar extends Producto {
	private String sección;
	
	// Constructor
    public ProductoEstandar(String nombre, double precio, String sección) {
        super(nombre, precio);
        this.sección = sección;
    }
    
    // Método getter para sección
    public String getSección() {
        return sección;
    }
    
    // Método setter para sección
    public void setSección(String sección) {
        this.sección = sección;
    }
    
    // Sobrescritura del método obtenerPrecioPedido
    @Override
    public double obtenerPrecioPedido(int unidadesPedidas) {
        double precioTotal = super.obtenerPrecioPedido(unidadesPedidas);
        if (unidadesPedidas >= 5) {
            precioTotal *= 0.9; // 10% de descuento
        }
        return precioTotal;
    }
}
