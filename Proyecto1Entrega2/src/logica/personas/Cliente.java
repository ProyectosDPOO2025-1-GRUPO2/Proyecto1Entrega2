package logica.personas;

import java.util.List;

public class Cliente extends Persona{
	
	protected List<Integer> tiquetesComprados;

	/**
	 * @param nombre
	 * @param login
	 * @param password
	 * @param enfermedadesDiscapacidades
	 * @param tiquetesComprados
	 */
	public Cliente(String nombre, String login, String password, List<String> enfermedadesDiscapacidades,
			List<Integer> tiquetesComprados) {
		super(nombre, login, password, enfermedadesDiscapacidades);
		this.tiquetesComprados = tiquetesComprados;
	}

}
