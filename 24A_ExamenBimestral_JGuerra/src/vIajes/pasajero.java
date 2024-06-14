package vIajes;

public class pasajero {
    String nombre;
    String cedula;

    public pasajero(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public pasajero() {
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "\nPasajero: " +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula ;
    }
}

