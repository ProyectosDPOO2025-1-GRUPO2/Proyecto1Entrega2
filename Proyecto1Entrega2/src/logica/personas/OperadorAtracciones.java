package logica.personas;

import java.util.Date;
import java.util.List;

public class OperadorAtracciones extends Persona {
    // Atributos específicos de OperadorAtracciones (heredados de Persona)
    protected String nivelRiesgoCapacitado; // Nivel de riesgo para el que el operador está capacitado

	/**
	 * @param nombre
	 * @param login
	 * @param password
	 * @param enfermedadesDiscapacidades
	 * @param fechaDeNacimiento
	 * @param peso
	 * @param nivelRiesgoCapacitado
	 */
	public OperadorAtracciones(String nombre, String login, String password, List<String> enfermedadesDiscapacidades,
			Date fechaDeNacimiento, int peso, String nivelRiesgoCapacitado) {
		super(nombre, login, password, enfermedadesDiscapacidades, fechaDeNacimiento, peso);
		this.nivelRiesgoCapacitado = nivelRiesgoCapacitado;
	}

	public String getNivelRiesgoCapacitado() {
		return nivelRiesgoCapacitado;
	}

	public void setNivelRiesgoCapacitado(String nivelRiesgoCapacitado) {
		this.nivelRiesgoCapacitado = nivelRiesgoCapacitado;
	}

	
    
}