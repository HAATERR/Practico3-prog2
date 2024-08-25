import java.util.ArrayList;

public class Persona {
    private String nombre;
    private int dni;
    private ArrayList<Encuesta> encuestas;
    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.encuestas = new ArrayList<Encuesta>();

    }
    //GETS AND SETS

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public ArrayList<Encuesta> getEncuestas() {
        return encuestas;
    }
    public void addEncuesta(Encuesta encuesta) {
        encuestas.add(encuesta);
    }
    public void realizarEncuesta(Encuesta encuesta) {
        for (int i = 0; i < encuestas.size(); i++) {
            if (encuestas.get(i).getPreguntas().equals(encuesta.getPreguntas())) {
                return;
            }
        }
        encuesta.setDni(this.dni);
        encuesta.getEmpleado().addEncuesta(encuesta);
    }
}
