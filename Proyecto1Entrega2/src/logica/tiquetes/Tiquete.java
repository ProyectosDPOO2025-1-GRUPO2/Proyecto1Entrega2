package logica.tiquetes;

import logica.atracciones.Atraccion;

public abstract class Tiquete {
    protected int id;              // ID único del tiquete
    protected boolean estado;      // Estado del tiquete (activo o usado)

    public Tiquete(int id, boolean estado) {
        this.id = GeneradorId.generarTicketID();
        this.estado = estado;
    }

    public abstract boolean permiteAcceso(Atraccion atraccion);

    public abstract boolean estaActivo();

    public int getId() {
        return id;
    }

    public boolean getEstado() {
        return estado;
    }

    public void usar() {
        this.estado = false;
    }
}