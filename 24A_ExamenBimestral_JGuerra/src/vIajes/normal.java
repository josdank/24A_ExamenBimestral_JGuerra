package vIajes;

public class normal extends servicio {
    public normal(boolean maletaAdicional) {
        super(maletaAdicional);
    }

    @Override
    public String toString() {
        return "Normal:  " + super.toString();
    }
}
