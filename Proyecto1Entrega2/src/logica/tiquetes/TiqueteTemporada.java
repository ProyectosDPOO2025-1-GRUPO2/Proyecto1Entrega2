package logica.tiquetes;

import java.time.LocalDateTime;
import logica.atracciones.Atraccion;

public class TiqueteTemporada extends Tiquete {
    private LocalDateTime inicio;
    private LocalDateTime fin;

    public TiqueteTemporada(int id, boolean estado, LocalDateTime inicio, LocalDateTime fin) {
        super(id, estado);
        this.inicio = inicio;
        this.fin = fin;
    }

    @Override
    public boolean permiteAcceso(Atraccion atraccion) {
        LocalDateTime ahora = LocalDateTime.now();
        return ahora.isAfter(inicio) && ahora.isBefore(fin);
    }

    @Override
    public boolean estaActivo() {
        return estado;
    }
}