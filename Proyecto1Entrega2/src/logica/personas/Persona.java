package logica.personas;

import java.util.List;

public abstract class Persona {
	
	protected String nombre;
    protected String login;
    protected String password;
    protected List<String> enfermedadesDiscapacidades;
	/**
	 * @param nombre
	 * @param login
	 * @param password
	 * @param enfermedadesDiscapacidades
	 */
	public Persona(String nombre, String login, String password, List<String> enfermedadesDiscapacidades) {
		super();
		this.nombre = nombre;
		this.login = login;
		this.password = password;
		this.enfermedadesDiscapacidades = enfermedadesDiscapacidades;
	}
    
}
