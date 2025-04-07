package logica.personas;

import java.util.Date;
import java.util.List;

public class Cajero extends Persona {

	/**
	 * @param nombre
	 * @param login
	 * @param password
	 * @param enfermedadesDiscapacidades
	 * @param fechaDeNacimiento
	 * @param peso
	 * @param altura
	 */
	public Cajero(String nombre, String login, String password, List<String> enfermedadesDiscapacidades,
			Date fechaDeNacimiento, int peso, float altura) {
		super(nombre, login, password, enfermedadesDiscapacidades, fechaDeNacimiento, peso, altura);
	}


}