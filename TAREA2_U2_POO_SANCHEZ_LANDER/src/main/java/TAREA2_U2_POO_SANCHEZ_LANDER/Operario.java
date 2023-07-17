package TAREA2_U2_POO_SANCHEZ_LANDER;
import java.util.Date;

class Operario extends Empleado{
    private int nivel; // Nivel de seguridad del operario

    // Constructor de la clase Operario
    public Operario(String nombre, int edad, Date fechaIngreso, double salario, int nivel) {
        super(nombre, edad, fechaIngreso, salario);
        this.nivel = nivel;
    }
    // Métodos get y set 
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    // Implementación del método incentivar de la clase Empleado para el Operario
    @Override
    public void incentivar() {
        // Verificar si la edad es mayor a 30 y si el nivel es mayor a 2
        if (getEdad() > 30 && getNivel() > 2) {
            setSalario(getSalario() + (2 * BONO)); // Incrementar el salario en 2 veces el bono
        } else if (getEdad() > 30 || getNivel() > 2) {
            setSalario(getSalario() + BONO); // Incrementar el salario en el bono
        }
    }
    // Método adicional para actualizar el nivel del operario si han pasado más de 2 años desde su ingreso
    public void actualizarNivel() {
        // Verificar si han pasado más de 2 años desde la fecha de ingreso y si el nivel es menor a 5
        if (getFechaIngreso().getYear() > 2 && getNivel() < 5) {
            setNivel(getNivel() + 1); // Incrementar el nivel
        }
    }
}


