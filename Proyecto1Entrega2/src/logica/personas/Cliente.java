package logica.personas;

import java.util.Date;
import java.util.List;

public class Cliente extends Persona{
	
	protected List<Integer> tiquetesComprados;

	/**
	 * @param nombre
	 * @param login
	 * @param password
	 * @param enfermedadesDiscapacidades
	 * @param fechaDeNacimiento
	 * @param peso
	 * @param tiquetesComprados
	 */
	public Cliente(String nombre, String login, String password, List<String> enfermedadesDiscapacidades,
			Date fechaDeNacimiento, int peso, List<Integer> tiquetesComprados) {
		super(nombre, login, password, enfermedadesDiscapacidades, fechaDeNacimiento, peso);
		this.tiquetesComprados = tiquetesComprados;
	}


}
