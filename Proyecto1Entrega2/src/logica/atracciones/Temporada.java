package logica.atracciones;

import java.time.LocalDateTime;

public class Temporada {

    protected String nombreTemporada;  
    protected LocalDateTime fechaInicio; 
    protected LocalDateTime fechaFin;
	/**
	 * @param nombreTemporada
	 * @param fechaInicio
	 * @param fechaFin
	 */
	public Temporada(String nombreTemporada, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		super();
		this.nombreTemporada = nombreTemporada;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}    
    
    
    
}