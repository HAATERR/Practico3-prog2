import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
public class Contacto {
    private String nombre;
    private String apellido;
    private LocalDateTime fechaNacimiento;
    private int numero;
    private String direccion;
    private String email;
    private String ciudad;

    public Contacto(String nombre, String apellido, int numero, String direccion, String email, String ciudad,LocalDateTime fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.numero = numero;
        this.direccion = direccion;
        this.email = email;
        this.ciudad = ciudad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String mostrarInfo(){return "Nombre: " + this.nombre +" Apellido: " + this.apellido + " Edad: " + this.calcularEdad() + " Numero telefono: " + this.numero + " Ciudad: ";}

    public long calcularEdad(){return ChronoUnit.YEARS.between(this.fechaNacimiento,LocalDateTime.now());}

    public boolean verificarRepetido(Contacto c){
        return this.apellido == c.getApellido() && this.nombre == c.getNombre();
    }
    public boolean verificarRepetidoPorTelefono(Contacto c){
        return this.numero == c.getNumero();

    }
}
