package logica.personas;

import java.util.List;

public class OperadorAtracciones extends Persona {
    // Atributos específicos de OperadorAtracciones (heredados de Persona)
    protected String nivelRiesgoCapacitado; // Nivel de riesgo para el que el operador está capacitado

	/**
	 * @param nombre
	 * @param login
	 * @param password
	 * @param enfermedadesDiscapacidades
	 * @param nivelRiesgoCapacitado
	 */
	public OperadorAtracciones(String nombre, String login, String password, List<String> enfermedadesDiscapacidades,
			String nivelRiesgoCapacitado) {
		super(nombre, login, password, enfermedadesDiscapacidades);
		this.nivelRiesgoCapacitado = nivelRiesgoCapacitado;
	}
    
}