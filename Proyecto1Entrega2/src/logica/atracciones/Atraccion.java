package logica.atracciones;

import java.time.LocalDateTime;
import java.util.ArrayList;

import logica.personas.OperadorAtracciones;

public abstract class Atraccion {
    protected int id;
    protected String nombre;
    protected String ubicacion;
    protected int cupoMaximo;
    protected int empleadosMinimos;
    protected String nivelExclusividad;
    protected ArrayList<String> restricciones;
    protected Temporada temporada;
    protected ArrayList<OperadorAtracciones> operadores;

    public Atraccion(int id, String nombre, String ubicacion, int cupoMaximo, int empleadosMinimos,
                     String nivelExclusividad, ArrayList<String> restricciones, Temporada temporada) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.cupoMaximo = cupoMaximo;
        this.empleadosMinimos = empleadosMinimos;
        this.nivelExclusividad = nivelExclusividad;
        this.restricciones = restricciones;
        this.temporada = temporada;
        this.operadores = new ArrayList<>();
    }

    public int getId() {
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

    public ArrayList<String> getRestricciones() {
        return restricciones;
    }

    public Temporada getTemporada() {
        return temporada;
    }

    public boolean isDisponibleEnTemporada(LocalDateTime fecha) {
        if (temporada == null) {
            return true;
        }
        return temporada.estaActivaEn(fecha);
    }

    public ArrayList<OperadorAtracciones> getOperadores() {
        return operadores;
    }
    
    @Override
    public String toString() {
        return "generica" + ";" + id + ";" + nombre + ";" + ubicacion + ";" + cupoMaximo + ";" + empleadosMinimos + ";" +
    nivelExclusividad + ";" + String.join(",", restricciones) + ";" + (temporada != null ? temporada.getNombre() : "sin-temporada");
    }
    
}
