package logica.tiquetes;

public class VentaOnline {
    private String medioPago;
    private String correoCliente;

    public VentaOnline(String medioPago, String correoCliente) {
        this.medioPago = medioPago;
        this.correoCliente = correoCliente;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }
}
