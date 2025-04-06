package logica.personas;

public class Turno {
	private boolean apertura;
	private boolean cierre;
	private String lugar;
	private String tarea;
	/**
	 * @param apertura
	 * @param cierre
	 * @param lugar
	 * @param tarea
	 */
	public Turno(boolean apertura, boolean cierre, String lugar, String tarea) {
		super();
		this.apertura = apertura;
		this.cierre = cierre;
		this.lugar = lugar;
		this.tarea = tarea;
	}
	
	
	
}
