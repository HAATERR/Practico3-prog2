public class Producto {
    private String nombre;
    private int peso;
    private int porcentaje;
    private String Color;
    private int costo;
    private String tipoMadera;

    public Producto(String nombre, int peso, int porcentaje, String Color, int costo, String tipoMadera) {
        this.nombre = nombre;
        this.peso = peso;
        this.porcentaje = porcentaje;
        this.Color = Color;
        this.costo = costo;
        this.tipoMadera = tipoMadera;

    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public int getValor() {
        return  this.costo + this.costo * porcentaje / 100;
    }
    public void setValor(int porcentaje) {
        this.porcentaje = porcentaje;
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String Color) {
        this.Color = Color;
    }
    public int getCosto() {
        return costo;
    }
    public void setCosto(int costo) {
        this.costo = costo;
    }
    public String getTipoMadera() {
        return tipoMadera;
    }
    public void setTipoMadera(String tipoMadera) {
        this.tipoMadera = tipoMadera;
    }

}
