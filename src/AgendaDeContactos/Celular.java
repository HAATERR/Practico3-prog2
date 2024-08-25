import java.util.ArrayList;

public class Celular {
    private ArrayList<Contacto> contactos;

    public Celular() {
        this.contactos = new ArrayList<>();
    }

    public void addContacto(Contacto c) {
        this.contactos.add(c);
    }

    public void removeContacto(Contacto c) {
        this.contactos.remove(c);
    }

    public ArrayList<Contacto> getContactos() {
        return new ArrayList<>(this.contactos);
    }

    public ArrayList<Contacto> getContactosRepetidos() {
        ArrayList<Contacto> repetidos = new ArrayList<>();
        for (int i = 0; i < this.contactos.size(); i++) {
            for (int j = 0; j < this.contactos.size(); j++) {
                if (this.contactos.get(i).verificarRepetido(this.contactos.get(j))) {
                    repetidos.add(this.contactos.get(j));
                }
            }
        }
        return repetidos;
    }

    public ArrayList<Contacto> getContactosTelefonoRepetido() {
        ArrayList<Contacto> contactosTelRepetido = new ArrayList<>();
        for (int i = 0; i < this.contactos.size(); i++) {
            for (int j = 1; j < this.contactos.size(); j++) {
                if (this.contactos.get(i).verificarRepetidoPorTelefono(this.contactos.get(j))) {
                    contactosTelRepetido.add(this.contactos.get(j));
                }
            }
        }
        return contactosTelRepetido;
    }
    public double getPromedioEdad(){
        double promedioEdad = 0;
        for (int i = 0;i < this.contactos.size();i++){
            promedioEdad += this.contactos.get(i).calcularEdad();
        }
        return promedioEdad / this.contactos.size();
    }

}

