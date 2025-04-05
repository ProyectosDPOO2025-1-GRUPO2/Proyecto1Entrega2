package logica.tiquetes;

public class TiqueteRegular extends Tiquete {
    // Atributos específicos de TiqueteRegular
    protected String nivelExclusividad; // Nivel de exclusividad: Familiar, Oro, Diamante

	/**
	 * @param id
	 * @param estado
	 * @param nivelExclusividad
	 */
	public TiqueteRegular(int id, boolean estado, String nivelExclusividad) {
		super(id, estado);
		this.nivelExclusividad = nivelExclusividad;
	}
    
}
