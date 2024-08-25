import java.util.ArrayList;

public class Juego {
    private ArrayList<Personaje> personajes;
    private ArrayList<Habilidad> habilidades;
    private String nombre;

    public Juego(String nombre) {
        this.nombre = nombre;
        this.personajes = new ArrayList<>();
        this.habilidades = new ArrayList<>();
    }

    public void addHabilidad(Habilidad habilidad) {
        if (!this.habilidades.contains(habilidad)) {
            this.habilidades.add(habilidad);
        }
    }

    public void addPersonaje(Personaje personaje) {
        if (this.habilidades.equals(personaje.getHabilidades()) && !this.personajes.contains(personaje)) {
            this.personajes.add(personaje);
        }
    }
    public Personaje jugar(){
        Habilidad habilidadAJugar = this.habilidades.get(0);
        Personaje ganador = null;
        int puntajeAlto = 0;
        for (int i = 0; i < this.personajes.size(); i++) {
            for (int j = 0; j < this.personajes.get(i).getHabilidades().size(); j++) {
                if (habilidadAJugar.equals(this.personajes.get(i).getHabilidades().get(j)) && this.personajes.get(i).getHabilidades().get(j).getValor() > puntajeAlto){
                    ganador = this.personajes.get(i);
                    puntajeAlto = this.personajes.get(i).getHabilidades().get(j).getValor();
                }
            }
        }
        return ganador;
    }


}
