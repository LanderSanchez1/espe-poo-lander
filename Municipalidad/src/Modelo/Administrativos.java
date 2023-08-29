package Modelo;
public class Administrativos extends Alcaldia {
    private String nombre;
    private int edad;
    private String areaEncargada;
    public Administrativos(String nombreAlcalde, String partidoPolitico, 
            int anosEnCargo, double salario, String nombre, int edad, String areaEncargada) {
        super(nombreAlcalde, partidoPolitico, anosEnCargo, salario);
        this.nombre = nombre;
        this.edad = edad;
        this.areaEncargada = areaEncargada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getAreaEncargada() {
        return areaEncargada;
    }

    public void setAreaEncargada(String areaEncargada) {
        this.areaEncargada = areaEncargada;
    }
}
