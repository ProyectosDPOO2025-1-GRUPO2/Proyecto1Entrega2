package presentacion;

import logica.personas.*;
import logica.atracciones.*;
import logica.tiquetes.*;
import persistencia.ArchivoPlano;

import java.time.LocalDateTime;
import java.util.*;

public class Principal {
    public static void main(String[] args) {
        // Crear administrador con mapas vacíos
        Administrador admin = new Administrador(
            "Admin", "admin", "admin123", new ArrayList<>(),
            new Date(), 70, 1.75f, "Parque Diversiones",
            new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>()
        );

        // === Personas ===
        ArrayList<String> jpenfermedades = new ArrayList<String>();
        jpenfermedades.add("asma");
        Persona cliente = new Cliente("Juan Pérez", "jp", "123", jpenfermedades, new Date(), 65, 1.68f);
        Persona cajero = new Cajero("Ana López", "al", "456", new ArrayList<>(), new Date(), 60, 1.60f);
        Persona operador = new OperadorAtracciones("Luis Gómez", "lg", "789", new ArrayList<>(), new Date(), 75, 1.80f, "alto");

        admin.registrarPersona(cliente);
        admin.registrarPersona(cajero);
        admin.registrarPersona(operador);

        // === Atracciones ===
        ArrayList<String> restricciones = new ArrayList<>(Arrays.asList("120", "200", "40", "90", "vertigo"));
        Temporada temporada = new Temporada("Verano", LocalDateTime.of(2025, 6, 1, 0, 0), LocalDateTime.of(2025, 8, 31, 23, 59));

        Atraccion mecanica = new AtraccionMecanica(1, "Montaña Rusa", "Zona A", 50, 3, "oro", restricciones, temporada, 120, 200, 40, 90, "alto");
        Atraccion cultural = new AtraccionCultural(2, "Casa del Terror", "Zona B", 30, 2, "familiar", new ArrayList<>(), temporada, 13);
        admin.registrarAtraccion(mecanica);
        admin.registrarAtraccion(cultural);

        // === Espectáculos ===
        Espectaculo show = new Espectaculo("ESP001", "Show de luces", LocalDateTime.of(2025, 7, 15, 20, 0), temporada);
        admin.getEspectaculos().put(show.id, show);  // O usa admin.registrarEspectaculo(show); si tienes ese método

        // === Tiquetes ===
        Tiquete fastpass = new FastPass(101, true, "diamante");
        Tiquete regular = new TiqueteRegular(102, true, "oro");
        Tiquete temporadaT = new TiqueteTemporada(103, true, LocalDateTime.of(2025, 6, 1, 0, 0), LocalDateTime.of(2025, 6, 30, 0, 0));
        Tiquete individual = new TiqueteIndividual(104, true, mecanica);

        admin.getTiquetesEmitidos().put("101", fastpass);
        admin.getTiquetesEmitidos().put("102", regular);
        admin.getTiquetesEmitidos().put("103", temporadaT);
        admin.getTiquetesEmitidos().put("104", individual);

        // === Guardar todo en CSV ===
        admin.guardarPersonasEnArchivo("datos/personas.csv");
        admin.guardarAtraccionesEnArchivo("datos/atracciones.csv");
        admin.guardarTiquetesEnArchivo("datos/tiquetes.csv");
        admin.guardarEspectaculosEnCSV("datos/espectaculos.csv");

        System.out.println("Todos los archivos CSV se han guardado correctamente.");
    }
}