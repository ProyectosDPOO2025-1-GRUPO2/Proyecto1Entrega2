package logica.tiquetes;

import logica.atracciones.Atraccion;

public class TiqueteRegular extends Tiquete {
    private String nivelExclusividad;

    public TiqueteRegular(int id, boolean estado, String nivelExclusividad) {
        super(id, estado);
        this.nivelExclusividad = nivelExclusividad;
    }

    public String getNivelExclusividad() {
        return nivelExclusividad;
    }

    @Override
    public boolean permiteAcceso(Atraccion atraccion) {
        String nivelAtraccion = atraccion.getNivelExclusividad();
        int valorTiquete = convertir(nivelExclusividad);
        int valorAtraccion = convertir(nivelAtraccion);
        return valorTiquete >= valorAtraccion;
    }

    @Override
    public boolean estaActivo() {
        return estado;
    }

    private int convertir(String nivel) {
        switch (nivel.toLowerCase()) {
            case "familiar": return 1;
            case "oro": return 2;
            case "diamante": return 3;
            default: return 0;
        }
    }
    
    @Override
    public String toString() {
        return "regular" + ";" + id + ";" + estado + ";" + nivelExclusividad;
    }
}
