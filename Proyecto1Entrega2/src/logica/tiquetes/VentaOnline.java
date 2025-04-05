package logica.tiquetes;

import java.util.Date;
import java.util.HashMap;

public class VentaOnline {
    // Atributos de VentaOnline
    protected String metodoPago;               // Método de pago utilizado (tarjeta, PayPal, etc.)
    protected Date fechaCompra;                // Fecha de compra del tiquete online
    protected int total;                       // Total pagado por el cliente
    protected HashMap<Integer, String> tiquetesVendidos;  // Mapa de tiquetes vendidos (ID del tiquete y nombre del cliente)
}