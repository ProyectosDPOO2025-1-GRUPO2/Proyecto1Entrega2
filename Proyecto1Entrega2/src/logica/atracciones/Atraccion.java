package logica.atracciones;

import java.util.List;

import logica.personas.OperadorAtracciones;

public abstract class Atraccion {
	
    protected String id;                        
    protected String nombre;                 
    protected String ubicacion;              
    protected int cupoMaximo;              
    protected int empleadosMinimos;          
    protected String nivelExclusividad;      
    protected List<String> restricciones;    /*primero la altura minima y max y peso igual despues lo del clima */
    protected boolean temporadaDisponible;   
    protected String nivelRiesgo;   
    protected List<OperadorAtracciones> operadores;
	/**
	 * @param id
	 * @param nombre
	 * @param ubicacion
	 * @param cupoMaximo
	 * @param empleadosMinimos
	 * @param nivelExclusividad
	 * @param restricciones
	 * @param temporadaDisponible
	 * @param nivelRiesgo
	 * @param operadores
	 */
	public Atraccion(String id, String nombre, String ubicacion, int cupoMaximo, int empleadosMinimos,
			String nivelExclusividad, List<String> restricciones, boolean temporadaDisponible, String nivelRiesgo,
			List<OperadorAtracciones> operadores) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.cupoMaximo = cupoMaximo;
		this.empleadosMinimos = empleadosMinimos;
		this.nivelExclusividad = nivelExclusividad;
		this.restricciones = restricciones;
		this.temporadaDisponible = temporadaDisponible;
		this.nivelRiesgo = nivelRiesgo;
		this.operadores = operadores;
	}
	public String getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public int getCupoMaximo() {
		return cupoMaximo;
	}
	public int getEmpleadosMinimos() {
		return empleadosMinimos;
	}
	public String getNivelExclusividad() {
		return nivelExclusividad;
	}
	public List<String> getRestricciones() {
		return restricciones;
	}
	public boolean isTemporadaDisponible() {
		return temporadaDisponible;
	}
	public String getNivelRiesgo() {
		return nivelRiesgo;
	}
	public List<OperadorAtracciones> getOperadores() {
		return operadores;
	}
	
    
    
}