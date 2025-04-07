package logica.tiquetes;

import java.util.Date;

import logica.atracciones.Atraccion;

public class FastPass extends Tiquete {
    // Atributos específicos de FastPass
    protected Date diaUso;  // Día específico en que el cliente puede usar el FastPass

	/**
	 * @param id
	 * @param estado
	 * @param diaUso
	 */
	public FastPass(int id, boolean estado, Date diaUso) {
		super(id, estado);
		this.diaUso = diaUso;
	}

	@Override
	public boolean permiteAcceso(Atraccion atraccion) {
		// TODO Auto-generated method stub
		return false;
	}
    
	
}