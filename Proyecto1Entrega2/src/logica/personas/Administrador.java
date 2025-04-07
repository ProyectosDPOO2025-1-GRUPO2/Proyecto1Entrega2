package logica.personas;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import logica.atracciones.Atraccion;
import logica.atracciones.Espectaculo;
import logica.tiquetes.Tiquete;

public class Administrador extends Persona {
	
	private String parqueNombre;

    private HashMap<String, Persona> personalRegistrado;            // login → Persona
    private HashMap<String, Turno> turnosDisponibles;               // ID → Turno
    private HashMap<String, Atraccion> atracciones;                 // ID → Atracción
    private HashMap<String, Espectaculo> espectaculos;             // ID → Espectáculo
    private HashMap<String, Tiquete> tiquetesEmitidos;             // Ticket ID → Nombre comprador
    private HashMap<String, Turno> turnosAsignados;                // login → Turno
    

	
	/**
	 * @param nombre
	 * @param login
	 * @param password
	 * @param enfermedadesDiscapacidades
	 * @param fechaDeNacimiento
	 * @param peso
	 * @param altura
	 * @param parqueNombre
	 * @param personalRegistrado
	 * @param turnosDisponibles
	 * @param atracciones
	 * @param espectaculos
	 * @param tiquetesEmitidos
	 * @param turnosAsignados
	 */
	public Administrador(String nombre, String login, String password, List<String> enfermedadesDiscapacidades,
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

	//metodos
	
	public void registrarPersona(Persona persona) {
	    personalRegistrado.put(persona.getLogin(), persona);
	}
	
	public void eliminarPersona(String login) {
	    personalRegistrado.remove(login);
	}
	
	public Persona obtenerPersona(String login) {
	    return personalRegistrado.get(login);
	}
	
	public List<Persona> obtenerTodoElPersonal() {
        return new ArrayList<>(personalRegistrado.values());
    }
	public void asignarTurno(String login, boolean apertura, boolean cierre, String lugar, String tarea) {
        Persona persona = personalRegistrado.get(login);
        if (persona != null) {
            Turno turno = new Turno(apertura, cierre, lugar, tarea);
            turnosAsignados.put(login, turno);
        }
    }
	public Turno consultarTurno(String login) {
        return turnosAsignados.get(login);
    }
	  // === Gestión de Atracciones ===
	public void registrarAtraccion(Atraccion atraccion) {
        atracciones.put(atraccion.getId(), atraccion);
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
}
