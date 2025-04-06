package logica.atracciones;

import java.time.LocalDateTime;
import java.util.List;

import logica.personas.OperadorAtracciones;

public class Espectaculo {

    protected String id;           
    protected String nombre;        
    protected LocalDateTime horario;
	/**
	 * @param id
	 * @param nombre
	 * @param horario
	 */
	public Espectaculo(String id, String nombre, LocalDateTime horario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.horario = horario;
	}
	
}