package logica.tiquetes;

import logica.atracciones.Atraccion;

public class TiqueteIndividual extends Tiquete {
    // Atributos específicos de TiqueteIndividual
    protected String nombreAtraccion;  // Nombre de la atracción asociada a este tiquete

	/**
	 * @param id
	 * @param estado
	 * @param nombreAtraccion
	 */
	public TiqueteIndividual(int id, boolean estado, String nombreAtraccion) {
		super(id, estado);
		this.nombreAtraccion = nombreAtraccion;
	}

	@Override
	public boolean permiteAcceso(Atraccion atraccion) {
		// TODO Auto-generated method stub
		return false;
	}
    
}
