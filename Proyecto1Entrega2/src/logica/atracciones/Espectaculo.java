package logica.atracciones;

import java.time.LocalDateTime;

public class Espectaculo {

    public String id;           
    protected String nombre;        
    protected LocalDateTime horario;
    protected Temporada temporada;

	/**
	 * @param id
	 * @param nombre
	 * @param horario
	 * @param temporada
	 */
	public Espectaculo(String id, String nombre, LocalDateTime horario, Temporada temporada) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.horario = horario;
		this.temporada = temporada;
	}

	public LocalDateTime getHorario() {
        return horario;
    }
	
	@Override
	public String toString() {
	    return id + ";" + nombre + ";" + horario + ";" + (temporada != null ? temporada.getNombre() : "sin-temporada");
	}
}