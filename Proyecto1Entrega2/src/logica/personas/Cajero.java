package logica.personas;

import java.util.List;

public class Cajero extends Persona {

	/**
	 * @param nombre
	 * @param login
	 * @param password
	 * @param enfermedadesDiscapacidades
	 */
	public Cajero(String nombre, String login, String password, List<String> enfermedadesDiscapacidades) {
		super(nombre, login, password, enfermedadesDiscapacidades);
	}
    // Atributos específicos de Cajero (heredados de Persona)
    // No se agregan atributos adicionales para el Cajero en esta etapa
	
}