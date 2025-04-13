package logica.personas;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import logica.atracciones.Atraccion;
import logica.atracciones.Espectaculo;
import logica.tiquetes.Tiquete;
import persistencia.ArchivoPlano;

public class Administrador extends Persona {

    private String parqueNombre;

    private HashMap<String, Persona> personalRegistrado;            // login → Persona
    private HashMap<String, Turno> turnosDisponibles;               // ID → Turno
    private HashMap<String, Atraccion> atracciones;                 // ID → Atracción
    private HashMap<String, Espectaculo> espectaculos;             // ID → Espectáculo
    private HashMap<String, Tiquete> tiquetesEmitidos;             // Ticket ID → Tiquete
    private HashMap<String, Turno> turnosAsignados;                // login → último Turno asignado

    public Administrador(String nombre, String login, String password, ArrayList<String> enfermedadesDiscapacidades,
                         Date fechaDeNacimiento, int peso, float altura, String parqueNombre,
                         HashMap<String, Persona> personalRegistrado, HashMap<String, Turno> turnosDisponibles,
                         HashMap<String, Atraccion> atracciones, HashMap<String, Espectaculo> espectaculos,
                         HashMap<String, Tiquete> tiquetesEmitidos, HashMap<String, Turno> turnosAsignados) {
        super(nombre, login, password, enfermedadesDiscapacidades, fechaDeNacimiento, peso, altura);
        this.parqueNombre = parqueNombre;
        this.personalRegistrado = personalRegistrado;
        this.turnosDisponibles = turnosDisponibles;
        this.atracciones = atracciones;
        this.espectaculos = espectaculos;
        this.tiquetesEmitidos = tiquetesEmitidos;
        this.turnosAsignados = turnosAsignados;
    }

    // === Gestión de Personas ===
    public void registrarPersona(Persona persona) {
        personalRegistrado.put(persona.getLogin(), persona);
    }

    public void eliminarPersona(String login) {
        personalRegistrado.remove(login);
    }

    public Persona obtenerPersona(String login) {
        return personalRegistrado.get(login);
    }

    public ArrayList<Persona> obtenerTodoElPersonal() {
        return new ArrayList<>(personalRegistrado.values());
    }

    // === Gestión de Turnos ===
    public void asignarTurno(String login, boolean apertura, boolean cierre, String lugar, String tarea) {
        Persona persona = personalRegistrado.get(login);
        if (persona != null) {
            Turno turno = new Turno(apertura, cierre, lugar, tarea);
            persona.agregarTurno(turno); // actualiza lista de turnos del empleado
            turnosAsignados.put(login, turno); // mantiene registro de último turno asignado
        }
    }

    public Turno consultarTurno(String login) {
        return turnosAsignados.get(login);
    }

    // === Gestión de Atracciones ===
    public void registrarAtraccion(Atraccion atraccion) {
        atracciones.put(String.valueOf(atraccion.getId()), atraccion);
    }

    public Atraccion obtenerAtraccion(String id) {
        return atracciones.get(id);
    }

    public void asignarOperadorDeAtraccion(String atraccionID, OperadorAtracciones operador) {
        Atraccion atraccion = atracciones.get(atraccionID);
        if (atraccion != null) {
            atraccion.getOperadores().add(operador);
        }
    }

    public void capacitarPersonaEnAtraccion(String login, String nivelRiesgo) {
        Persona persona = personalRegistrado.get(login);
        if (persona instanceof OperadorAtracciones) {
            OperadorAtracciones operador = (OperadorAtracciones) persona;
            operador.setNivelRiesgoCapacitado(nivelRiesgo);
        }
    }

    @Override
    public String getRol() {
        return "Administrador";
    }
    
    public void guardarPersonasEnArchivo(String rutaArchivo) {
        ArchivoPlano archivo = new ArchivoPlano();
        ArrayList<String> lineas = new ArrayList<>();

        for (Persona p : personalRegistrado.values()) {
            lineas.add(p.toString());
        }

        archivo.escribir(rutaArchivo, lineas);
    }
    
    public void guardarTiquetesEnArchivo(String rutaArchivo) {
        ArchivoPlano archivo = new ArchivoPlano();
        ArrayList<String> lineas = new ArrayList<>();

        for (Tiquete t : tiquetesEmitidos.values()) {
            lineas.add(t.toString());
        }

        archivo.escribir(rutaArchivo, lineas);
    }
    
    public void guardarAtraccionesEnArchivo(String rutaArchivo) {
        ArchivoPlano archivo = new ArchivoPlano();
        ArrayList<String> lineas = new ArrayList<>();

        for (Atraccion a : atracciones.values()) {
            lineas.add(a.toString());
        }

        archivo.escribir(rutaArchivo, lineas);
    }
    public void guardarEspectaculosEnCSV(String rutaArchivo) {
        ArchivoPlano archivo = new ArchivoPlano();
        ArrayList<String> lineas = new ArrayList<>();

        for (Espectaculo e : espectaculos.values()) {
            lineas.add(e.toString());
        }

        archivo.escribir(rutaArchivo, lineas);
    }

    public HashMap<String, Espectaculo> getEspectaculos() {
        return espectaculos;
    }

	public String getParqueNombre() {
		return parqueNombre;
	}

	public HashMap<String, Persona> getPersonalRegistrado() {
		return personalRegistrado;
	}

	public HashMap<String, Turno> getTurnosDisponibles() {
		return turnosDisponibles;
	}

	public HashMap<String, Atraccion> getAtracciones() {
		return atracciones;
	}

	public HashMap<String, Tiquete> getTiquetesEmitidos() {
		return tiquetesEmitidos;
	}

	
    
}