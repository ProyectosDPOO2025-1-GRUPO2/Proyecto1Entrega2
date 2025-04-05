package logica.tiquetes;

public abstract class Tiquete {
    // Atributos comunes a todos los tiquetes
    protected int id;              // ID único del tiquete
    protected boolean estado;      // Estado del tiquete (activo o usado)
	/**
	 * @param id
	 * @param estado
	 */
	public Tiquete(int id, boolean estado) {
		super();
		this.id = GeneradorId.generarTicketID();
		this.estado = estado;
	}
    
}