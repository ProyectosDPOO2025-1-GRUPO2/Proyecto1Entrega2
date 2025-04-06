package logica.personas;

import java.util.List;

public class Cocinero extends Persona {
    // Atributos específicos de Cocinero (heredados de Persona)
    protected boolean capacitadoAlimentos; // Si el cocinero está capacitado para manipular alimentos

	/**
	 * @param nombre
	 * @param login
	 * @param password
	 * @param enfermedadesDiscapacidades
	 * @param capacitadoAlimentos
	 */
	public Cocinero(String nombre, String login, String password, List<String> enfermedadesDiscapacidades,
			boolean capacitadoAlimentos) {
		super(nombre, login, password, enfermedadesDiscapacidades);
		this.capacitadoAlimentos = capacitadoAlimentos;
	}
    
}