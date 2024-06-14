package vIajes;

public class vip extends servicio {
    public vip(boolean maletaAdicional) {
        super(maletaAdicional);
    }

    @Override
    public String toString() {
        return "\nVIP " + super.toString();
    }
}