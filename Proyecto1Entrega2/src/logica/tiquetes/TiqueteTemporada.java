package logica.tiquetes;

import java.util.Date;

import logica.atracciones.Atraccion;

public class TiqueteTemporada extends Tiquete {
    // Atributos específicos de TiqueteTemporada
    protected Date fechaInicio;  // Fecha de inicio de la temporada
    protected Date fechaFin;     // Fecha de fin de la temporada
	/**
	 * @param id
	 * @param estado
	 * @param fechaInicio
	 * @param fechaFin
	 */
	public TiqueteTemporada(int id, boolean estado, Date fechaInicio, Date fechaFin) {
		super(id, estado);
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}
	@Override
	public boolean permiteAcceso(Atraccion atraccion) {
		// TODO Auto-generated method stub
		return false;
	}
    
}