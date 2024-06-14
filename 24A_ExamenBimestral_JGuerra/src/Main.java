import java.util.Scanner;
import vIajes.pasajero;
import vIajes.ruta;
import vIajes.normal;
import vIajes.vip;
import vIajes.ticket;
import vIajes.servicio;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ruta[] rutas = {
                new ruta("Quito", "Guayaquil", 20.0),
                new ruta("Quito", "Tulcán", 17.50),
                new ruta("Quito", "Puyo", 15.0),
                new ruta("Quito", "Riobamba", 17.50)
        };

        System.out.print("Ingrese el nombre del pasajero: ");
        String nombrePasajero = scanner.nextLine();
        System.out.print("Ingrese el número de cédula: ");
        String idPasajero = scanner.nextLine();

        pasajero pasajero = new pasajero(nombrePasajero, idPasajero);

        System.out.println("Seleccione la ruta:");
        for (int i = 0; i < rutas.length; i++) {
            System.out.println((i + 1) + ". " + rutas[i].getOrigen() + " a " + rutas[i].getDestino() + " - $" + rutas[i].getPrecio());
        }
        int seleccionRuta = scanner.nextInt();
        ruta rutaSeleccionada = rutas[seleccionRuta - 1];

        System.out.println("Seleccione el tipo de servicio:");
        System.out.println("1. Normal");
        System.out.println("2. VIP");
        int seleccionServicio = scanner.nextInt();
        scanner.nextLine();

        servicio servicioSeleccionado;
        if (seleccionServicio == 1) {
            servicioSeleccionado = new normal(false);
        } else {
            servicioSeleccionado = new vip(true);
        }

        System.out.print("¿Desea comida a bordo? (si/no): ");
        String deseaComida = scanner.nextLine();
        boolean comidaABordo = deseaComida.equalsIgnoreCase("si");

        ticket ticketGenerado = new ticket(rutaSeleccionada, servicioSeleccionado, pasajero, comidaABordo);

        System.out.println("Ticket Generado:");
        System.out.println(ticketGenerado);
        System.out.println("GUERRA JOSUÉ");

        scanner.close();
    }
}
