package poo_practicaenclase7_Sanchez_Lander;


	public class Motocicleta extends Vehiculo {
		   boolean patada;
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

