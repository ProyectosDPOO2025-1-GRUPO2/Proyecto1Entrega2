package logica.personas;

import java.util.Date;
import java.util.List;

public abstract class Persona {
	
	protected String nombre;
    protected String login;
    protected String password;
    protected List<String> enfermedadesDiscapacidades;
    protected Date fechaDeNacimiento;
    protected int peso;
	/**
	 * @param nombre
	 * @param login
	 * @param password
	 * @param enfermedadesDiscapacidades
	 * @param fechaDeNacimiento
	 * @param peso
	 */
	public Persona(String nombre, String login, String password, List<String> enfermedadesDiscapacidades,
			Date fechaDeNacimiento, int peso) {
		super();
		this.nombre = nombre;
		this.login = login;
		this.password = password;
		this.enfermedadesDiscapacidades = enfermedadesDiscapacidades;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.peso = peso;
	}
	public String getNombre() {
		return nombre;
	}
	public String getLogin() {
		return login;
	}
	public String getPassword() {
		return password;
	}
	public List<String> getEnfermedadesDiscapacidades() {
		return enfermedadesDiscapacidades;
	}
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public int getPeso() {
		return peso;
	}
	
    
}
