package Modelo;
public class Alcaldia {
 private String nombreAlcalde;
    private String partidoPolitico;
    private int anosEnCargo;
    private double salario;
    public Alcaldia(String nombreAlcalde, String partidoPolitico, int anosEnCargo, double salario) {
        this.nombreAlcalde = nombreAlcalde;
        this.partidoPolitico = partidoPolitico;
        this.anosEnCargo = anosEnCargo;
        this.salario = salario;
    }
    public String getNombreAlcalde() {
        return nombreAlcalde;
    }
    public void setNombreAlcalde(String nombreAlcalde) {
        this.nombreAlcalde = nombreAlcalde;
    }
    public String getPartidoPolitico() {
        return partidoPolitico;
    }
    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }
    public int getAnosEnCargo() {
        return anosEnCargo;
    }
    public void setAñosEnCargo(int añosEnCargo) {
        this.anosEnCargo = añosEnCargo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
   }
