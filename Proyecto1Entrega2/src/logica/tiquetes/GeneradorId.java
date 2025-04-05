package logica.tiquetes;

public class GeneradorId {
	private static int contadorTickets = 1; // Contador global para todos los tickets

    public static int generarTicketID() {
        return contadorTickets++; // Genera un ID único y lo incrementa
    }

}
