package logica.atracciones;

import java.util.List;

import logica.personas.OperadorAtracciones;

public class AtraccionCultural extends Atraccion {

    protected int edadMinima;

	/**
	 * @param id
	 * @param nombre
	 * @param ubicacion
	 * @param cupoMaximo
	 * @param empleadosMinimos
	 * @param nivelExclusividad
	 * @param restricciones
	 * @param temporadaDisponible
	 * @param nivelRiesgo
	 * @param operadores
	 * @param edadMinima
	 */
	public AtraccionCultural(String id, String nombre, String ubicacion, int cupoMaximo, int empleadosMinimos,
			String nivelExclusividad, List<String> restricciones, boolean temporadaDisponible, String nivelRiesgo,
			List<OperadorAtracciones> operadores, int edadMinima) {
		super(id, nombre, ubicacion, cupoMaximo, empleadosMinimos, nivelExclusividad, restricciones,
				temporadaDisponible, nivelRiesgo, operadores);
		this.edadMinima = edadMinima;
	}

	
 

}