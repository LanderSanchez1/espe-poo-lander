
public class Administrativo extends Personal {

	    private double horasExtra;

	    public Administrativo(String nombre, int edad, String puesto, double salarioBase, double horasExtra) {
	        super(nombre, edad, puesto, salarioBase);
	        this.horasExtra = horasExtra;
	    }

	   
	    @Override
	    public double pagar() {
	      
	        return super.pagar() + calcularComision(horasExtra);
	    }

	    @Override
	    public double calcularComision(double horasTrabajadas) {
	        
	        return super.getSalarioBase() * 0.05 * horasExtra;
	    }
	}