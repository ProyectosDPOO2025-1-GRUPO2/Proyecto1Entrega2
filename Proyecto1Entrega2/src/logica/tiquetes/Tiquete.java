package logica.tiquetes;

import logica.atracciones.Atraccion;

public abstract class Tiquete {
    protected int id;              // ID único del tiquete
    protected boolean estado;      // Estado del tiquete (activo o usado)

    public Tiquete(int id, boolean estado) {
        this.id = GeneradorId.generarTicketID();
        this.estado = estado;
    }

    // Método abstracto que las subclases deben implementar
    public abstract boolean permiteAcceso(Atraccion atraccion);
}