package logica.personas;

import java.util.List;

public class Administrador extends Persona {

	/**
	 * @param nombre
	 * @param login
	 * @param password
	 * @param enfermedadesDiscapacidades
	 */
	public Administrador(String nombre, String login, String password, List<String> enfermedadesDiscapacidades) {
		super(nombre, login, password, enfermedadesDiscapacidades);
	}
    // Atributos específicos de Administrador (heredados de Persona)
    // No se agregan atributos adicionales para el Administrador en esta etapa
	
}
