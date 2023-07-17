package TAREA2_U2_POO_SANCHEZ_LANDER;
import java.util.Date;

class Director extends Empleado{
    private String departamento; // Departamento del director
    private int personal; // Número de personas a cargo del director

    // Constructor de la clase Director
    public Director(String nombre, int edad, Date fechaIngreso, double salario, String departamento, int personal) {
        super(nombre, edad, fechaIngreso, salario);
        this.departamento = departamento;
        this.personal = personal;
    }
    // Métodos get y set
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public int getPersonal() {
        return personal;
    }
    public void setPersonal(int personal) {
        this.personal = personal;
    }
    // Implementación del método incentivar de la clase Empleado para el Director
    @Override
    public void incentivar() {
        // Verificar si el mes de ingreso es mayor a 30 y si la cantidad de personal a cargo es mayor a 20
        if (getFechaIngreso().getMonth() > 30 && getPersonal() > 20) {
            setSalario(getSalario() + (2 * BONO)); // Incrementar el salario en 2 veces el bono
        } else if (getFechaIngreso().getMonth() > 30 || getPersonal() > 20) {
            setSalario(getSalario() + BONO); // Incrementar el salario en el bono
        }
    }
}

