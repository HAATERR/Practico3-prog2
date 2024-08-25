import java.util.ArrayList;

public class Fabrica {
    private String nombre;
    private ArrayList<Producto> productos;
    public Fabrica(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }
    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPrecioVenta(){
        int total = 0;
        for(int i = 0; i < this.productos.size(); i++){
            total += productos.get(i).getValor();
        }
        return total;
    }
    public int getCostoFabricacion(){
        int total = 0;
        for(int i = 0; i < this.productos.size(); i++){
            total += productos.get(i).getCosto();
        }
        return total;
    }
}
