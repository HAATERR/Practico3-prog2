import java.util.ArrayList;

public class Empleado {
    private String nombre;
    private int dni;
    private int salario;
    private ArrayList<Encuesta> encuestas;
    private int plus;

    public Empleado(String nombre, int dni, int salario, int plus) {
        this.nombre = nombre;
        this.dni = dni;
        this.salario = salario;
        this.encuestas = new ArrayList<>();
        this.plus = plus;
    }
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
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
    public ArrayList<Encuesta> getEncuestas() {
        return encuestas;
    }
    public void addEncuesta(Encuesta encuesta) {
        if (encuesta.getDni() != -1) {
            this.encuestas.add(encuesta);
        }
    }
    public void cobrarPlus(){
        for (int i = 0; i < this.encuestas.size(); i++) {
           salario+= plus;
        }
    }

}
