import java.util.ArrayList;

public class Personaje {
    private String nombre;
    private String nombreSuper;
    private ArrayList<Habilidad> habilidades;

    public Personaje(String nombre, String nombreSuper) {
        this.nombre = nombre;
        this.nombreSuper = nombreSuper;
        this.habilidades = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombreSuper() {
        return nombreSuper;
    }
    public void setNombreSuper(String nombreSuper) {
        this.nombreSuper = nombreSuper;
    }
    public ArrayList<Habilidad> getHabilidades() {
        return new ArrayList<>(this.habilidades);
    }
    public Habilidad elegirHabilidad() {
        return this.habilidades.get(0);
    }


}
