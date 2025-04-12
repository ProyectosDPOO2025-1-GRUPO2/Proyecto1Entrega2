package logica.atracciones;

import java.util.ArrayList;

public class AtraccionCultural extends Atraccion {
    private int edadMinima;

    public AtraccionCultural(int id, String nombre, String ubicacion, int cupoMaximo, int empleadosMinimos,
                              String nivelExclusividad, ArrayList<String> restricciones, Temporada temporada,
                              int edadMinima) {
        super(id, nombre, ubicacion, cupoMaximo, empleadosMinimos, nivelExclusividad, restricciones, temporada);
        this.edadMinima = edadMinima;
    }

    public int getEdadMinima() {
        return edadMinima;
    }
}