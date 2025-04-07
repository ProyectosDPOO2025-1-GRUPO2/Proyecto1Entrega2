package logica.tiquetes;

import logica.atracciones.Atraccion;

public class TiqueteRegular extends Tiquete {
    private String nivelExclusividad;

    public TiqueteRegular(int id, boolean estado, String nivelExclusividad) {
        super(id, estado);
        this.nivelExclusividad = nivelExclusividad;
    }

    @Override
    public boolean permiteAcceso(Atraccion atraccion) {
        String nivelTiquete = this.nivelExclusividad.toLowerCase();
        String nivelAtraccion = atraccion.getNivelExclusividad().toLowerCase();

        int valorTiquete = convertirNivelANumero(nivelTiquete);
        int valorAtraccion = convertirNivelANumero(nivelAtraccion);

        if (nivelTiquete.equals("basico")) {
            return false;
        }

        return valorTiquete >= valorAtraccion;
    }

    private int convertirNivelANumero(String nivel) {
        switch (nivel) {
            case "familiar":
                return 1;
            case "oro":
                return 2;
            case "diamante":
                return 3;
            default:
                return 0;
        }
    }

    public String getNivelExclusividad() {
        return nivelExclusividad;
    }

    public void setNivelExclusividad(String nivelExclusividad) {
        this.nivelExclusividad = nivelExclusividad;
    }
}