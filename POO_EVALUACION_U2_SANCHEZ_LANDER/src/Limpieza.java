
public class Limpieza extends Personal {

	
	    private int diasTrabajados;

	    public Limpieza(String nombre, int edad, String puesto, double salarioBase, int diasTrabajados) {
	        super(nombre, edad, puesto, salarioBase);
	        this.diasTrabajados = diasTrabajados;
	    }


	    @Override
	    public double pagar() {
	        return super.pagar() + calcularComision(diasTrabajados);
	    }

	    @Override
	    public double calcularComision(double horasTrabajadas) {
	        return super.getSalarioBase() * 0.05 * diasTrabajados;
	    }
	}

