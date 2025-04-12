package logica.personas;

import java.util.ArrayList;
import java.util.Date;

import logica.atracciones.Atraccion;
import logica.atracciones.AtraccionMecanica;

public class OperadorAtracciones extends Persona {
    private String nivelRiesgoCapacitado;
    private ArrayList<Atraccion> atraccionesAsignadas;

    public OperadorAtracciones(String nombre, String login, String password, ArrayList<String> enfermedadesDiscapacidades,
                                Date fechaDeNacimiento, int peso, float altura, String nivelRiesgoCapacitado) {
        super(nombre, login, password, enfermedadesDiscapacidades, fechaDeNacimiento, peso, altura);
        this.nivelRiesgoCapacitado = nivelRiesgoCapacitado;
        this.atraccionesAsignadas = new ArrayList<>();
    }

    @Override
    public String getRol() {
        return "OperadorAtracciones";
    }

    public void operarAtraccion(Atraccion atraccion) {
        if (atraccion instanceof AtraccionMecanica &&
            ((AtraccionMecanica) atraccion).getNivelRiesgo().equalsIgnoreCase(nivelRiesgoCapacitado)) {
            System.out.println("Operando atracción: " + atraccion.getNombre());
        } else {
            System.out.println("No capacitado para operar esta atracción.");
        }
    }

    public boolean verificarRestriccionesCliente(Cliente cliente, Atraccion atraccion) {
        ArrayList<String> restricciones = atraccion.getRestricciones();
        if (restricciones.size() < 4) return false;

        try {
            int alturaMin = Integer.parseInt(restricciones.get(0));
            int alturaMax = Integer.parseInt(restricciones.get(1));
            int pesoMin = Integer.parseInt(restricciones.get(2));
            int pesoMax = Integer.parseInt(restricciones.get(3));

            float alturaCliente = cliente.getAltura();
            int pesoCliente = cliente.getPeso();

            if (alturaCliente < alturaMin || alturaCliente > alturaMax) return false;
            if (pesoCliente < pesoMin || pesoCliente > pesoMax) return false;

            ArrayList<String> condicionesClima = new ArrayList<>(restricciones.subList(4, restricciones.size()));
            for (String condicion : condicionesClima) {
                if (cliente.getEnfermedadesDiscapacidades().contains(condicion)) return false;
            }

        } catch (NumberFormatException e) {
            System.out.println("Restricciones inválidas.");
            return false;
        }

        return true;
    }

    public void consultarAtraccionesDisponibles(ArrayList<Atraccion> atracciones) {
        for (Atraccion atraccion : atracciones) {
            if (atraccion instanceof AtraccionMecanica &&
                ((AtraccionMecanica) atraccion).getNivelRiesgo().equalsIgnoreCase(nivelRiesgoCapacitado)) {
                System.out.println("Puede operar: " + atraccion.getNombre());
            }
        }
    }

    public void asignarTareas(Atraccion atraccion) {
        if (atraccion instanceof AtraccionMecanica &&
            ((AtraccionMecanica) atraccion).getNivelRiesgo().equalsIgnoreCase(nivelRiesgoCapacitado)) {
            atraccionesAsignadas.add(atraccion);
            System.out.println("Atracción asignada: " + atraccion.getNombre());
        }
    }

    public void setNivelRiesgoCapacitado(String nivelRiesgoCapacitado) {
        this.nivelRiesgoCapacitado = nivelRiesgoCapacitado;
    }
}
    
