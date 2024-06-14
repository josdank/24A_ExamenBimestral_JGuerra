package vIajes;

public class ticket extends ruta {
    ruta ruta;
    servicio servicio;
    pasajero pasajero;
    boolean vip;
    double costo;

    public ticket(String nombre, String cedula) {
        super(nombre, cedula, 20.0);
    }

    public ticket(String nombre, String cedula, double v) {
        super(nombre, cedula, v);
    }

    public ticket(vIajes.ruta ruta, vIajes.servicio servicio, vIajes.pasajero pasajero, boolean vip) {
        super(pasajero.getNombre(), pasajero.getCedula(), ruta.getOrigen(), ruta.getDestino(), ruta.getPrecio());
        this.ruta = ruta;
        this.servicio = servicio;
        this.pasajero = pasajero;
        this.vip = vip;
        this.costo = costo;
    }

    public ticket(String nombre, String cedula, String origen, String destino, double precio, vIajes.ruta ruta, vIajes.servicio servicio, vIajes.pasajero pasajero, boolean vip, double costo) {
        super(nombre, cedula, origen, destino, precio);
        this.ruta = ruta;
        this.servicio = servicio;
        this.pasajero = pasajero;
        this.vip = vip;
        this.costo = costo;
    }

    private void calcularCosto() {
        double baseCost = ruta.getPrecio();
        if (vip) {
            baseCost *= 1.30;
        }
        this.costo = baseCost;
    }

    // Getters y Setters
    public ruta getruta() {
        return ruta;
    }

    public void setruta(ruta ruta) {
        this.ruta = ruta;
        calcularCosto();
    }

    public servicio getservicio() {
        return servicio;
    }

    public void setServicio(servicio servicio) {
        this.servicio = servicio;
    }

    public pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public boolean isVIP() {
        return vip;
    }

    public void setvip(boolean vip) {
        vip = vip;
        calcularCosto();
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getCosto() {
        return costo;
    }

    @Override
    public String toString() {
        return "Pasajero: " + pasajero.getNombre() +
                "\nID: " + pasajero.cedula +
                "\nRuta: " + ruta.getOrigen() + " a " + ruta.getDestino() +
                "\nPrecio: $" + ruta.getPrecio() +
                "\nServicio: " + (servicio instanceof vip ? "VIP" : "Normal");
    }
}

