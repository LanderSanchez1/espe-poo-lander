package prueba_1_u2_ls;

public class Camion extends Vehiculo {
     private boolean parabrisasOn;
    private String color;
    private double carga;

    public Camion(String numPlaca, String marca, int numRuedas, int estado) {
        super(numPlaca, marca, numRuedas, estado);
        this.parabrisasOn = false;
        this.color = "";
        this.carga = 0;

    }

    public boolean isParabrisasOn() {
        return parabrisasOn;
    }

    public void onOffParabrisas() {
        if (this.parabrisasOn) {
            this.parabrisasOn = false;
            System.out.println("Se apago el parabrisas.");
        } else {
            this.parabrisasOn = true;
            System.out.println("Parabrisas encendido.");
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }
}

