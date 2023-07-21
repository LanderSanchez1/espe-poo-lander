
abstract class Personal {

	//Atributos
	    private String nombre;
	    private int edad;
	    private String puesto;
	    private double salarioBase;
	   // creamos el constructor
	    public Personal(String nombre, int edad, String puesto, double salarioBase) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.puesto = puesto;
	        this.salarioBase = salarioBase;
	    }
	    
	    public double pagar() {
	        return salarioBase;
	    }
	    //metodo Calcular 
	    public double calcularComision(double horasTrabajadas) {
	        return 0.0;
	    }

	    //metodo get
		public double getSalarioBase() {
			// TODO Auto-generated method stub
			return 0;
		}


	}
