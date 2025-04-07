package logica.personas;

import java.util.ArrayList;
import java.util.Date;

import logica.atracciones.Atraccion;
import logica.tiquetes.Tiquete;

public class Cliente extends Persona {
    private ArrayList<Tiquete> tiquetesComprados;

    public Cliente(String nombre, String login, String password, ArrayList<String> enfermedadesDiscapacidades,
                   Date fechaDeNacimiento, int peso, float altura) {
        super(nombre, login, password, enfermedadesDiscapacidades, fechaDeNacimiento, peso, altura);
        this.tiquetesComprados = new ArrayList<>();
    }

    @Override
    public String getRol() {
        return "Cliente";
    }

    public void comprarTiquete(Tiquete tiquete) {
        tiquetesComprados.add(tiquete);
    }

    public ArrayList<Tiquete> getTiquetesComprados() {
        return tiquetesComprados;
    }

    public void consultarAtraccionesDisponibles(ArrayList<Atraccion> atracciones) {
        for (Atraccion atraccion : atracciones) {
            if (esAccesoValido(atraccion)) {
                System.out.println("Disponible: " + atraccion.getNombre());
            }
        }
    }

    public boolean esAccesoValido(Atraccion atraccion) {
        for (Tiquete tiquete : tiquetesComprados) {
            if (tiquete.permiteAcceso(atraccion)) {
                return true;
            }
        }
        return false;
    }
}