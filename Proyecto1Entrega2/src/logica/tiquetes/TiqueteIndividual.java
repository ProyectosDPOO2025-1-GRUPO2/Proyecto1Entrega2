package logica.tiquetes;

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
    
}
