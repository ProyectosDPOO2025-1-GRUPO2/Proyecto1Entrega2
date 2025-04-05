package logica.tiquetes;

import java.util.Date;
import java.util.HashMap;

public class VentaTaquilla {
    // Atributos de VentaTaquilla
    protected String metodoPago;               // Método de pago utilizado (efectivo, tarjeta, etc.)
    protected Date fechaCompra;                // Fecha de compra del tiquete en la taquilla
    protected int total;                       // Total pagado por el cliente
    protected HashMap<Integer, String> tiquetesVendidos;  // Mapa de tiquetes vendidos (ID del tiquete y nombre del cliente)
}