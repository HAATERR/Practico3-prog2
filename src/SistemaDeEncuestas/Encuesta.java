import java.util.ArrayList;

public class Encuesta {
    private ArrayList<String> preguntas;
    private Empleado empleado;
    private int dni;

    public Encuesta(int dni, Empleado empleado) {
        this.preguntas = new ArrayList<>();
        this.empleado = empleado;
        this.dni = -1;
    }

    //GETS AND SETS

    public ArrayList<String> getPreguntas() {
        return preguntas;
    }
    public Empleado getEmpleado() {
        return empleado;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}
