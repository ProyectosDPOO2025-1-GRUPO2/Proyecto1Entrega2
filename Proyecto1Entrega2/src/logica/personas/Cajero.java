package logica.personas;

import java.util.ArrayList;
import java.util.Date;

import logica.atracciones.Atraccion;
import logica.tiquetes.Tiquete;

public class Cajero extends Persona {

    private ArrayList<Tiquete> tiquetesVendidos;

    public Cajero(String nombre, String login, String password, ArrayList<String> enfermedadesDiscapacidades,
                  Date fechaDeNacimiento, int peso, float altura) {
        super(nombre, login, password, enfermedadesDiscapacidades, fechaDeNacimiento, peso, altura);
        this.tiquetesVendidos = new ArrayList<>();
    }

    @Override
    public String getRol() {
        return "Cajero";
    }

    public void venderTiquete(Tiquete tiquete, Cliente cliente) {
        tiquetesVendidos.add(tiquete);
        cliente.comprarTiquete(tiquete);
    }

    public ArrayList<Tiquete> consultarTiquetesVendidos() {
        return tiquetesVendidos;
    }

    public boolean validarTiquete(Tiquete tiquete) {
        return tiquete.estaActivo(); // Suponiendo que Tiquete tiene un método estaActivo()
    }

    public void registrarAccesoAAttraction(Atraccion atraccion, Cliente cliente) {
        if (cliente.esAccesoValido(atraccion)) {
            System.out.println("Acceso permitido a: " + atraccion.getNombre());
        } else {
            System.out.println("Acceso denegado a: " + atraccion.getNombre());
        }
    }
}