package logica.tiquetes;

import logica.atracciones.Atraccion;

public class TiqueteIndividual extends Tiquete {
    private Atraccion atraccionPermitida;

    public TiqueteIndividual(int id, boolean estado, Atraccion atraccionPermitida) {
        super(id, estado);
        this.atraccionPermitida = atraccionPermitida;
    }

    @Override
    public boolean permiteAcceso(Atraccion atraccion) {
        return atraccion.equals(atraccionPermitida);
    }

    @Override
    public boolean estaActivo() {
        return estado;
    }
    @Override
    public String toString() {
        return "individual" + ";" + id + ";" + estado + ";" + atraccionPermitida.getNombre();
    }
}