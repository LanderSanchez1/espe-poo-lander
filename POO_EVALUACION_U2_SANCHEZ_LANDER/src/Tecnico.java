
public class Tecnico extends Personal{

	    private double horasExtra;

	    public Tecnico(String nombre, int edad, String puesto, double salarioBase, double horasExtra) {
	        super(nombre, edad, puesto, salarioBase);
	        this.horasExtra = horasExtra;
	    }

	
	    @Override
	    public double pagar() {
	        return super.pagar() + calcularComision(horasExtra);
	    }

	    @Override
	    public double calcularComision(double horasTrabajadas) {
	        return super.getSalarioBase() * 0.1 * horasExtra;
	    }
	    
	}



