package LAB3_POO_Sanchez_Landerr;

public class Producto {
	

	private String nombre;
    private double precio;

    //Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //Métodos get 
    public String getNombre() {
        return nombre;
    }
    //Métodos get
    public double getPrecio() {
        return precio;
    }
    //Método set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Método set

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Método obtenerPrecioPedido
    public double obtenerPrecioPedido(int unidadesPedidas) {
        return unidadesPedidas * precio;
    }
    
    
}

	
	
	

