package logica.atracciones;

import java.util.List;

import logica.personas.OperadorAtracciones;

public abstract class Atraccion {
	
    protected int id;                        
    protected String nombre;                 
    protected String ubicacion;              
    protected int cupoMaximo;              
    protected int empleadosMinimos;          
    protected String nivelExclusividad;      
    protected List<String> restricciones;    /*primero la altura minima y max y peso igual despues lo del clima */
    protected boolean temporadaDisponible;   
    protected String nivelRiesgo;   
    protected List<OperadorAtracciones> operadores;
}