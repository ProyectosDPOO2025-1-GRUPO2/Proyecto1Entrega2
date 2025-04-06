package logica.atracciones;

import java.util.List;

import logica.personas.OperadorAtracciones;

public class AtraccionMecanica extends Atraccion {

    protected int alturaMinima;   
    protected int alturaMaxima;   
    protected int pesoMinimo;     
    protected int pesoMaximo;
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
	 * @param alturaMinima
	 * @param alturaMaxima
	 * @param pesoMinimo
	 * @param pesoMaximo
	 */
	public AtraccionMecanica(String id, String nombre, String ubicacion, int cupoMaximo, int empleadosMinimos,
			String nivelExclusividad, List<String> restricciones, boolean temporadaDisponible, String nivelRiesgo,
			List<OperadorAtracciones> operadores, int alturaMinima, int alturaMaxima, int pesoMinimo, int pesoMaximo) {
		super(id, nombre, ubicacion, cupoMaximo, empleadosMinimos, nivelExclusividad, restricciones,
				temporadaDisponible, nivelRiesgo, operadores);
		this.alturaMinima = alturaMinima;
		this.alturaMaxima = alturaMaxima;
		this.pesoMinimo = pesoMinimo;
		this.pesoMaximo = pesoMaximo;
	}
	
    
}