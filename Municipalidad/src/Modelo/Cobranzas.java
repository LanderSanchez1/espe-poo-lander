package Modelo;
import java.util.Scanner;

public class Cobranzas extends Alcaldia {
    private double ingresos;
    private double egresos;

    public Cobranzas(String nombreAlcalde, String partidoPolitico, int 
            anosEnCargo, double salario, double ingresos, double egresos) {
        super(nombreAlcalde, partidoPolitico, anosEnCargo, salario);
        this.ingresos = ingresos;
        this.egresos = egresos;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public double getEgresos() {
        return egresos;
    }

    public void setEgresos(double egresos) {
        this.egresos = egresos;
    }

    public double calcularBalance() {
        return ingresos - egresos;
    }
}
