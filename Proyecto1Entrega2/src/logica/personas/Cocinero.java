package logica.personas;

import java.util.Date;
import java.util.List;

public class Cocinero extends Persona {
    // Atributos específicos de Cocinero (heredados de Persona)
    protected boolean capacitadoAlimentos; // Si el cocinero está capacitado para manipular alimentos

	/**
	 * @param nombre
	 * @param login
	 * @param password
	 * @param enfermedadesDiscapacidades
	 * @param fechaDeNacimiento
	 * @param peso
	 * @param capacitadoAlimentos
	 */
	public Cocinero(String nombre, String login, String password, List<String> enfermedadesDiscapacidades,
			Date fechaDeNacimiento, int peso, boolean capacitadoAlimentos) {
		super(nombre, login, password, enfermedadesDiscapacidades, fechaDeNacimiento, peso);
		this.capacitadoAlimentos = capacitadoAlimentos;
	}

	
    
}