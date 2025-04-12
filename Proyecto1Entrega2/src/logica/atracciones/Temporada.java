package logica.atracciones;

import java.time.LocalDateTime;

public class Temporada {
    private String nombre;
    private LocalDateTime inicio;
    private LocalDateTime fin;

    public Temporada(String nombre, LocalDateTime inicio, LocalDateTime fin) {
        this.nombre = nombre;
        this.inicio = inicio;
        this.fin = fin;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public LocalDateTime getFin() {
        return fin;
    }

    public boolean estaActivaEn(LocalDateTime fecha) {
        return (fecha != null) && !fecha.isBefore(inicio) && !fecha.isAfter(fin);
    }
}
    
    