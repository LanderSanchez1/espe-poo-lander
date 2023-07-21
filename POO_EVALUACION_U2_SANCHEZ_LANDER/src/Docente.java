
public class Docente extends Personal {

	
	    private double sueldoHora;
	    //creamos el constructor
	    public Docente(String nombre, int edad, String puesto, double salarioBase, double sueldoHora) {
	        super(nombre, edad, puesto, salarioBase);
	        this.sueldoHora = sueldoHora;
	    }
	    @Override
	    public double pagar() {

	        double horasTrabajadas = 0;
			return super.pagar() + calcularComision(horasTrabajadas);
	    }

	    @Override
	    public double calcularComision(double horasTrabajadas) {
	        return sueldoHora * horasTrabajadas;
	    }
	}

	

	

	
	

