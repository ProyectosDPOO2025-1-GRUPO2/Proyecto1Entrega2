package logica.personas;

import java.util.Date;
import java.util.List;

public class Administrador extends Persona {

	/**
	 * @param nombre
	 * @param login
	 * @param password
	 * @param enfermedadesDiscapacidades
	 * @param fechaDeNacimiento
	 * @param peso
	 */
	public Administrador(String nombre, String login, String password, List<String> enfermedadesDiscapacidades,
			Date fechaDeNacimiento, int peso) {
		super(nombre, login, password, enfermedadesDiscapacidades, fechaDeNacimiento, peso);
	}

	
}
