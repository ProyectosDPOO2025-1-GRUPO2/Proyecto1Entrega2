package logica.atracciones;

import java.util.ArrayList;

public class AtraccionMecanica extends Atraccion {
    private int alturaMinima;
    private int alturaMaxima;
    private int pesoMinimo;
    private int pesoMaximo;
    private String nivelRiesgo;

    public AtraccionMecanica(int id, String nombre, String ubicacion, int cupoMaximo, int empleadosMinimos,
                              String nivelExclusividad, ArrayList<String> restricciones, Temporada temporada,
                              int alturaMinima, int alturaMaxima, int pesoMinimo, int pesoMaximo, String nivelRiesgo) {
        super(id, nombre, ubicacion, cupoMaximo, empleadosMinimos, nivelExclusividad, restricciones, temporada);
        this.alturaMinima = alturaMinima;
        this.alturaMaxima = alturaMaxima;
        this.pesoMinimo = pesoMinimo;
        this.pesoMaximo = pesoMaximo;
        this.nivelRiesgo = nivelRiesgo;
    }

    public int getAlturaMinima() {
        return alturaMinima;
    }

    public int getAlturaMaxima() {
        return alturaMaxima;
    }

    public int getPesoMinimo() {
        return pesoMinimo;
    }

    public int getPesoMaximo() {
        return pesoMaximo;
    }

    public String getNivelRiesgo() {
        return nivelRiesgo;
    }
    
    @Override
    public String toString() {
        return "mecanica"+ ";" + super.toString() + ";" + alturaMinima + ";" + alturaMaxima + ";" + pesoMinimo + ";" + pesoMaximo + ";" + nivelRiesgo;
    }
}