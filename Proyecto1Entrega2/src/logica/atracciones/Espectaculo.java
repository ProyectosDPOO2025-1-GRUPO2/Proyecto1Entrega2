package logica.atracciones;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Espectaculo extends Atraccion {
    private LocalDateTime horario;

    public Espectaculo(int id, String nombre, int cupoMaximo, int empleadosMinimos,
                       String nivelExclusividad, ArrayList<String> restricciones, Temporada temporada,
                       LocalDateTime horario) {
        super(id, nombre, "variable", cupoMaximo, empleadosMinimos, nivelExclusividad, restricciones, temporada);
        this.horario = horario;
    }

    public LocalDateTime getHorario() {
        return horario;
    }
}