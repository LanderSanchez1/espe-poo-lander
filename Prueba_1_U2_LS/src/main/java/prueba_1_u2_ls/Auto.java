package prueba_1_u2_ls;

public class Auto extends Vehiculo {
      private String transmision;
    private boolean parabrisasOn;
    private int multa;

    public Auto(String numPlaca, String marca, int numRuedas, int estado) {
        super(numPlaca, marca, numRuedas, estado);
        this.transmision = "";
        this.parabrisasOn = false;
        this.multa = 0;

    }

    public boolean isParabrisasOn() {
        return parabrisasOn;
    }

    public void encenderParabrisas() {
        if (this.parabrisasOn) {
            this.parabrisasOn = false;
            System.out.println("Se apago el parabrisas.");
        } else {
            this.parabrisasOn = true;
            System.out.println("Parabrisas encendido.");
        }
    }

    public void setMulta(int multa) {
        this.multa = multa;
    }

    public void addMulta() {
        this.multa++;
    }

    public int getMulta() {
        return multa;
    }

    public void setTransmision(String transmision) {
    this.transmision = transmision;
}

public String getTransmision() {
    return transmision;
}

}
