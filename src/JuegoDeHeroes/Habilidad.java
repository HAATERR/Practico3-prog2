public class Habilidad {
    private String nombre;
    private int valor;

    public Habilidad(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    @Override
    public boolean equals(Object o){
        try {
            Habilidad h = (Habilidad) o;
            return this.nombre == h.getNombre();
        }catch (Exception e){
            return false;
        }
    }
}
