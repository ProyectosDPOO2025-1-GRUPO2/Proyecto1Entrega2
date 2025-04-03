package atracciones;

import java.util.List;

public abstract class Atraccion {
	
    protected int id;                        
    protected String nombre;                 
    protected String ubicacion;              
    protected int cupoMaximo;              
    protected int empleadosMinimos;          
    protected String nivelExclusividad;      
    protected List<String> restricciones;    
    protected boolean temporadaDisponible;   
    protected String nivelRiesgo;            
}