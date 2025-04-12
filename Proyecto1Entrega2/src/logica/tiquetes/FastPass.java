package logica.tiquetes;

import logica.atracciones.Atraccion;

public class FastPass extends Tiquete {
    private String nivelExclusividad;

    public FastPass(int id, boolean estado, String nivelExclusividad) {
        super(id, estado);
        this.nivelExclusividad = nivelExclusividad;
    }

    @Override
    public boolean permiteAcceso(Atraccion atraccion) {
        return true; // FastPass permite acceso universal
    }

    @Override
    public boolean estaActivo() {
        return estado;
    }
}