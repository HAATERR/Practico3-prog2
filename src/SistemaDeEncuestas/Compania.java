import java.util.ArrayList;

public class Compania {
    private ArrayList<Empleado> empleados;
    private String nombre;
    private ArrayList<Encuesta> encuestas;

    public Compania(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
        this.encuestas = new ArrayList<>();
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void  addEmpleado(Empleado empleado){
        empleados.add(empleado);
    }
    public void addEncuesta(Encuesta encuesta){
        if (encuesta.getDni() != -1){
            encuestas.add(encuesta);
        }
    }
}
