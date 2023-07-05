
package prueba_1_u2_ls;

public class Prueba_1_U2_LS {

    public static void main(String[] args) {
        
        
        Auto auto = new Auto("PBY8807", "HYUNDAI", 4, 1);
        auto.setTransmision("Automatica");
        auto.encenderParabrisas();

        System.out.println("Informacion del Auto:");
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Numero de Placa: " + auto.getNumPlaca());
        System.out.println("Numero de Ruedas: " + auto.getNumRuedas());
        System.out.println("Transmision: " + auto.getTransmision());
        System.out.println("Estado: " + auto.getEstado());
        System.out.println("Parabrisas encendido: " + auto.isParabrisasOn());
        System.out.println();

        Camion camion = new Camion("JHS271", "Chevrolet", 8, 1);
        camion.setColor("Negro");
        camion.setCarga(4000.0);

        System.out.println("Información del Camión:");
        System.out.println("Número de placa: " + camion.getNumPlaca());
        System.out.println("Marca: " + camion.getMarca());
        System.out.println("Número de ruedas: " + camion.getNumRuedas());
        System.out.println("Estado: " + camion.getEstado());
        System.out.println("Parabrisas encendido: " + camion.isParabrisasOn());
        System.out.println("Color: " + camion.getColor());
        System.out.println("Carga: " + camion.getCarga());
    }
}