package vIajes;

public class servicio {
    boolean maletaAdicional;

    public servicio(boolean maletaAdicional) {
        this.maletaAdicional = maletaAdicional;
    }

    // Getters y Setters
    public boolean isMaletaAdicional() {
        return maletaAdicional;
    }

    public void setMaletaAdicional(boolean maletaAdicional) {
        this.maletaAdicional = maletaAdicional;
    }

    @Override
    public String toString() {
        return "\nServicio: " +
                "maletaAdicional=" + maletaAdicional;
    }
}