package poo_u2_tutoria_polimorfismo;

public class Natacion extends Deportista{
    private String estilo;

    public Natacion(String nombre, int edad, String disiplina, String sexo, String estilo) {
        super(nombre, edad, disiplina, sexo);
        this.estilo=estilo;
    }

    
    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public void entrenamiento() {
        System.out.println("LA NATACION ES EL DEPORTE DONDE SE TRABAJAN LA MAYORIA DE MUSCULOS DEL CUERPO");
    }
    
    public void mostrarDatos(){
        System.out.println("NOMBRE: "+getNombre());
        System.out.println("EDAD: "+getEdad());
        System.out.println("DISIPLINA: "+getDisiplina());
        System.out.println("SEXO: "+getSexo());
        System.out.println("ESTILO: "+getEstilo());
    }
}
