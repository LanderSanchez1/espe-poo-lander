package poo_practicaenclase7_Sanchez_Lander;


	public class Automovil extends Vehiculo {
	    boolean parabrisas;
	    @Override //estamos heredando estos metodos y los podemos utilizar
	public void encendido (){
	    encendido = true;
	    estado = "Vehiculo encendido";
	}
	public void apagado (){
	   encendido = false;
	   estado = "Vehiculo apagado";
	}
	}

